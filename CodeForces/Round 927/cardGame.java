import java.util.*;
public class cardGame{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		for(int i = 0; i < T; i++){
			int N = input.nextInt();
			String trump = input.next();

			ArrayList<String> trumpCards = new ArrayList<>();
			ArrayList<String> clubs = new ArrayList<>();
			ArrayList<String> hearts = new ArrayList<>();
			ArrayList<String> diamonds = new ArrayList<>();
			ArrayList<String> spades = new ArrayList<>();
			ArrayList<ArrayList<String>> otherCards = new ArrayList<>();
			ArrayList<String> remaining = new ArrayList<>();

			for(int x = 0; x < 2*N; x++){
				String card = input.next();

				if((card.substring(1)).equals("C")) clubs.add(card);

				if((card.substring(1)).equals("H")) hearts.add(card);

				if((card.substring(1)).equals("D")) diamonds.add(card);

				if((card.substring(1)).equals("S")) spades.add(card);
			}

			Collections.sort(clubs);
			Collections.sort(hearts);
			Collections.sort(diamonds);
			Collections.sort(spades);

			if(!trump.equals("C")) otherCards.add(clubs);
			else trumpCards.addAll(clubs);

			if(!trump.equals("H")) otherCards.add(hearts);
			else trumpCards.addAll(hearts);

			if(!trump.equals("D")) otherCards.add(diamonds);
			else trumpCards.addAll(diamonds);

			if(!trump.equals("S")) otherCards.add(spades);
			else trumpCards.addAll(spades);

			for(int x = 0; x < 3; x++){

				if((otherCards.get(x)).size() % 2 == 1)
					remaining.add((otherCards.get(x)).get(0));

			}

			if(remaining.size() > trumpCards.size()){
				System.out.println("IMPOSSIBLE");
			}
			else{


				for(int x = 0; x < 3; x++){
					int index = (otherCards.get(x)).size() % 2;
					for(; index < (otherCards.get(x)).size() - 1; index += 2){

						System.out.println((otherCards.get(x)).get(index) + " " + (otherCards.get(x)).get(index + 1));

					}
				}

				for(int x = 0; x < remaining.size();x++){

					System.out.println(remaining.get(x) + " " + trumpCards.get(0));
					trumpCards.remove(0);

				}

				for(int x = 0; x < trumpCards.size();x += 2){
					System.out.println(trumpCards.get(x) + " " + trumpCards.get(x+1));
				}

			}

		}
		



		input.close();
	}


}
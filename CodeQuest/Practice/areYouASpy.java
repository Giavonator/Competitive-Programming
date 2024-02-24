import java.util.*;
public class areYouASpy{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int N = Integer.parseInt(input.nextLine());
		
		for(int i = 0; i < N; i++){
			String[] line = (input.nextLine()).split("\\|");
			//System.out.println("\n AKSJDHFLKSJFH" +line[0] + line[1]);
			line[0] = line[0].toLowerCase();
			line[1] = line[1].toLowerCase();

			char[] greetings = line[0].toCharArray();
			char[] response = line[1].toCharArray();


			for(int x = 0; x < greetings.length; x++){
				//System.out.println("RAHHHHB"+greetings[x]);
			}

			String printable = "abcdefghijklmnopqrstuvwxyz";
			
			HashSet<Character> greet = new HashSet<>();
			HashSet<Character> respond = new HashSet<>();

			for(int x = 0; x < greetings.length; x++){
				if(printable.contains("" + greetings[x])){
					greet.add(greetings[x]);
				}
			}

			for(int x = 0; x < response.length; x++){
				if(printable.contains("" + response[x])){
					respond.add(response[x]);
				}
			}
			
			boolean agent = true;
			ArrayList<Character> responseLetters = new ArrayList<>(respond);
			for(int x = 0; x < responseLetters.size(); x++){
				if(!greet.contains(responseLetters.get(x))){
					System.out.println("You're not a secret agent!");
					agent = false;
					break;
				}
			}
			if(agent)
				System.out.println("That's my secret contact!");

		}

		input.close();
	}


}

import java.util.*;
public class g{

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		String str = input.next();
		int n = str.length();
		String[] record = str.split("");
		int rank = 25, winStreak = 0, stars = 0;
		boolean legend = false;
		int[] rankStars = {0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,
							4, 4, 4, 4, 4, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2};

		//For number of games
		for(int i = 0; i < n; i++){

			//For Wins
			if(record[i].equals("W")){
				winStreak++;
				if(winStreak > 2 && rank > 5) stars += 2;
				else {
					stars++;
				}

				if(stars > rankStars[rank]){
					stars = stars - rankStars[rank];
					rank--;
				}

				if(rank == 0){
					System.out.println("Legend");
					legend = true;
					break;
				}
			}

			//For Losses
			else{
				winStreak = 0;
				if(rank > 20){}

				else{
					if(rank == 20 && stars == 0){}
					else{
						stars--;
						if(stars == -1){
							rank++;
							stars = rankStars[rank] - 1;
						}
					}
				}
			}
		}

		if(!legend){
			System.out.println(rank);
		}


		input.close();
	}
}
import java.util.*;
public class l{

	public static int[] allTeams;
	public static int[] goTeams;
	public static int counter = 0;
	public static int cap = 0;
	public static int teams = 0;
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		cap = input.nextInt();
		teams = input.nextInt();

		counter = 0;
		allTeams = new int[teams];
		goTeams = new int[teams];
		int sum = 0;

		for(int i = 0; i < teams; i++){
			allTeams[i] = input.nextInt();
			sum += allTeams[i];
		}


		if (cap >= sum){
			for (int i : allTeams){
				System.out.println(i);
			}
		}

		else {
			base(teams);
		
			for (int i = 0; counter != cap; i++){
				if (allTeams[i] != 0){
					goTeams[i]++;
					counter++;
				}
				
			}

			for (int i : goTeams) 
				System.out.println(i);

		}
		input.close();
	}

	public static void base(int add){

		
		if (!(cap < add + counter)){
			counter += add;

			for (int i = 0; i < teams; i++){

				if (allTeams[i] == 0){
					continue;
				}
				allTeams[i]--;
				goTeams[i]++;
				if (allTeams[i] == 0){
					add--;
				}
			}
			
			base(add);
		}
	}

}
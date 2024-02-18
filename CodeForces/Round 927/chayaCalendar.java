import java.util.*;
public class chayaCalendar{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		for(int i = 0; i < T; i++){
			int N = input.nextInt();
			int years = input.nextInt();

			for(int x = 1; x < N; x++){
				int num = input.nextInt();
				years += num - (years % num);

			}
			//System.out.print("HERRERE   ");
			System.out.println(years);

		}
		



		input.close();
	}


}
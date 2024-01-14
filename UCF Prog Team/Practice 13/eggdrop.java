import java.util.*;
public class eggdrop{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int K = input.nextInt();

		int highestSafe = 0;
		int lowestBreak = 101;

		for (int i = 0; i < N; i++){
			int floor = input.nextInt();
			String result = input.next();

			if (result.equals("SAFE")){
				highestSafe = Math.max(highestSafe, floor);
			}
			else{
				lowestBreak = Math.min(lowestBreak, floor);
			}
		}

		if (highestSafe == 0){
			highestSafe = 1;
		}
		if (lowestBreak == 101){
			lowestBreak = K;
		}

		System.out.print("" + (highestSafe + 1) + " " + (lowestBreak - 1));
			

		
		input.close();
	}
}
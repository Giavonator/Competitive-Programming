import java.util.*;
public class timelimits{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int S = input.nextInt();

		double min = -1;
		for(int i = 0; i < N; i++) min = Math.max(min, input.nextInt());

		min *= S;
		min /= 1000;
		min = Math.ceil(min);

	
		System.out.println((int)min);

		
		



		input.close();
	}


}
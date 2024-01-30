import java.util.*;
public class balancingBacteria{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		long patches[] = new long[N+1];

		for(int i  = 1; i <= N; i++){
			patches[i] = input.nextLong();
		}


		long diff = patches[1] * -1;
		long applications = Math.abs(diff);
		applications += Math.abs(diff * 2 + patches[2]);
		diff = (diff * 2 + patches[2]) * -1;

		long baggage = patches[1] * -1;
		long backNums = 0;

		for(int i = 3; i <= N; i++){
			long leading = diff * 2;
			backNums = (diff + patches[i-1]) * -1 + baggage;
			baggage += diff;

			diff = (leading + backNums + patches[i]) * -1;
			applications += Math.abs(diff);
			

			//for(int j  = 1; j <= N; j++){
			//	System.out.print(patches[j] + " ");
			//}
			//System.out.println( "    diff: " + diff);

		}
		System.out.println(applications);


		//if(patches[1] == -1) System.out.println(6);
		//else if (patches[1] == 1) System.out.println(26);
		//else System.out.println(15);

		input.close();
	}


}
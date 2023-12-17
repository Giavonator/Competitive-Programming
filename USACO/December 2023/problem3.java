import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class problem3{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		for (int j = 0; j < T; j++){
			int N = input.nextInt();
			boolean one = false;
			if(N == 1){
				System.out.println(0);
				one = true;
			}

			long[][] plants = new long[N][3];
			//long[i][0] = initial height
			//long[i][1] = growth
			//long[i][2] = # above them
			boolean possible = true;

			for (int i = 0; i < N; i++){
				plants[i][0] = input.nextLong();
			}
			for(int i = 0; i < N; i++){
				plants[i][1] = input.nextLong();
			}

			for(int i = 0; i < N; i++){
				plants[i][2] = input.nextLong();
			}

			if(one) continue;

			Arrays.sort(plants, Comparator.comparingLong(temp -> temp[2]));
			long maxBeforeConversion = Long.MAX_VALUE;

			for (int i = 1; i < N; i++){
				if(plants[i][1] > plants[i-1][1]){

					long beforeConversion = (long)Math.ceil((plants[i-1][0] - plants[i][0]) / (1.0 * (plants[i][1] - plants[i-1][1]))) + 1;
					if (beforeConversion < maxBeforeConversion) maxBeforeConversion = beforeConversion;
				}

				if(plants[i][1] == plants[i-1][1]){
					if(plants[i][0] >= plants[i-1][0]){
						possible = false;
						break;
					}
				}
			}

			if(!possible)System.out.println("-1");
			else{

				long minDays = Integer.MAX_VALUE;
				for(int i = N-1; i > 0; i--){
					if(plants[i][1] != plants[i-1][1]){
						double exact = (Math.abs(plants[i][0] - plants[i-1][0])) / (1.0 * plants[i-1][1] - plants[i][1]);
						if (exact == Math.ceil((Math.abs(plants[i][0] - plants[i-1][0])) / (1.0 * plants[i-1][1] - plants[i][1]))){
							minDays = (long)Math.ceil(exact) + 1;
						}
						else minDays = (long)Math.ceil(exact);
						plants[i][0] += plants[i][1] * minDays;
					}
					else minDays = 0;
				}
				if(minDays > maxBeforeConversion) System.out.println("-1");
				else System.out.println(minDays);
				//System.out.print("\nMINIMUM NUMBER OF DAYS" + minDays);
				//System.out.print("\nSEVEN THING" + plants[1][0]);

			}

			

		}


		input.close();
	}
}
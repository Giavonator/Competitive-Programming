import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class problem3b{

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
			if(minDays == 2147483647){
				System.out.println("-1");
			}
			else System.out.println(minDays);

		}


		input.close();
	}
}
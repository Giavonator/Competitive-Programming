import java.util.Scanner;
public class quests {
	public static void main(String argsp[]){
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		for(int x = 0; x < T; x++){
			long N = input.nextInt();
			long K = input.nextInt();
			long[] firstPoints = new long[(int)N];
			long[] subsequentPoints = new long[(int)N];

			for(int i = 0; i < N; i++){
				firstPoints[i] = input.nextLong();			
			}
			for(int i = 0; i < N; i++){
				subsequentPoints[i] = input.nextLong();			
			}

			long max = 0;

			for(int i = 0; i < K && i < N; i++){
				long current = 0;
				for(int j = 0; j <= i; j++){
					current += firstPoints[j];
				}
				current += subsequentPoints[x] * (K - (i + 1));
				max = Math.max(current, max);
			}

			System.out.println("THIS IS THE MAX" + max);

		}

		input.close();
	}
}

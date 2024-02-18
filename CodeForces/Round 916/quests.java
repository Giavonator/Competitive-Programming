import java.util.Scanner;
public class quests {
	public static void main(String argsp[]){
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		for(int x = 0; x < T; x++){
			long N = input.nextInt();
			long K = input.nextInt();
			long[] firstPoints = new long[(int)N];
			long[] maxSubsequent = new long[(int)N];

			firstPoints[0] = input.nextLong();
			for(int i = 1; i < N; i++){
				firstPoints[i] = input.nextLong() + firstPoints[i-1];			
			}

			maxSubsequent[0] = input.nextLong();	
			for(int i = 1; i < N; i++){
				maxSubsequent[i] = Math.max(input.nextLong(), maxSubsequent[i-1]);	
			}

			long max = 0;
			for(int i = 0; i < K && i < N; i++){
				max = Math.max(firstPoints[i] + (maxSubsequent[i] * (K - i - 1)), max);
			}

			System.out.println(max);

		}

		input.close();
	}
}

import java.util.Scanner;
public class preparingForTheContest {
	public static void main(String argsp[]){
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		for(int x = 0; x < T; x++){
			int N = input.nextInt();
			int K = input.nextInt();

			for(int i = 1; i < (K+1); i++){
				System.out.print(i + " ");
			}

			for(int i = N; i > K; i--){
				System.out.print(i + " ");
			}

			System.out.println();

		}

		input.close();
	}
}

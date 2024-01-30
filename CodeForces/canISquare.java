import java.util.Scanner;
public class canISquare{
	public static void main (String args[]){
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		for(int x = 0; x < T; x++){
			int N = input.nextInt();
			long sum = 0;

			for (int i = 0; i < N; i++){
				sum += input.nextLong();
			}

			if ((Math.sqrt(sum) * 10) % 1 == 0){
				System.out.println("YES");
			}
			else System.out.println("NO");

			

		}

		input.close();
	}
}
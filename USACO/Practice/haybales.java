import java.util.*;
public class haybales{

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int K = input.nextInt();

		int[] values = new int[N + 1];
		for(int i = 0; i < K; i++){
			int l = input.nextInt();
			int r = input.nextInt();
			values[(l-1)]++;
			values[(r)]--;
		}


		for(int i = 1; i < N; i++){
			values[i] += values[i-1];
		}

		Arrays.sort(values);
		System.out.println(values[N/2 + 1]);

		input.close();
	}

}
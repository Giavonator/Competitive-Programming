import java.util.*;
public class truth{

	public static boolean room[][];
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();

		int truth[] = new int[N+1];
		for(int i = 0; i < N; i++){

			int s = input.nextInt();
			int e = input.nextInt();

			for(; s <= e; s++){
				truth[s]++;
			}
		}

		boolean notPossible = true;
		for(int i = N; i >= 0; i--){
			if(truth[i] == i){
				System.out.println(i);
				notPossible = false;
				break;
			}
		}

		if(notPossible) System.out.println(-1);



		input.close();
	}
}


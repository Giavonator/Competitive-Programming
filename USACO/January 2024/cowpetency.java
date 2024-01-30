import java.util.*;
public class cowpetency{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		for(int j = 0; j < T; j++){
			int N = input.nextInt();
			int Q = input.nextInt();
			int C = input.nextInt();

			int[] ratings = new int[N];
			for(int i = 0; i < N; i++){
				ratings[i] = input.nextInt();
			}

			int[] jumps = new int[Q];
			int[] jumps2 = new int[N];
			for(int i = 0; i < Q; i++){
				jumps[i] = input.nextInt();
				jumps2[jumps[i]] = 1;
				
				input.nextInt();
			}

			for(int i = 0; i < N; i++){
				if(ratings[i] == 0 && jumps2[i] == 0){
					ratings[i] = 1;
				}
			}



			int jump = 0;
			int next = jumps[0];
			int bLargest = ratings[0];
			int aLargest = 1;
			boolean valid = true;
				
			for(int x = (next + 1); x < N && jump != Q; x++){
				
				if(ratings[jumps[jump]] == 0){
					
					if(jump+1 == Q) next = (N-1);
					else next = jumps[jump];
					

					for(int i = x; i < next; i++){
						if(ratings[i] > aLargest) aLargest = ratings[i];
					}

					x = next;
					ratings[jumps[jump]] = Math.max(1+bLargest, aLargest);

					if (ratings[jumps[jump]] > C) valid = false;

				}
				
	

				bLargest = ratings[jumps[jump]];
				jump++;
			}

			//System.out.print("THIS IS IT BOSS" + j +  ":   ");

			if(valid){
				for(int i = 0; i < N - 1; i++){
					System.out.print(ratings[i] + " ");
				}
				System.out.print(ratings[N-1]);
			}
			else System.out.print(-1);


			System.out.println();

















		}
		



		input.close();
	}
}
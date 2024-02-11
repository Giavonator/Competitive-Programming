import java.util.*;
public class rug{

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int S = input.nextInt();

		//HashMap<Integer, Integer> covereds = new HashMap<>();
		int[] covered = new int[S*S+1];

		int[][] room = new int[N+1][N+1];

		for(int r = 1; r <= N; r++){
			char row[] = (input.next()).toCharArray();
			for(int c = 1; c <= N; c++){
				room[r][c] = row[c-1] == 'D' ? 1 : 0;
			}
		}

		for(int r = 0; r <= N; r++){
			for(int c = 1; c <= N; c++){
				room[r][c] += room[r][c-1];
			}
		}

		for(int r = 1; r <= N; r++){
			for(int c = 0; c <= N; c++){
				room[r][c] += room[r-1][c];
			}
		}


		for(int r = S; r <= N; r++){
			for(int c = S; c <= N; c++){

				int cover = room[r][c] - room[r-S][c] - room[r][c-S] + room[r-S][c-S];
				//System.out.println(cover);
				covered[cover]++;

			}
		}

		for(int i = 0; i < S*S+1; i++)
			if(covered[i] > 0)
				System.out.println(i + " " + covered[i]);



		input.close();
	}


}


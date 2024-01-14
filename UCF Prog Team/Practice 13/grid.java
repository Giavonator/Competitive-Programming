import java.util.*;
public class grid{

	public static Queue<int[]> positions = new LinkedList<>();

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();

		int[][] grid = new int[n][m];
		for(int i = 0; i < n; i++){
			String row = input.next();
			for(int x = 0; x < m; x++){
				grid[i][x] = Integer.parseInt(row.substring(x, x+1));
			}
		}

		int iterations = 0;

		int[][] visited = new int[n][m];
		visited[0][0] = 1;
		positions.add(new int[] {0, 0, 0});
		//next[n, m, iterations]

		while (!positions.isEmpty()){
			int[] next = positions.remove();
			//System.out.println("n: " + next[0] + "   m: " + next[1] + "    iterations: " + next[2]);

			if(next[0] == (n-1) && next[1] == (m-1)){
				iterations = next[2];
				//System.out.println("RAHHHH");
				break;
			}

			int distance = grid[next[0]][next[1]];
			if (distance == 0){
				continue;
			}
			//System.out.println("distance: " + distance);

			if ((next[0] + distance) < n){
				if(visited[next[0] + distance][next[1]] == 0){
					positions.add(new int[] {(next[0] + distance), next[1], (next[2] + 1)});
					visited[next[0] + distance][next[1]] = 1;
				}
			}

			if ((next[1] + distance) < m){
				if(visited[next[0]][next[1] + distance] == 0){
					positions.add(new int[] {next[0], (next[1] + distance), (next[2] + 1)});
					visited[next[0]][next[1] + distance] = 1;
				}
			}

			if ((next[0] - distance) >= 0){
				if(visited[next[0] - distance][next[1]] == 0){
					positions.add(new int[] {(next[0] - distance), next[1], (next[2] + 1)});
					visited[next[0] - distance][next[1]] = 1;
				}
			}

			if ((next[1] - distance) >= 0){
				if(visited[next[0]][next[1] - distance] == 0){
					positions.add(new int[] {next[0], (next[1] - distance), (next[2] + 1)});
					visited[next[0]][next[1] - distance] = 1;
				}
			}

			//System.out.println();
		}

		if(iterations != 0){
			System.out.println(iterations);
		}
		else System.out.println(-1);

		/* 
		System.out.println();
		for(int i = 0; i < n; i++){
			for(int x = 0; x < m; x++){
				System.out.print(grid[i][x]);
			}
			System.out.println();
		}
		 */


		input.close();
	}


}
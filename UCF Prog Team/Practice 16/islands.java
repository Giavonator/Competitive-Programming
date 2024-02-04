import java.util.*;
public class islands{

	public static boolean[][] visited;
	public static Queue<int[]> nextLand = new LinkedList<>();
	public static char[][] map;
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int Y = input.nextInt();
		int X = input.nextInt();
		visited = new boolean[Y][X];
		for(int i = 0; i < Y; i++){
			Arrays.fill(visited[i], Boolean.FALSE);
		}

		map = new char[Y][X];
		for(int i = 0; i < Y; i++){
			char[] places = (input.next()).toCharArray();
			for(int x = 0; x < X; x++){
				map[i][x] = places[x];
			}
		}

		long counter = 0;
		for(int i = 0; i < Y; i++){
			for(int x = 0; x < X; x++){

				if(!visited[i][x] && map[i][x] == 'L'){
					int[] next = {i, x};
					nextLand.add(next);
					visitIsland(Y, X);
					counter++;
				}
			}
		}

		System.out.println(counter);

		input.close();
	}

	public static void visitIsland(int Y, int X){

		while(!nextLand.isEmpty()){
			int[] next = nextLand.remove();
			int i = next[0];
			int x = next[1];
			//System.out.println("i: "  + i + "   x: " + x + "   " + nextLand.size());

			if(i - 1 >= 0) {
				if(!visited[(i-1)][x]){
					if(map[(i-1)][x] != 'W') {
						nextLand.add(new int[] {i-1, x});
						visited[i-1][x] = true;
					}
				}
			}

			if(i + 1 < Y) {
				if(!visited[(i+1)][x]){
					if(map[(i+1)][x] != 'W') {
						nextLand.add(new int[] {i+1, x});
						visited[i+1][x] = true;
					}
				}
			}

			if(x - 1 >= 0) {
				if(!visited[i][(x-1)]){
					if(map[i][(x-1)] != 'W') {
						nextLand.add(new int[] {i, x-1});
						visited[i][x-1] = true;
					}
				}
			}

			if(x + 1 < X) {
				if(!visited[i][(x+1)]){
					if(map[i][(x+1)] != 'W') {
						nextLand.add(new int[] {i, x+1});
						visited[i][x+1] = true;
					}
				}
			}

		}

	}


}

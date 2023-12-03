import java.util.*;
public class wet{

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		int X = input.nextInt();
		while(X != 0){
			int Y = input.nextInt();
			int T = input.nextInt();
			int L = input.nextInt();

			int[][] tiles = new int[Y][X];
			int[][] leaks = new int[L][2];
			
			for (int i = 0; i < L; i++){
				leaks[i][0] = input.nextInt() - 1;
				leaks[i][1] = (input.nextInt() - Y) * -1;
			}

			int W = input.nextInt();
			for (int i = 0; i < W; i++){
				System.out.println("WALLLLLL NUMBER " + i);
				int x1 = input.nextInt();
				int y1 = input.nextInt();
				int x2 = input.nextInt();
				int y2 = input.nextInt();
				if (x1 == x2){
					System.out.println("VERTICSL WALL");
					for (int x = (Math.min(x1, x2) - 1); x <= Math.abs(x1 - x2); x++){
						tiles[y1][x] = 1;
					}
				}
				else if (y1 == y2){
					System.out.println("HORIZONTRSL WALL");
					for (int x = (Math.max(y1, y2) - Y) * -1 ; x <= Math.abs(x1 - x2); x++){
						tiles[x][x1] = 1;
					}
				}
				else{
					System.out.println("DIAGONAL WALL");
					int dir = 0;
					int walls = Math.max(x1, x2) - Math.min(x1, x2) + 1;
					int x = 0;
					if (y1 > y2){
						x = x1 -1;
						if (x1 > x2) dir = -1;
						else dir = 1;
					}
					else{
						x = x2 -1; 
						if (x2 > x1) dir = -1;
						else dir = 1;
					}
					int y = (Math.max(y1, y2) - Y) * -1;
					for (int j = 0; j < walls; j++){
						System.out.println("YYY" + y + " XXX" + x);
						tiles[y][x] = 1;
						y--; x += dir;
					}
				}
				System.out.println("WALLLLLL NUMBER " + i);
				System.out.println("\n\n");

				for(int q = 0; i < Y; q++){
					for (int d = 0; d < X; d++){
						System.out.print(tiles[q][d]);
					}
					System.out.println();
				}
			}
			System.out.println("test");
			for (int i = 0; i < L; i++){
				System.out.print("Leak: " + leaks[i][0] + " " + leaks[i][1]);
			}

			System.out.println("\n\n");

			for(int i = 0; i < Y; i++){
				for (int x = 0; x < X; x++){
					System.out.print(tiles[i][x]);
				}
				System.out.println();
			}


			System.out.println();
			X = input.nextInt();
		}
		


		input.close();
	}
}
import java.util.*;
public class a{

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		int q = input.nextInt();
		int[][] canvas = new int[m][n];


		
		for (int i = 0; i < q; i++){
			System.out.println("\nStroke: " + (i+1));
			int xOne = input.nextInt() - 1;
			int yOne = input.nextInt() - 1;
			int xTwo = input.nextInt() - 1;
			int yTwo = input.nextInt() - 1;

			//Horizontal Stroke
			if(xOne - xTwo != 0){
				int fill = Math.abs(xOne - xTwo) + 1;
				int min = Math.min(xOne, xTwo);
				for(int x = 0; x < fill; x++){
					canvas[yOne][(min + x)] = 1;
				}
			}
			//Vertical Stroke
			else if(yOne - yTwo != 0){
				int fill = Math.abs(yOne - yTwo) + 1;
				int min = Math.min(yOne, yTwo);
				System.out.println("Fill: " + fill + "   Min: " + min);
				for(int x = 0; x < fill; x++){
					canvas[(min + x)][xOne] = 1;
				}
			}
			else canvas[yOne][xOne] = 1;




			for(int r = 0; r < m; r++){
				for(int c = 0; c < n; c++){
					System.out.print(canvas[r][c] + " ");
				}
				System.out.println();
			}
		}

		input.close();
	}

	public static int DFS(int){

		
		return -1;
	}
}
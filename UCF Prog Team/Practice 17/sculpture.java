import java.util.*;
public class sculpture{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int R = input.nextInt();
		int C = input.nextInt();

		int sculpture[][] = new int[R][C];
		int drains[][] = new int[R][C];

		for(int r = 0; r < R; r++){
			Arrays.fill(drains[r], 0);
		}

		for(int r = 0; r < R; r++){
			for(int c = 0; c < C; c++){
				sculpture[r][c] = input.nextInt();
			}
		}

		for(int r = 1; r < R-1; r++){
			for(int c = 1; c < C-1; c++){
				
				int num = sculpture[r][c];
				if(num < sculpture[(r+1)][c] && num < sculpture[(r-1)][c] && num < sculpture[r][(c+1)] && num < sculpture[r][(c-1)]){
					drains[r][c] = 1;
				}
			
			}
		}


		for(int r = 0; r < R; r++){
			for(int c = 0; c < C; c++){
				System.out.print(drains[r][c] + " ");
			}
			System.out.println();
		}
		
		
		



		input.close();
	}


}
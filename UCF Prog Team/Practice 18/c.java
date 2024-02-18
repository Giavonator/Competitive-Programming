import java.util.*;
public class c{

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		int R = input.nextInt();
		int C = input.nextInt();
		int V = input.nextInt();
		int H = input.nextInt();

		char[][] board = new char[R][C];
		int[] rowsDown = new int[V];
		int[] colsDown = new int[H];

		rowsDown[0] = input.nextInt();
		for(int i = 1; i < V; i++) 
			rowsDown[i] = rowsDown[i-1] + input.nextInt();


		colsDown[0] = input.nextInt();
		for(int i = 1; i < H; i++) 
			colsDown[i] = colsDown[i-1] + input.nextInt();

		char letter = 'B'; int row = 0;
		for(int r = 0; r < R; r++){
			
			
			int col = 0;
			char start = letter;
			for(int c = 0; c < C; c++){

				board[r][c] = letter;

				if(c + 1 == colsDown[col] && H != 1){
					//System.out.println("C   " + c);
					letter = swap(letter);
					col++;
				}
			}

			if(r + 1 == rowsDown[row]){
				//System.out.println("TRUE");
				letter = swap(start);
				row++;
			}

			//if(H % 2 == 0) letter = swap(letter);
		}

		for(int r = 0; r < R; r++){
			String word = "";
			for(int c = 0; c < C; c++){
				word += board[r][c];
			}
			System.out.println(word);
		}



		input.close();
	}

	public static char swap(char X){
		if(X == 'B') return 'W';
		return 'B';
	}


}
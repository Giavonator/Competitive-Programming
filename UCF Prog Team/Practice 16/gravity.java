import java.util.*;
public class gravity{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		String[] size = (input.nextLine()).split(" ");
		int Y = Integer.parseInt(size[0]);
		int X = Integer.parseInt(size[1]);
		char[][] grid = new char[Y][X];

		for(int i = 0; i < Y; i++){
			char[] things = (input.nextLine()).toCharArray();

			for(int x = 0; x < X; x++){
				grid[i][x] = things[x];
			}
		}

		for(int x = 0; x < X; x++){
			int gap = 0;
			for(int i = Y-1; i >= 0; i--){

				if(grid[i][x] == '#'){
					gap = 0;
					continue;
				}

				if(grid[i][x] == '.'){
					gap++;
				}
				else if (gap != 0 ){

					grid[i+gap][x] = 'o';
					grid[i][x] = '.';

				}
			}
		}

		for(int i = 0; i < Y; i++){
			for(int x = 0; x < X; x++){
				System.out.print(grid[i][x]);
			}
			System.out.println();
		}




		input.close();
	}


}
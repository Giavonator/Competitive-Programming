import java.util.*;
public class blur{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int y = input.nextInt();
		int x = input.nextInt();
		int b = input.nextInt();

		int[][] array = new int[x][y];
		for(int i = 0; i < x; i++){
			for(int j = 0; j < y; j++){
				array[i][j] = input.nextInt();
			}
		}

		for(int w = 0; w < b; w++){
			int[][] blurArray = new int[x][y];

			for(int i = 0; i < x; i++){
				for(int j = 0; j < y; j++){
					int extra = array[i][j];
					extra += getValue(x, y, i+1, j, array);
					extra += getValue(x, y, i+1, j+1, array);
					extra += getValue(x, y, i+1, j-1, array);
					extra += getValue(x, y, i-1, j, array);
					extra += getValue(x, y, i-1, j+1, array);
					extra += getValue(x, y, i-1, j-1, array);
					extra += getValue(x, y, i, j+1, array);
					extra += getValue(x, y, i, j-1, array);
					
					blurArray[i][j] = extra;
				}
			}

			array = blurArray;
		}

		HashSet<Integer> colors = new HashSet<>();
		for(int i = 0; i < x; i++){
			for(int j = 0; j < y; j++){
				colors.add(array[i][j]);
			}
		}
		System.out.println(colors.size());


		input.close();
	}


	public static int getValue(int x, int y, int i, int j, int[][] array){
		int a = i;
		int b = j;

		if (a == x) i = 0;
		if (a == -1) i = x - 1;
		if (b == y) j = 0;
		if (b == -1) j = y - 1;


		return array[i][j];
	}
}

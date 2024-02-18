import java.util.Scanner;
public class beauMatrix{
	public static void main (String args[]){
		Scanner input = new Scanner(System.in);
		int[][] moves = {{4, 3, 2, 3, 4},
						{3, 2, 1, 2, 3},
						{2, 1, 0, 1, 2},
						{3, 2, 1, 2, 3},
						{4, 3, 2, 3, 4}};
		for (int i = 0; i < 5; i++){
			for (int x = 0; x < 5; x++){
				int n = input.nextInt();
				if (n == 1){
					System.out.println(moves[i][x]);
				}
			}
		}
		
		

		input.close();
	}
}
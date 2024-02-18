import java.util.Scanner;
public class oddOneOut{
	public static void main (String args[]){
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		for(int x = 0; x < T; x++){
			int one = input.nextInt();
			int two = input.nextInt();
			int three = input.nextInt();

			if (one == three){
				System.out.println(two);
			}
			else if (one == two){
				System.out.println(three);
			}
			else System.out.println(one);

		}
		input.close();
	}
}
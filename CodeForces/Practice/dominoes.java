import java.util.Scanner;
public class dominoes{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);

		int m = input.nextInt();
		int n = input.nextInt();

		System.out.println((int)(m*n/2));

		input.close();
	}
}
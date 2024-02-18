import java.util.Scanner;
public class integerGame{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i = 0; i < n; i++){
			int num = input.nextInt();
			if (num%3 == 0)
				System.out.println("Second");
			else System.out.println("First");
		}

		input.close();
	}
}
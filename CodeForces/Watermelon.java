import java.util.Scanner;
public class Watermelon{

	public static void main(String args[]){
		try(Scanner input = new Scanner(System.in)){
			int num = input.nextInt();
			if (num > 2 && num % 2 == 0) System.out.print("YES");
			else System.out.print("NO");
		}
	}
}
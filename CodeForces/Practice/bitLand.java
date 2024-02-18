import java.util.Scanner;
public class bitLand{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());
		int x = 0;

		for (int i = 0; i < n; i++){
			String command = input.nextLine();
			if (command.contains("+")) x++;
			else x--;
		}

		System.out.println(x);

		input.close();
	}
}
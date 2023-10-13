import java.util.Scanner;
public class team {
	
	public static void main(String args[]){
		try(Scanner input = new Scanner(System.in)){
			int num = input.nextInt();
			int totalImplement = 0;
			for (int i = 0; i < num; i++){
				int sum = 0;
				sum += input.nextInt();
				sum += input.nextInt();
				sum += input.nextInt();
				if (sum > 1) totalImplement++;
			}
			System.out.print(totalImplement);
		}
	}
}

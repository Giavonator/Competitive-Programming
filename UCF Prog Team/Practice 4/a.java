import java.util.*;
public class a{

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < 2; i++){
			int touch = input.nextInt();
			int field = input.nextInt();
			int safe = input.nextInt();
			int point = input.nextInt();
			int convert = input.nextInt();
			int sum = (6*touch) + (field*3) + (safe*2) + point + (convert*2);
			System.out.print(sum + " ");
		}


		input.close();
	}
}
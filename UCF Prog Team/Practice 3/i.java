import java.util.*;
public class i{

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());

		for (int i = 0; i < n; i++){
			String og = input.nextLine();
			int num = (int)Math.ceil(og.length() / 7);
			System.out.println(num);
		}



		input.close();
	}
}
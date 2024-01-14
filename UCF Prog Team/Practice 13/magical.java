import java.util.*;
public class magical{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		long n = input.nextInt();
		int i = 4;

		while (n % i != 3){
			i++;
		}
		
		System.out.println(i);

		input.close();
	}
}
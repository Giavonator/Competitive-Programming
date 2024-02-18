import java.util.*;
public class f{



	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();

		if(N % 2 == 1) System.out.println(0);
		else if( (N/2) % 2 == 1) System.out.println(1);
		else System.out.println(2);


		input.close();
	}


}
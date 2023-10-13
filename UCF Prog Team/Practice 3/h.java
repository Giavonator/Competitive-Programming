import java.util.*;
public class h{

	public static int n = 0;
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		n = input.nextInt();



		System.out.println(a + b);
		input.close();
	}

	public static void bounce(int p, double m){
		if (p == n){

		}
		
		else {

			bounce(p+1, m);
		}

	}
}
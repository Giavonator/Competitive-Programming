import java.util.*;
public class b{

	public static long gcd(long a, long b){
		return b == 0 ? a : gcd(b, a%b);
	}

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		long a = input.nextLong();
		long b = input.nextLong();

		if(a == b){
			System.out.println(a);
		}
		else{
			long gcd = gcd(a, b);
			long a2 = a / gcd;
			long b2 = b / gcd;
			
			if(a2 % 2 == 1 && b2 % 2 == 1){
				System.out.println(gcd);
			}
			else{
				System.out.println("0");
			}

		}

		input.close();
	}


}

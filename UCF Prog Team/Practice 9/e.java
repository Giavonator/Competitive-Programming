import java.util.*;
import java.math.BigInteger;
public class e{

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		String n = input.next();
		String m = input.next();
		BigInteger one = new BigInteger("1");
		BigInteger curr = new BigInteger("1");
		BigInteger exponent = new BigInteger("2");
		BigInteger num = new BigInteger(n);
		BigInteger mod = new BigInteger(m);
		String big = "9223372036854775807";
		BigInteger biggestMod = new BigInteger(big);

		while(curr.compareTo(num) < 0){
			exponent = curr.modPow(exponent, biggestMod);
			curr = curr.add(one);
		}
		System.out.println(num.modPow(exponent, mod));
		


		input.close();
	}
}
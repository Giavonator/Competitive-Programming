import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
public class d{

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		String line = input.nextLine();
		int length = line.length();
		BigDecimal sum = new BigDecimal("0");

		for (int i = 0; i < length; i++){
			int num = Integer.parseInt(line.substring((length - i - 1), (length - i)));
			String s = String.valueOf(num * Math.pow(1.5, i));
			sum = sum.add(new BigDecimal(s));
		}
		String sSum = sum.toString();
		BigInteger f = new BigInteger("0");
		BigDecimal rem = new BigDecimal("0");

		 
		f = new BigInteger(sSum.substring(0, sSum.indexOf(".")));
		rem = new BigDecimal(sSum.substring(sSum.indexOf(".")));
		

		
		
		if (sum.equals(new BigDecimal("0"))){
			System.out.println(0);
		}
		else if (rem.compareTo(new BigDecimal("0.0")) == 0){
			System.out.println(f);
		}
		else{
			String s = String.valueOf(rem);
			BigInteger mul = new BigInteger("10");
			mul = mul.pow((s.length() - 2));
			BigInteger wRem = new BigInteger(s.substring(2));

			BigInteger gcd = gcd(mul, wRem);
			
			System.out.println(f + " " + wRem.divide(gcd) + "/" + mul.divide(gcd));

		}
		input.close();
	}

	public static BigInteger gcd(BigInteger a, BigInteger b){
		if (b.equals(new BigInteger("0"))) return a;
		return gcd(b, a.mod(b));

	}
}
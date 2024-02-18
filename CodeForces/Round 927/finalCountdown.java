import java.util.*;
import java.math.BigInteger;;
public class finalCountdown{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		for(int i = 0; i < T; i++){
			int N = input.nextInt();
			String val = input.next();
			String[] nums = (val).split("");

			BigInteger total = new BigInteger(val);
			BigInteger mult = BigInteger.valueOf(1);

			for(int x = (N-2); x >=0; x--){
				total = total.add(mult.multiply(new BigInteger(nums[x])));
				mult = mult.multiply(BigInteger.valueOf(10));
				mult = mult.add(BigInteger.valueOf(1));
				//System.out.println(total);
			}

			System.out.println(total);



		}
		



		input.close();
	}


}
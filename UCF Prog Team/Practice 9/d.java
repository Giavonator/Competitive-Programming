import java.util.*;
import java.math.BigInteger;
public class d{

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] prices = new int[n];
		for (int i = 0; i < n; i++)
			prices[i] = input.nextInt();

		BigInteger numStocks = new BigInteger("0");
		BigInteger leftMoney = new BigInteger("100");

		boolean growth = false;

		for (int i = 0; i < (n - 1); i++){

			if (growth){
				if(prices[i] < prices[i+1]) continue;
				growth = false;
				leftMoney = leftMoney.add(numStocks.multiply(new BigInteger(String.valueOf(prices[i]))));
				numStocks = new BigInteger("0");

			}
			else{
				if(prices[i] > prices[i+1]) continue;
				growth = true;
				numStocks = leftMoney.divide(new BigInteger(String.valueOf(prices[i])));
				if (numStocks.compareTo(new BigInteger("100000")) > 0) numStocks = new BigInteger("100000");
				leftMoney = leftMoney.subtract(numStocks.multiply(new BigInteger(String.valueOf(prices[i]))));
			}

		}
		leftMoney = leftMoney.add(numStocks.multiply(new BigInteger(String.valueOf(prices[n-1]))));
		System.out.println(leftMoney);


		input.close();
	}
}
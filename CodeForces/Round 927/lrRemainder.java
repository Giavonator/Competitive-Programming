import java.util.*;
import java.math.BigInteger;;
public class lrRemainder{
 
 
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
 
		for(int i = 0; i < T; i++){
			//System.out.println("NEXT");
			int N = input.nextInt();
			String M = input.next();
			String[] nums = new String[N];
			BigInteger prefixSum = new BigInteger("1");
 
 
			for(int x = 0; x < N; x++){
				nums[x] = input.next();
				prefixSum = prefixSum.multiply(new BigInteger(nums[x]));
			}
 
			char[] commands = (input.next()).toCharArray();
			int leftIndex = 0;
			int rightIndex = nums.length - 1;
			//For each command
			for(int x = 0; x < N; x++){
 
				System.out.print(prefixSum.mod(new BigInteger(M)) + " ");
 
				if(commands[x] == 'L'){
					prefixSum = prefixSum.divide(new BigInteger(nums[leftIndex]));
					leftIndex++;
				}
				else {
					prefixSum = prefixSum.divide(new BigInteger(nums[rightIndex]));
					rightIndex--;
				}
 
			}
 
			System.out.println();
 
		}
		
 
 
 
		input.close();
	}
 
 
}
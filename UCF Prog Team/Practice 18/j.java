import java.util.*;
public class j{



	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		char[] letters = (input.nextLine()).toCharArray();
		int[] freq = new int[26];

		for(int i = 0; i < letters.length; i++){
			freq[letters[i] - 'a']++;
		}

		long sum = 1;

		for(int i = 0; i < 26; i++){
			sum *= (freq[i] + 1);
			sum %= 11092019;
		}

		System.out.println(sum);

		input.close();
	}


}
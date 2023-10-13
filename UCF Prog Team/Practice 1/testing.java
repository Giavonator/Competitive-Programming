import java.util.Scanner;
public class testing {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		char[] test = (input.nextLine()).toCharArray();
		int[] frequency = new int[26];

		for(int i = 0; i < test.length; i++){
			frequency[test[i] - 'a']++;
		}

		for (int i = 0; i < 26; i++){
			System.out.println((char)(i + 'a') + "   " + frequency[i]);
		}


		input.close();
	}
}

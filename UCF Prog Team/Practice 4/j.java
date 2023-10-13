import java.util.*;
public class j{

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		line = line.toUpperCase();
		char[] charArray = line.toCharArray();
		String[] letterArray = {".-",
							"-...",
							"-.-.",
							"-..",
							".",
							"..-.",
							"--.",
							"....",
							"..",
							".---",
							"-.-",
							".-..",
							"--",
							"-.",
							"---",
							".--.",
							"--.-",
							".-.",
							"...",
							"-",
							"..-",
							"...-",
							".--",
							"-..-",
							"-.--",
							"--.."};
		String[] numArray = {
							"-----",
							".----",
							"..---",
							"...--",
							"....-",
							".....",
							"-....",
							"--...",
							"---..",
							"----."};
	
		String morseLine = "";

		int length = line.length();

		for (int i  = 0; i < length; i++){
			if ('0' <= (int)charArray[i] && charArray[i] <= '9'){
				morseLine += numArray[charArray[i] - '0'];
			}
			else if ('A' <= (int)charArray[i] && charArray[i] <= 'Z'){
				morseLine += letterArray[charArray[i] - 'A'];
			}
		}
		String[] morseArray = morseLine.split("");
		boolean palindrome = true;

		for (int i = 0, x = (morseLine.length()-1); i <= x; i++, x--){
			if(!morseArray[i].equals(morseArray[x])){
				palindrome = false;
				break;
			}
		}
		if (palindrome && morseLine.length() != 0) System.out.println("YES");
		else System.out.println("NO");
	
		input.close();
	}
}
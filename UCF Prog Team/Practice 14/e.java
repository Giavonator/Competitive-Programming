import java.util.*;
public class e{

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		HashMap<String, String> dictionary = new HashMap<>();
		int N = input.nextInt();

		for(int i = 0; i < N; i++){

			String word = input.next();
			String noLetters = word.replace("A", "");
			noLetters = word.replace("E", "");
			noLetters = word.replace("I", "");
			noLetters = word.replace("O", "");
			noLetters = word.replace("U", "");
			dictionary.put(word, noLetters);

		}

		String word = input.next();
		char[] letters = word.toCharArray();

		


		input.close();
	}


}
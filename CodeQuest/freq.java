import java.util.Scanner;
import java.util.ArrayList;

class freq{

	public static void main(String args[]){
		try (Scanner input = new Scanner(System.in)){

			int numWords = Integer.parseInt(input.nextLine());
			ArrayList<String> allWords = new ArrayList<String>();
			String[] mostSeenLetters =  new String[numWords];
			int longestLength = 0;

			for (int i = 0; i < numWords; i++){
				allWords.add(input.nextLine());
				if ((allWords.get(i)).length() > longestLength){
					longestLength = (allWords.get(i)).length();
				}
			}

			for (int i = 0; i < numWords; i++){ //FOR EVERY WORD
				int wordLength = (allWords.get(i)).length();
				String[] letters = (allWords.get(i)).split("");
				System.out.println(wordLength + letters[i]);


			}

			for (int i = 0; i < longestLength; i++){
				System.out.println((i+1) + ": " + mostSeenLetters[i]);
			}


		}
	}
}
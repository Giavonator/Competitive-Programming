import java.util.*;
public class i{



	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		char[] alphabet = (input.nextLine()).toCharArray();
		HashSet<String> words = new HashSet<>();

		String word = input.nextLine();

		//Adding a letter
		for(int i = 0; i <= word.length(); i++){

			String prior = "";
			String after = "";

			if(i != 0) prior = word.substring(0, i);
			if(i != word.length()) after = word.substring(i, word.length());

			//System.out.println(i + " " + prior + "    " + after);
			
			for(int x = 0; x < alphabet.length;x++){
				words.add(prior + alphabet[x] + after);
			}
		}

		//Removing a letter
		for(int i = 1; i <=  word.length(); i++){

			String prior = word.substring(0, i - 1);
			String letter = word.substring(i-1,i);
			String after = word.substring(i, word.length());

			//System.out.println(i + " " + prior + "    "  + letter + "    " + after);
			words.add("" + prior + after);


			for(int x = 0; x < alphabet.length;x++){
				if(!letter.equals("" + alphabet[x]))
					words.add(prior + alphabet[x] + after);
			}

		}

		ArrayList<String> answers = new ArrayList<>(words);
		Collections.sort(answers);

		for(String w : answers){

			if(!w.equals(word)) System.out.println(w);
		}



		input.close();
	}


}
import java.util.*;
public class xedni{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		String[] words = new String[N];

		for(int i = 0; i < N; i++){
			String word = input.next();
			String reverse = "";
			for(int x = 0; x < word.length();x++){
				reverse += word.substring(word.length() - x - 1, word.length() - x);
			}
			words[i] = reverse;
		}

		Arrays.sort(words);
		for(int i = 0; i < N; i++){
			System.out.println(words[i]);
		}

		input.close();
	}
}
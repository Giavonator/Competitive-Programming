import java.util.*;
public class nullCipher{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		
		for(int i = 0; i < N; i++){
			String word = input.next();
			String answer = "";
			char[] letters = word.toCharArray();
			for(int x = 1; x < letters.length; x++){
				if(letters[x-1] == 'a' || letters[x-1] == 'e' || letters[x-1] == 'i' || letters[x-1] == 'o' || letters[x-1] == 'u'){
					answer += letters[x];
					x++;
				}
			}

			System.out.println(answer);
		}

		input.close();
	}


}
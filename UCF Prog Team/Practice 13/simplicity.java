import java.util.*;
public class simplicity{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int[] letterFrequency = new int[26];
		char[] letters = (input.next()).toCharArray();

		for(int i = 0; i < letters.length; i++){
			letterFrequency[letters[i] - 'a']++;
		}

		//for(int i = 0; i < 26; i++){
		//	System.out.println(letterFrequency[i]);
		//}
		Arrays.sort(letterFrequency);
		//for(int i = 0; i < 26; i++){
		//	System.out.println(letterFrequency[i]);
		//}
		int index = 0;
		for(int i = 0; i < 26; i++){
			if(letterFrequency[i] != 0){
				index = i;
				break;
			}
		}

		int numMoves = 0;
		while(index < 24){
			numMoves += letterFrequency[index];
			index++;
		}

		System.out.println(numMoves);
		


		input.close();
	}
}
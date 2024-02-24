import java.util.*;
public class prob1{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int T = Integer.parseInt(input.nextLine());

		for(int t = 0; t < T; t++){
			char[] line = (input.nextLine()).toCharArray();
			int[] freq = new int[26];

			for(int i = 0; i < line.length; i++){
				if(line[i] != ' '){
				freq[line[i] - 'A']++;
				}
			}

			Arrays.sort(freq);
			System.out.println(freq[25]);



		}

		input.close();
	}
}
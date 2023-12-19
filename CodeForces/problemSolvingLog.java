import java.util.Scanner;
public class problemSolvingLog {
	public static void main(String argsp[]){
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();

		for(int x = 0; x < N; x++){
			int duration = input.nextInt();
			char[] letters = (input.next()).toCharArray();
			int[] quant = new int[26];
			int solved = 0;
			for(int i = 0; i < duration; i++){
				quant[letters[i] - 'A']++;
			}

			for(int i = 0; i < 26; i++){
				if(quant[i] > i) solved++;
			}

			System.out.println(solved);

		}

		input.close();
	}
}

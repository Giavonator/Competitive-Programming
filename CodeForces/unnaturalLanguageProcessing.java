import java.util.Scanner;
public class unnaturalLanguageProcessing{
	public static void main (String args[]){
		Scanner input = new Scanner(System.in);
		int T = Integer.parseInt(input.nextLine());
		for(int x = 0; x < T; x++){
			int N = Integer.parseInt(input.nextLine());
			char[] let = (input.nextLine()).toCharArray();

			for(int i = 0; i < N; i++){
				if(i + 2 == N){
					System.out.println("" + let[i] + let[i+1]);
					break;
				}
				else if(i + 3 == N){
					System.out.println("" + let[i] + let[i+1] + let[i+2]);
					break;
				}

				else{
					if (let[i+3] != 'a' && let[i+3] != 'e'){
						System.out.print("" + let[i] + let[i+1] + let[i+2] + ".");
						i += 2;
						continue;
					}
					else{
						System.out.print("" + let[i] + let[i+1] + ".");
						i += 1;
						continue;
					}
				}
			}
			
			

		}

		input.close();
	}
}
import java.util.Scanner;
public class nextRound{

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int k = input.nextInt();
		int[] scores = new int[n];
		boolean match = false;
		boolean end = false;

		for (int i = 0; i < n; i++){
			int a = input.nextInt();
			

			if (a == 0){
				System.out.println(i);
				end = true;
				break;
			}
			else if (match){
				if(scores[i-1] == a){
					scores[i] = a;
					continue;
				}
				else{
					System.out.println(i);
					end = true;
					break;
				}
			}
			else scores[i] = a;

			if ((i+1) == k) match = true;
		}

		if(!end) System.out.println(n);


		input.close();
	}
}
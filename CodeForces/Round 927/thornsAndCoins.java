import java.util.*;
public class thornsAndCoins{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		for(int i = 0; i < T; i++){
			int N = input.nextInt();
			char[] spaces = (input.next()).toCharArray();
			int count = 0;

			for(int x = 0; x < N; x++){
				if(spaces[x] == '@') count++;
				else if(spaces[x] == '*'){

					if(x < N-1){
						if(spaces[x+1] == '*') break;
					}

				}
				
			}

			System.out.println(count);
		}
		



		input.close();
	}


}
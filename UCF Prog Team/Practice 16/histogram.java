import java.util.*;
public class histogram{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		
		for(int i = 0; i < T; i++){
			int N = input.nextInt();

			for(int x = 0; x < N; x++){
				System.out.print("=");
			}
			System.out.println();
		}

		input.close();
	}


}
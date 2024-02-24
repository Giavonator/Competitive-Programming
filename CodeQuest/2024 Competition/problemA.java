import java.util.*;
public class problemA{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		int N = Integer.parseInt(input.nextLine());
		for(int i = 0; i < N; i++){
			System.out.println(input.nextLine());
		}

		input.close();
	}
}
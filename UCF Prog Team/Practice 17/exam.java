import java.util.*;
public class exam{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		char[] yours = (input.next()).toCharArray();
		char[] theirs = (input.next()).toCharArray();

		int matched = 0;
		int total = yours.length;
		for(int i = 0; i < yours.length; i++){
			if(yours[i] == theirs[i]) matched++;
		}

		if(matched >= N) System.out.println(N + (total - matched));
		else System.out.println(matched + (total - N));
		

		



		input.close();
	}


}

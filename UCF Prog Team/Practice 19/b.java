import java.util.*;
public class b{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int prev = -1;
		String str;
		boolean possible = true;

		for(int i = 0; i < n; i++){
			int current = -1;
			str = input.next();

			if(!str.substring(0, 1).equals("m")) current = Integer.parseInt(str);

			if(current != -1 && prev == -1){
				prev = current;
			}

			if(current == -1 || (prev == (i+1))){
				possible = false;
			}

		}

		if(possible) System.out.println("makes sense");
		else System.out.println("something is fishy");
	




		input.close();
	}
}
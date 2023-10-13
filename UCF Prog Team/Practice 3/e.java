import java.util.*;
public class e{

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		String[] n1 = (input.nextLine()).split("");
		String[] n2 = (input.nextLine()).split("");
	
		int counter = 0;

		for (int i = 0; i < 4; i++){
			if (Integer.parseInt(n1[i]) != Integer.parseInt(n2[i])){
				counter++;
			}
		}

		System.out.print((int)Math.pow(2, counter));
	

		input.close();
	}
}
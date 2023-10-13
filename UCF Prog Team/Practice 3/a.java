import java.util.*;
public class a{

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		String word = input.nextLine();
		char[] eachChar = word.toCharArray();

		double total = 0;
		int quant = word.length();
		for (int i = 0; i < quant; i++){
			total += eachChar[i];
		}
		System.out.print((char)(total/quant));



		input.close();
	}
}
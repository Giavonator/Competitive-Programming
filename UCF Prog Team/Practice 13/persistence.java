import java.util.*;
public class persistence{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		long num = input.nextInt();

		int iterations = 0;
		while (num > 9){
			iterations++;
			String wordNum = String.valueOf(num);
			num = Integer.parseInt(wordNum.substring(0,1));
			for(int i = 1; i < wordNum.length();i++){
				num *= Integer.parseInt(wordNum.substring(i, i+1));
			}

		}
		System.out.println(iterations);
		input.close();
	}
}
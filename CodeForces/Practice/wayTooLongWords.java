import java.util.Scanner;
public class wayTooLongWords{

	public static void main(String args[]){
		try(Scanner input = new Scanner(System.in)){
			int num = input.nextInt();
			for (int i = 0; i < num; i++){

				String word = input.next();
				if (word.length() < 11) System.out.println(word);
				else System.out.println(word.substring(0,1) + (word.length() - 2) + word.substring(word.length()-1, word.length()));
				}
			}
	}
}
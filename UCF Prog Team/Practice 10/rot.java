import java.util.*;
public class rot{

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
								"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "_", "."};
		
		int shift = Integer.parseInt(input.next());
		while(shift != 0){
			String s = input.next();
			char[] chars = s.toCharArray();
			for (int i = (s.length() - 1); i>=0; i--){
				if (chars[i] != '.' && chars[i] != '_'){
					System.out.print(letters[(shift + (int)chars[i] - 65) % 28]);
				}
				else if (chars[i] == '.'){
					System.out.print(letters[(shift + 27) % 28]);
				}
				else System.out.print(letters[(shift + 26) % 28]);
			}
			System.out.println();
			shift = Integer.parseInt(input.next());
		}
		


		input.close();
	}
}

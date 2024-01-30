import java.util.Scanner;
public class notQuiteLatinSquare{
	public static void main (String args[]){
		Scanner input = new Scanner(System.in);
		int T = Integer.parseInt(input.next());
		for(int x = 0; x < T; x++){
			for (int i = 0; i < 3; i ++){
				char[] letters = (input.next()).toCharArray();
				if (letters[0] == '?' || letters[1] == '?' || letters[2] == '?'){
					if (letters[0] != 'A' && letters[1] != 'A' && letters[2] != 'A'){
						System.out.println("A");
					}
					if (letters[0] != 'B' && letters[1] != 'B' && letters[2] != 'B'){
						System.out.println("B");
					}
					if (letters[0] != 'C' && letters[1] != 'C' && letters[2] != 'C'){
						System.out.println("C");
					}
				}
				
			}

		}
		input.close();
	}
}
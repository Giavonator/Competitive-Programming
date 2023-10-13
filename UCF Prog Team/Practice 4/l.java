import java.util.*;
public class l{

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		String answer = input.nextLine();
		String[] aLetters = answer.split("");

		for (int i = 0; i < 7; i++){
			String guess = input.nextLine();
			if (guess.equals(answer)){
				System.out.println("WINNER");
				break;
			}
			else if (i == 6){
				System.out.println("LOSER");
				break;
			}

			String[] gLetters = guess.split("");
			for (int x = 0; x < 5; x++){
				if (!(answer.contains(gLetters[x]))) System.out.print("X");
				else if (!(aLetters[x].equals(gLetters[x]))) System.out.print("Y");
				else System.out.print("G");
			}
			System.out.println();
		}
		


		input.close();
	}
}
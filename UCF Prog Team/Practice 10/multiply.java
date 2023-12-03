import java.util.*;
public class multiply{

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		long n1 = input.nextLong();
		long n2 = input.nextLong();

		while (n1 != 0){

			long total = n1*n2;
			String wTotal = String.valueOf(total);
			String[] wordTotal = (String.valueOf(total)).split("");
			String w1 = String.valueOf(n1);
			String w2 = String.valueOf(n2);
			String[] word1 = w1.split("");
			String[] word2 = w2.split("");

		

			w1 = String.valueOf(n1);
			w2 = String.valueOf(n2);


			System.out.print("+");
			for(int i = 0; i < (7 + (w1.length()-1) * 4); i++) System.out.print("-");
			System.out.println("+");


			System.out.print("|");
			for(int i = 0; i < w1.length(); i++){
				System.out.print("   ");
				System.out.print(w1.substring(i, i+1));
			}
			System.out.println("   |");


			System.out.print("| ");
			for(int i = 0; i < w1.length(); i++){
				System.out.print("+---");
			}
			System.out.println("+ |");



			int firstTen = -1;
			boolean fTen = false;
			for (int x = 0; x < w2.length(); x++){

				System.out.print("|");
				if (fTen &&  (w1.length() + w2.length() - wTotal.length()) == 0 ) System.out.print("/|");
				else System.out.print(" |");
				for(int i = 0; i < w1.length(); i++){
					int num1 = Integer.parseInt(word1[i]);
					int num2 = Integer.parseInt(word2[0]);
					int tens = (num1 * num2) / 10;
					System.out.print(tens);
					if (!fTen && i == 0 && tens != 0) {
						fTen = true;
						firstTen = tens;
					}
					System.out.print(" /|");
				}
				System.out.println(" |");


				System.out.print("| |");
				for(int i = 0; i < w1.length(); i++){
					System.out.print(" / |");
				}
				System.out.println(word2[x] + "|");


				System.out.print("|");
				if (!fTen ) {
					if (wTotal.length() == w1.length() + w2.length()){
						System.out.print(firstTen);
					}
					else System.out.print(" ");
				}
				else System.out.print(wordTotal[x - (w1.length() + w2.length() - wTotal.length())]);
				for(int i = 0; i < w1.length(); i++){
					System.out.print("|/ ");
					System.out.print((Integer.parseInt(word1[i]) * Integer.parseInt(word2[x])) % 10);
				}
				System.out.println("| |");


				System.out.print("| ");
				for(int i = 0; i < w1.length(); i++){
					System.out.print("+---");
				}
				System.out.println("+ |");

				fTen = true;
			}



			System.out.print("|");
			for(int i = 0; i < w1.length(); i++){
				System.out.print("/ " + wordTotal[i + w2.length() + (w2.length() + w1.length() - wTotal.length())] + " ");
			}
			System.out.println("   |");


			System.out.print("+");
			for(int i = 0; i < (7 + (w1.length()-1) * 4); i++) System.out.print("-");
			System.out.println("+");


			n1 = input.nextLong();
			n2 = input.nextLong();
		}
		input.close();
	}
}
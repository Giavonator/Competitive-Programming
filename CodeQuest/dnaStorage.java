import java.util.*;
public class dnaStorage{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int T = Integer.parseInt(input.nextLine());
		
		for(int x = 0; x < T; x++){
			
			String dna = input.nextLine();
			char[] bits = dna.toCharArray();
			String output = "";

			for(int i = 0; i < (dna.length()/7); i++){

				int binaryValue = 0;
				for(int j = i * 7; j - (i*7) < 7; j++){
					//System.out.println(i + " " + j);
					int gC = 0;
					if(bits[j] == 'G' || bits[j] == 'C')
					{
						gC = 1;
					}

					binaryValue += gC * Math.pow(2, Math.abs((j % 7) - 6));
				}
				output += (char)binaryValue;
			}
			System.out.println(output);

			
		}

		input.close();
	}


}
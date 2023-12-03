import java.util.*;
public class cloud{

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		int W = input.nextInt();
		int n = input.nextInt();
		int cloudNum = 0;

		while (W != 0){
			cloudNum++;
			int maxOccurence = -1;

			String[] words = new String[n];
			int[] wordOccur = new int[n];
			int[] wordPtHeight = new int[n];
			int[] wordWidth = new int[n];

			for (int i = 0; i < n; i++){
				words[i] = input.next();
				wordOccur[i] = input.nextInt();
				if (wordOccur[i] > maxOccurence) maxOccurence = wordOccur[i];
			}

			for (int i = 0; i < n; i++){
				double pt = 8 + ((40 * (wordOccur[i] - 4.0)) / (maxOccurence - 4));
				wordPtHeight[i] = (int)Math.ceil(pt);
			}

			for (int i = 0; i < n; i++){
				double width = (9.0 / 16.0) * words[i].length() * wordPtHeight[i];
				wordWidth[i] = (int) Math.ceil(width);
			}

			int cloudHeight = 0;
			int rowWidth = 0;
			int rowHeight = 0;

			for (int i = 0; i < n; i++){
				if (rowWidth + wordWidth[i] > W){
					cloudHeight += rowHeight;
					rowWidth = (wordWidth[i] + 10);
					rowHeight = wordPtHeight[i];
				}
				else{
					rowWidth += (wordWidth[i] + 10);
					if (wordPtHeight[i] > rowHeight){
						rowHeight = wordPtHeight[i];
					}
				}
			}

			cloudHeight += rowHeight;
			System.out.println("CLOUD " + cloudNum + ": " + cloudHeight);
			
			
			W = input.nextInt();
			n = input.nextInt();

		}
		input.close();
	}
}
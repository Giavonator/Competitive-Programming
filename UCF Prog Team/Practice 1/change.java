import java.util.Scanner;
import java.util.Arrays;

public class change{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int numSets = input.nextInt();
		for (int i = 0; i < numSets; i++){
			int numValues = input.nextInt();
			int[] allValues = new int[numValues];
			for (int x = 0; x < numValues; x++){
				allValues[x] = input.nextInt();
			}
			Arrays.sort(allValues);

			int cumulative = 2;
			for (int x = 0; x < numValues; x++){
				if (allValues[x] <= cumulative){
					cumulative += allValues[x];
				}
				else break;
			}
			System.out.println("Set #" + (i+1) + ": " + cumulative + "\n");
		}
		input.close();
	}
}   

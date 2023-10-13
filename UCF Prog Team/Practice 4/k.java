import java.util.*;
public class k{

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		double prob = input.nextDouble();
		double negProb = (1 - prob);
		double bestExpect = Double.MAX_VALUE;
		double sampleSize = 2;

		for (double i = 2; i < 17; i++){

			double allNegative = 1;
			for (int x = 0; x < i; x++)
				allNegative *= negProb;

			double currExpect = (allNegative + (i * (1-allNegative)))/i;
			if (currExpect < bestExpect){
				bestExpect = currExpect;
				sampleSize = i;
			}
			System.out.println(currExpect);
		}

		if (bestExpect >= 1){
			System.out.println(1);
		}
		else System.out.println((int)sampleSize);


		input.close();
	}
}
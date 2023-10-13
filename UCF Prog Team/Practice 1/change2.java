import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
public class change2{

	public static ArrayList<Long> allValues = new ArrayList<Long>();
	public static int numValues;
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		String output = "";
		int numSets = input.nextInt();
		for(int x = 0; x < numSets; x++){
			numValues = input.nextInt();
			long sumValues = 0;
			for (int i = 0; i < numValues; i++){
				long value = input.nextLong();
				sumValues += value;
				allValues.add(value);
			}
			allValues.add(sumValues);
			long lowestValue = sumValues + 1;
			Collections.sort(allValues, Comparator.comparingLong(temp -> temp));

			for (int i = 0; i < numValues; i++){
				addList(0, i);
			}

			long addition = 0;
			for (int i = 0; i < numValues - 2; i++){
				addition += allValues.get(i);
				for(int y = 1; y < numValues - i; y++){
					addList(addition, i + y);
				}
			}


			for (long i = 1; i < sumValues; i++){
				if (allValues.contains(i)){
					System.out.print(" " + i);
					continue;
				}
				else if (lowestValue > sumValues){
					lowestValue = i;
				}
			}

			output += "Set #" + (x+1) + ": " + lowestValue + "\n";
		}
		input.close();
		System.out.print(output);
	}

	public static void addList(long addition, int index){

		for (int i = index; i < numValues; i++){

			for (int x = numValues; x > i; x--){
				long sum = 0;
				for (int y = i; y < x; y++){
					sum += allValues.get(y) + addition;
				}
				allValues.add(sum);
			}
		}
	}
}   
import java.util.*;
public class calc{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i = 0; i < n; i++){
			int num = input.nextInt();
	
			HashSet<Integer> allValues = new HashSet<Integer>();
			allValues.add(num); int counter = 1; int iterations = 0;

			while (counter != 99){
				HashSet<Integer> temp = new HashSet<Integer>();
				for (int number : allValues){
					temp.add(number+1);
					temp.add(number * 3);
					temp.add(number/2);
				}
				for(int number : temp){
					if (number > 0 && number < 100 && !allValues.contains(number)) counter++;
					allValues.add(number);
				}
				iterations++;
			}
			System.out.println(iterations);

			
		}
		
		input.close();
	}
}
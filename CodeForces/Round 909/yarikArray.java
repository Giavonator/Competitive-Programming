import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class yarikArray{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i = 0; i < n; i++){
			int num = input.nextInt();
			TreeSet<Integer> numbers = new TreeSet<>();
			boolean even = true, odd = true;
			int oddSum = 0, evenSum = 0;

			for (int x = 0; x < num; x++){
				int element = input.nextInt();
				numbers.add(element);
			}

			ArrayList<Integer> end = new ArrayList<>(numbers);

			
			for(int x = end.size() - 1; x >= 0; x--){
				boolean q = (end.get(x) % 2 == 0);
				System.out.print(q + " " + odd + " " + even + " " + end.get(x));
				if (even && q){
					evenSum += end.get(x);
					even = false;
					System.out.println("ONE");
				} 
				else if (!even && !q){
					evenSum += end.get(x);
					even = true;
					System.out.println("TWO");
				}
				if (odd && !q){
					oddSum += end.get(x);
					odd = false;
					System.out.println("THREE");
				}
				else if (!odd && q){
					oddSum += end.get(x);
					odd = true;
					System.out.println("FOUR");
				}
			}
			System.out.println(Math.max(oddSum, evenSum) + "LSHDFLKSJHFLKJH" + (i+1));

		}

		input.close();
	}
}
import java.util.*;
public class missingSensor{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		
		for(int x = 0; x < T; x++){
			
			int N = input.nextInt();
			HashSet<Integer> numbers = new HashSet<>();

			for(int i = 1; i <= N; i++){
				numbers.add(i);
				//System.out.println("SDF" + i);
			}

			for(int i = 0; i < N-1; i++){
				numbers.remove(input.nextInt());
			}

			ArrayList<Integer> print = new ArrayList<>(numbers);
			System.out.println(print.get(0));

		}

		input.close();
	}


}
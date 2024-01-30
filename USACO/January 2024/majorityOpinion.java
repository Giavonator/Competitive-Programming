import java.util.*;
public class majorityOpinion{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		for(int x = 0; x < T; x++){
		
			int N = input.nextInt();
			int patches[] = new int[N+1];
			HashSet<Integer> solution = new HashSet<>();

			for(int i  = 1; i <= N; i++){
				patches[i] = input.nextInt();
			}

			for(int i  = 1; i < N; i++){
				if(patches[i] == patches[i+1]){
					solution.add(patches[i]);
				}

				if(i+2 <= N){
					if(patches[i] == patches[i+2]){
						solution.add(patches[i]);
					}
				}
			}

			

			ArrayList<Integer> solutions = new ArrayList<>(solution);
			//System.out.print("SOLUTION --> ");

			if(solutions.size() == 0){
				System.out.println(-1);
			}

			else{
				Collections.sort(solutions, Comparator.comparing(temp -> temp));
				for(int i = 0; i < solutions.size() - 1;i++){
					System.out.print(solutions.get(i) + " ");
				}
				System.out.println(solutions.get(solutions.size()-1));
			}

		}

		input.close();
	}


}
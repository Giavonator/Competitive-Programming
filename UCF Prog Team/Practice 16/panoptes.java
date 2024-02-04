import java.util.*;
public class panoptes{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int P = input.nextInt();

		double[] readings = new double[N];
		boolean[] possible = new boolean[N];

		double total = 0;
		for(int i = 0; i < N; i++){
			readings[i] = input.nextDouble();
			total += readings[i];
		}

		total = (total / N) * 0.8;
		for(int i = 0; i < N; i++){
			if(readings[i] < total) possible[i] = true;
		}

		boolean solution = false;
		for(int i = P; i < N; i++){

			for(int x = 0; x < i; x++){
				if(possible[x]){

					//System.out.println("THIS I: " + i + " AND THIS X: " + x);
					
					boolean exists = true;
					for(int j = x; j < N; j += i){

						if(!possible[j]){
							exists = false;
							break;
						}
					}

					if(exists){
						System.out.println(i);
						solution = true;
						break;
					}

				}
			}

			if(solution){
				break;
			}

		}

		if(!solution){
			System.out.println(-1);
		}





		input.close();
	}


}
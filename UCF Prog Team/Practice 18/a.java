import java.util.*;
public class a{



	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		
		int[] animals = new int[N];
		TreeMap<Integer, Integer> weights = new TreeMap<>();
		long total = 0;

		for(int i = 0; i < N; i++){
			animals[i] = input.nextInt();
			total += animals[i];

			if(weights.containsKey(animals[i])) weights.put(animals[i], weights.get(animals[i]) + 1);
			else weights.put(animals[i], 1);

		}

		ArrayList<Integer> keys = new ArrayList<>(weights.keySet());

		long prior = 0;
		for(int i = 0; i < keys.size(); i++){

			long weight = weights.get(keys.get(i)) * keys.get(i);

			if(prior == total - prior - weight){
				System.out.println(keys.get(i));
				break;
			}

			if(prior + weight == total - prior - weight){
				if(!weights.containsKey(keys.get(i) + 1)){
					System.out.println(keys.get(i) + 1);
					break;
				}
			}

			prior += weight;

		}





		input.close();
	}


}
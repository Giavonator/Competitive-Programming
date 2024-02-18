import java.util.*;
public class e{



	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int M = input.nextInt();

		TreeMap<Integer, Integer> nums = new TreeMap<>();

		for(int i = 0; i < N; i++){
			int num = input.nextInt();
			if(nums.containsKey(num)) nums.put(num, nums.get(num) + 1);
			else nums.put(num, 1);
		}

		long pebbles = 0;
		for(int i = 0; i < M; i++){
			int k = input.nextInt();
			ArrayList<Integer> keys = new ArrayList<>(nums.keySet());

			/* 
			for(int x = keys.size() - 1; x >= 0; x--){
				
				if(keys.get(x) % k == 0){
					pebbles += nums.get(keys.get(x));


					if(nums.containsKey(keys.get(x) + 1)) nums.put(keys.get(x) + 1, nums.get(keys.get(x) + 1) + nums.get(keys.get(x)));
					else nums.put(keys.get(x) + 1, nums.get(keys.get(x)));
					nums.remove(keys.get(x));

				}
			}
			*/
			//System.out.println();
			int previous = 0;

			/*
			for(int j = 0; j < keys.size();j++){
				System.out.print(keys.get(j) + " -> " +  nums.get(keys.get(j)) + "   ");
			}
			System.out.println();
			*/

			for(int x = 0; x < keys.size(); x++){
				if(keys.get(x) % k == keys.get(x)) break;

				
				if(keys.get(x) % k == 0){
					//System.out.println(previous);
					pebbles += nums.get(keys.get(x)) - previous;


					if(nums.containsKey(keys.get(x) + 1)) {
						//System.out.println((nums.get(keys.get(x) + 1) + " " +  nums.get(keys.get(x)) + " " +  previous));
						nums.put(keys.get(x) + 1, (nums.get(keys.get(x) + 1) + nums.get(keys.get(x)) - previous));
						previous = nums.get(keys.get(x));
					}
					else {
						nums.put(keys.get(x) + 1, nums.get(keys.get(x)) - previous);
						previous = 0;
					}
					nums.remove(keys.get(x));

				}

				else previous = 0;

			}

		}

		System.out.println(pebbles);

		input.close();
	}


}
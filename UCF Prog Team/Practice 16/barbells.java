import java.util.*;
public class barbells{

	public static HashMap<Long, Integer> firstCombinations = new HashMap<>();
	public static HashSet<Long> pWeights = new HashSet<>();
	public static long[] plates;
	public static boolean[] plate;
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int B = input.nextInt();
		int P = input.nextInt();

		long[] barbells = new long[B];
		plates = new long[P];
		plate = new boolean[P];
		Arrays.fill(plate, Boolean.FALSE);
		

		for(int i = 0; i < B; i++){
			barbells[i] = input.nextLong();
		}

		for(int i = 0; i < P; i++){
			plates[i] = input.nextLong();
		}

		subsets(0, P, 0, 0);
		ArrayList<Long> values = new ArrayList<>(pWeights);

		HashSet<Long> solutions = new HashSet<>();
		for(int i = 0; i < values.size(); i++){
			for(int x = 0; x < B; x++){
				solutions.add(barbells[x] + values.get(i));
			}
		}

		ArrayList<Long> result = new ArrayList<>(solutions);
		Collections.sort(result);
		
		for(int i = 0; i < result.size(); i++){
			System.out.println(result.get(i));
		}

		input.close();
	}

	public static void subsets(int p, int N, long sum1, long sum2){

		if(p == N){
			
			if(sum1 == sum2){
				pWeights.add(sum1*2);
			}

			return;
		}

		subsets(p+1, N, sum1, sum2);
		subsets(p+1, N, sum1 + plates[p], sum2);
		subsets(p+1, N, sum1, sum2 + plates[p]);

	}
}
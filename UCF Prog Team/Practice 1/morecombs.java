import java.util.*;
public class morecombs {

	public static ArrayList<HashSet<Integer>> allBags = new ArrayList<>();
	public static HashSet<Integer> temp = new HashSet<>();
	public static int maxCandies = 0;
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int x = 0; x < n; x++){

			int b = input.nextInt();
			int k = input.nextInt();
			boolean[] in = new boolean[b];
			Arrays.fill(in, false);
			
			for (int i = 0; i < b; i++){
				HashSet<Integer> bag = new HashSet<>();
				int c = input.nextInt();

				for (int j = 0; j < c; j++){
					bag.add(input.nextInt());
				}
				allBags.add(bag);
			}

			permute(0, in, k);
			System.out.println(maxCandies);

			

		}
		input.close();
	}

	public static void permute(int p, boolean[] used, int k){
		if (p == k){
			for (int i = 0; i < used.length; i++){
				if (used[i]) temp.addAll(allBags.get(i));
			}

			maxCandies = Math.max(temp.size(), maxCandies);
			temp.clear();

			return;
		}

		for(int i = 0; i < used.length; i++){
			if(!used[i]){
				used[i] = true;
				permute(p + 1, used, k);
				used[i] = false;
			}
		}
		
	}
}

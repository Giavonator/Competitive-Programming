import java.util.*;
public class potionFarming{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		
		int[] nextSpawn = new int[N];
		ArrayList<HashSet<Integer>> rows = new ArrayList<>();

		for(int i = 0; i < N; i++){
			nextSpawn[i] = input.nextInt();
			rows.add(new HashSet<Integer>(Arrays.asList(1, i+1)));
		}

		HashSet<Integer> endPoints = new HashSet<>();
		HashSet<Integer> pathPoints = new HashSet<>();

		for(int i = 0; i < N-1; i++){
			int a = input.nextInt();
			int b = input.nextInt();


			pathPoints.add(Math.min(a,b));
			endPoints.add(Math.max(a,b));

			(rows.get(Math.max(b,a)-1)).addAll(rows.get(Math.min(b,a)-1));
		}

		endPoints.removeAll(pathPoints);
		ArrayList<Integer> mustVisit = new ArrayList<>(endPoints);

		//for(int i = 0; i < mustVisit.size(); i++){
		//	System.out.println("KJKJSDFH: " + mustVisit.get(i));
		//}

		int numPotions = 0;
		int toVisit = mustVisit.size();
		int visited = 0;

		for(int i = 0; i < N && visited < toVisit; i++){
			//System.out.println("THIS IS I: " + i);

			for(int x = 0; x < mustVisit.size();x++){
				if((rows.get(mustVisit.get(x) - 1)).contains(nextSpawn[i])){
					numPotions++;
					mustVisit.remove(x);
					break;

				}
			}
			visited++;
		}

		System.out.println(numPotions);



		input.close();
	}
}
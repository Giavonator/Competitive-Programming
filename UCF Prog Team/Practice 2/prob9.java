import java.util.*;
public class prob9{

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int num = Integer.parseInt(input.nextLine());
		for(int i = 0; i < num; i++){
			
			String[] aM = (input.nextLine()).split(" ");
			int turns = aM.length; int tC = 0;
			String[] player = {"one", "two"};
			HashSet<Integer> moves = new HashSet<>();
			HashMap<Integer, Integer> grids = new HashMap<>();
			boolean valid = true;

			for (int x = 0; x < turns; x++){
				if (moves.contains(Integer.parseInt(aM[x]))){
					System.out.println("Player " + player[tC %2] + " made an invalid move on turn " + tC + ".");
					valid = false;
					break;
				}

				String[] coords = (aM[x]).split("");
				int grid = (((Integer.parseInt(coords[0])) / 3) + 1) * 3 + ((Integer.parseInt(coords[1])) / 3);

				if (grids.containsKey(grid)){
					if (grids.get(grid) == 9){
						System.out.println("Player " + player[turns %2] + " made an invalid move on turn " + tC + ".");
						valid = false;
						break;
					}
					grids.put(grid, grids.get(grid) + 1);
				}
				else grids.put(grid, 1);
				moves.add(Integer.parseInt(aM[x]));
				tC++;
			}
			if (valid){
				System.out.println("All moves were valid.");
			}

		}
		


		input.close();
	}
}
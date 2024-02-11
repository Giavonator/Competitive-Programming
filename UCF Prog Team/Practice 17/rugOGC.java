import java.util.*;
public class rugOGC{

	public static boolean room[][];
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int S = input.nextInt();

		HashMap<Integer, Integer> covered = new HashMap<>();

		room = new boolean[N][N];

		for(int r = 0; r < N; r++){
			char row[] = (input.next()).toCharArray();
			for(int c = 0; c < N; c++){
				room[r][c] = row[c] == 'C' ? false : true;
			}
		}

		for(int r = 0; r <= (N - S); r++){
			for(int c = 0; c <= (N - S); c++){
				int over = covers(r, c, S);
				if(covered.containsKey(over)) covered.put(over, covered.get(over) + 1);
				else covered.put(over, 1);
			}
		}

		for(int key : covered.keySet()){
			System.out.println(key + " " + covered.get(key));
		}

		



		input.close();
	}

	public static int covers(int r, int c, int S){

		int counter = 0;
		for(int r1 = 0; r1 < S; r1++){
			for(int c1 = 0; c1 < S; c1++){
				if(room[r+r1][c+c1]) counter++;
			}
		}

		return counter;
	}

}


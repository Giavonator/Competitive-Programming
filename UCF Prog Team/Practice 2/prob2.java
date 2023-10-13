import java.util.*;
public class prob2{

	public static ArrayList<Long> nodes = new ArrayList<>();
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		while(true){
			int num = input.nextInt();
			if (num == 0) break;
			if (num == 1){
				System.out.println(1);
				continue;
			}
			if (num == 2){
				System.out.println(2);
				continue;
			}

				nodes.clear();
				nodes.add((long)2);
				for (int x = 1; x < num - 1; x++){
					nodes.add(nodes.get(x-1) + 1);
				}
				solve(num, num - 2);
		}
		input.close();
	}

	public static void solve(int num, int p){
		
		if (p == 1){
			System.out.println(nodes.get(nodes.size() - 1) + nodes.get(nodes.size()-2));
			return;
		}

		nodes.add(nodes.get(nodes.size() - p) + nodes.get(nodes.size() - p - 1));
		for (int i = 1; i < p; i++){
			nodes.add(nodes.get(nodes.size() - 1) + nodes.get(nodes.size() - p));
			
		}
		solve(num, p - 1);
	}
}
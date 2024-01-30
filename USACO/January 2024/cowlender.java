import java.util.*;
public class cowlender{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();

		long shortestMonth = Integer.MAX_VALUE;
		TreeSet<Long> distinctMonths = new TreeSet<>();

		for(int i = 0; i < N; i++){

			long next = input.nextLong();
			shortestMonth = Math.min(shortestMonth, next);
			distinctMonths.add(next);

		}

		ArrayList<Long> months = new ArrayList<>(distinctMonths);
		long solution = 6;

		long longestWeek = shortestMonth / 4;
		for(long i = 4; i <= longestWeek; i++){

			HashSet<Long> mods = new HashSet<>();
			for(int x = 0; x < months.size(); x++){

				mods.add(months.get(x) % i);
				if(mods.size() > 3) break;

			}

			if(mods.size() < 4) solution += i;
			

		}


		System.out.println(solution);

		input.close();
	}
}

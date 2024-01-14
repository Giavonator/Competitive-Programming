import java.util.*;
import java.util.TreeSet;
public class excellence{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		long[] studentRatings = new long[N];
		TreeSet<Long> teamRatings = new TreeSet<>();

		for(int i = 0; i < N; i++){
			studentRatings[i] = input.nextLong();
		}

		Arrays.sort(studentRatings);

		int high = N - 1;
		for (int i = 0; i < N/2; i++){
			teamRatings.add(studentRatings[i] + studentRatings[high]);
			high--;
		}

		System.out.println(teamRatings.first());

		input.close();
	}
}
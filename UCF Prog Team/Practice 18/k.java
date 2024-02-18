import java.util.*;
public class k{



	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int[] points = new int[] {1, 3, 3, 5, 5, 5, 7, 7, 7, 7, 7, 9, 9, 9, 9, 9, 9, 9, 9, 11, 11, 11, 11, 11, 11, 11};

		String line = input.nextLine();
		String regex = "[^a-zA-Z]+";
		line = line.replaceAll(regex, "");
		line = line.toUpperCase();
		char[] letters = line.toCharArray();
		//System.out.println(line);

		int[] freq = new int[26];
		Arrays.fill(freq, 0);

		for(int i = 0; i < letters.length; i++){
			freq[letters[i] - 'A']++;
		}

		Arrays.sort(freq);
		long sum = 0; int p = 0;
		for(int i = 25; i >= 0; i--){
			//System.out.println(freq[i] + "   " +  points[p]);
			sum += freq[i] * points[p];
			p++;

		}

		System.out.println(sum + (letters.length - 1) * 3);







		/* 		
		Queue<int[]> next = new LinkedList<>();
		ArrayList<Integer> nums = new ArrayList<>();

		next.add(new int[] {1, 1});
		next.add(new int[] {3, 1});

		while(!next.isEmpty()){

			int[] newest = next.remove();

			nums.add(newest[0]);
				next.add(new int[] {newest[0] + 2, newest[1] + 1});
				next.add(new int[] {newest[0] + 4, newest[1] + 1});
			

			if(nums.size() == 100) break;

		}

		Collections.sort(nums);
		for(int i = 0; i < 26;i++){
			System.out.print(", " +nums.get(i));
		}

		
		*/


		input.close();
	}


}
import java.util.*;
public class prob5{

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());

		String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		String[] teens = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		String[] ions = {"", "thousand", "million", "billion", "trillion", "quadrillion"};

		for(int i = 0; i < n; i++){

			String[] num = (input.nextLine()).split("");
			int[] nums = new int[num.length];
			for(int x = 0; x < num.length; x++) nums[x] = Integer.parseInt(num[x]);

			
			for(int x = 0; x < num.length; x++){
				int index = (num.length - x - 1) % 3;

				if (index == 2 && nums[x] != 0){
					System.out.print(ones[nums[x]] + " hundred ");
				}
				else if (index == 1 && nums[x] == 1){
					System.out.print(teens[nums[x]] + " ");
					x++;
				}
				else if (index == 1 && nums[x] != 0){
					System.out.print(tens[nums[x]] + " ");
				}
				else if (index == 0 && nums[x] != 0){
					System.out.print(ones[nums[x]] + " " + ions[(nums.length - x)/3] + " ");
				}
				else if (index == 0 && nums.length > 3 && (nums[x-1] != 0 || nums[x-2] != 0)){
					System.out.print(ions[(nums.length - x)/3] + " ");
				}
			}
			System.out.println();
		}

		input.close();
	}
}
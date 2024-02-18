import java.util.Scanner;
public class helpfulMaths {
	public static void main(String argsp[]){
		Scanner input = new Scanner(System.in);
		String[] nums = (input.nextLine()).split("\\+");
		int[] quantities = new int[3];
		for(int i = 0; i < nums.length; i++)
			quantities[(Integer.parseInt(nums[i])-1)]++;
		
		int[] numbers = new int[quantities[0] + quantities[1] + quantities[2]];
		int index = 0;
		for(int i = 1; i < 4; i++){
			int n = quantities[i-1];
			for(int x = 0; x < n; x++){
				numbers[index] = i;
				index++;
			}
		}

		for(int i = 0; i < numbers.length -1; i++){
			System.out.print(numbers[i] +"+");
		}
		System.out.print(numbers[numbers.length - 1]);
		

		input.close();
	}
}

import java.util.*;
public class prob8{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int T = Integer.parseInt(input.nextLine());

		for(int t = 0; t < T; t++){
			String[] nums = (input.nextLine()).split(",");
			double v1 = Double.parseDouble(nums[0]);
			double m1 = Double.parseDouble(nums[1]);
			double v2 = Double.parseDouble(nums[2]);
			double m2 = Double.parseDouble(nums[3]);

			//double top = v1*m1 + v2*m2;
			//System.out.println(top);

			System.out.println(String.format("%.2f", (((m1*v1) + (m2*v2)) / (m1+m2))));


		}

		input.close();
	}
}
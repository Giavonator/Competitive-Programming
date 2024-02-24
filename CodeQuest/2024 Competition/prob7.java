import java.util.*;
public class prob7{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		for(int t = 0; t < T; t++){
			double width = input.nextDouble();
			//double areas = 0;
			int iterations = input.nextInt();
			int totalIterations = 1;

			double first = 0.43301270189;
			double area = first * width * width;

			for(int i = 0; i < iterations; i++){
				area *= 0.75;
				width *= 0.5;
				totalIterations *= 3;
			}

			//areas = first * width * width;
			System.out.println(totalIterations + " " + String.format("%.2f", area));

			


		}

		input.close();
	}
}
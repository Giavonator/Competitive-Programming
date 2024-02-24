import java.util.*;
public class problemB{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		int N = Integer.parseInt(input.nextLine());
		for(int i = 0; i < N; i++){
			
			String[] numbers = (input.nextLine()).split(":");
			double speed = Double.parseDouble(numbers[0]);
			double distance = Double.parseDouble(numbers[1]);

			if(speed >= distance) System.out.println("SWERVE");
			else if (speed*5 >= distance) System.out.println("BRAKE");
			else System.out.println("SAFE");

		}


		input.close();
	}
}
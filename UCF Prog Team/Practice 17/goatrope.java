import java.util.*;
public class goatrope{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		int x1 = input.nextInt();
		int y1 = input.nextInt();
		int x2 = input.nextInt();
		int y2 = input.nextInt();

		if(y1 <= y && y <= y2){
			if(x < x1) System.out.println(String.format("%.3f", (double)x1 - x));
			else System.out.println(String.format("%.3f", (double)(x - x2)));
		}

		else if(x1 <= x && x <= x2){
			if(y < y1) System.out.println(String.format("%.3f", (double)y1 - y));
			else System.out.println(String.format("%.3f", (double)y - y2));
		}


		else{

			double closestY = 0;
			double closestX = 0;

			if(y > y2) closestY = y2;
			else closestY = y1;

			//System.out.println("Close Y =" + closestY);

			if(x > x2) closestX = x2;
			else closestX = x1;

			//System.out.println("Close X =" + closestX);
			
			double disX = Math.abs(x - closestX);
			double disY = Math.abs(y - closestY);

			//System.out.println("Dix X =" + disX);
			//System.out.println("Dix Y =" + disY);


			System.out.println(String.format("%.3f", Math.sqrt(disX * disX + disY * disY)));

		}


		input.close();
	}


}
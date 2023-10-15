import java.util.Scanner;
public class a{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		double r = input.nextDouble();
		double j = input.nextDouble();
		double rate = 180/r;
		double totDegrees = rate*j;
		totDegrees /= 360.0;
		totDegrees -= Math.floor(totDegrees);
		if (totDegrees > 0.25 && totDegrees < 0.75)
			System.out.println("down");
		else System.out.println("up");


		input.close();
	}
}
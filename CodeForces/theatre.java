import java.util.Scanner;
public class theatre {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
			double n = input.nextInt();
			double m = input.nextInt();
			double a = input.nextInt();

			double s1 = n/a;
			double s2 = m/a;
			if (s1 % 1 != 0)s1++;
			if (s2 % 1 != 0)s2++;
			System.out.print(Math.round(Math.floor(s1) * Math.floor(s2)));
			

		input.close();
	}
}

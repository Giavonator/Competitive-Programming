import java.util.Scanner;
public class b{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		double h = input.nextDouble();
		double k = input.nextDouble();
		double v = input.nextDouble();
		double s = input.nextDouble();
		int distance = 0;

		while (h > 0){
			v += s;
			v -= Math.max(1, Math.floor(v/10));
			if (v >= k) h++;
			if (0 < v && v < k){
				h--;
				if (h ==0) v = 0;
			}
			if (v <= 0){
				h = 0; v = 0;
			}
			distance += v;
			if (s > 0) s--;
		}

		System.out.println(distance);


		input.close();
	}
}
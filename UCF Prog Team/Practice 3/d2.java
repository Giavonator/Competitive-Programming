import java.util.*;
public class d2{

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		double[][] coords = new double[n][2];
		double[] triAreas = new double[(n-2)];
		double totalSum = 0;

		for (int i = 0; i < n; i++){
			coords[i][0] = input.nextInt();
			coords[i][1] = input.nextInt();
		}
		for (int i = 0; i < n-2; i++){
			triAreas[i] = triArea(coords[i], coords[i+1], coords[i+2]);
			totalSum += triAreas[i];
		}

		for (int i = 0; i < triAreas.length;i++){
			System.out.println("\n" + triAreas[i]);
		}

		double area1 = 0;
		double area2 = totalSum;

		System.out.println("\n area1:" + area1 + " area2:" + area2);
		double diff = 0;

		double a = coords[0][0];
		double b = coords[0][1];
		double c = 0;double d = 0;
		double e = 0;double f = 0;
		

		for (int i = 0; i < n-2; i++){
			System.out.print("&");
			area1 += triAreas[i];
			area2 -= triAreas[i];
			System.out.println("\n area1:" + area1 + " area2:" + area2);
			if (area2 - area1 <= 0){
				diff = area1 - area2 - triAreas[i];
				c = coords[i+1][0];
				d = coords[i+1][1];
				e = coords[i+2][0];
				f = coords[i+2][1];
				break;
			}
		}
		
		if (n == 3){
			c = coords[1][0];
			d = coords[1][1];
			e = coords[2][0];
			f = coords[2][1];
			diff = 0;
		}
		

		System.out.println("\n\na:" + a + " b:" + b + " c:" + c + " d:" + d + " e:" + e + " f:" + f );
		double slope = (d-f) / (c-e);
		System.out.println(slope);
		double G = (diff/2) - (a*d) - (a*f) + (c*b) + (e*b);
		double W = 2*b - d - f;
		double Z = -2*a + c + e;
		double x = ((G + Z*slope*c - Z*d) / W) / (1 + (Z * slope / W));
		double y = (G - x*W)/Z;
		System.out.println("\n\nG:" + G + " W:" + W + " Z:" + Z + " diff:" + diff + " tSum:" + totalSum);

		System.out.println(x + " " + y);


		input.close();
	}

	public static double triArea(double[] a, double[] b, double[] c){
		double area = a[0] * (b[1] - c[1]);
		area += b[0] *(c[1] - a[1]);
		area += c[0] *(a[1] - b[1]);
		return Math.abs(area * 0.5);
	}
}
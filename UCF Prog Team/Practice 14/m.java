import java.util.*;
public class m{

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();

		for(int x = 0; x < N; x++){

			double w = input.nextInt();
			double h1 = input.nextInt();
			double h2 = input.nextInt();
			double r = input.nextInt();

			double diff = Math.abs(h1-h2);
			double total = diff * diff + w * w;
			System.out.print(String.format("%.8f", Math.sqrt(total)));

			


			double max = 0;

			//max += Math.sqrt((h1*h1*w*w/((h2+h1)*(h2+h1))) + (h1*h1 + r*r - 2*h1*r));
			//max += Math.sqrt((h2*h2*w*w/((h2+h1)*(h2+h1))) + (h2*h2 + r*r - 2*h2*r));

			max += Math.sqrt((h1*h1*w*w/(h1*h1 + 2*h1*h2 + h2*h2)) + (h1*h1 + r*r - 2*h1*r));
			max += Math.sqrt((h2*h2*w*w/(h1*h1 + 2*h1*h2 + h2*h2)) + (h2*h2 + r*r - 2*h2*r));
			System.out.println(" " + String.format("%.8f", max));



		}


		input.close();
	}


}
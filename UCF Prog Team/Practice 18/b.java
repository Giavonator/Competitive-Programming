import java.util.*;
public class b{



	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		for(int i = 1; i < 28; i++){
			System.out.println(i + " -> " + solve(i));
		}

		input.close();
	}

	public static long solve(int n){

		int fNum = n;

		long sum = 0;
		int mult = 1;


		while(fNum > 0){

			int cur = 0;
			int fN = fNum % 10;
			System.out.println("FNNNN " + fN);
			int base = 1;
			int sNum = n;
			
			while(sNum > 0){

				System.out.println("SNNNN " + sNum % 10);
				System.out.println((((sNum % 10) * fN) % 10) * base) ;
				cur += (((sNum % 10) * fN) % 10) * base;

				base *= 10;
				sNum /= 10;
			}

			System.out.println("END  " + cur * mult);
			sum += cur * mult;
			mult *= 10;
			fNum /= 10;
		}

		return sum;

	}



}
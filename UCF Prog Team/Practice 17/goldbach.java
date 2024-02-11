import java.util.*;
import java.math.BigInteger;
public class goldbach{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();

		int counter = 0;
		/*for(int i = 0; i <= 1000000; i++){

			System.out.println(i);
			BigInteger num = new BigInteger("" + i);
			if(num.isProbablePrime(100)) counter++;
		}*/


		while(x > 2){
			counter++;

			for(int i = 2; i < x; i++){

				if((new BigInteger("" + i)).isProbablePrime(100) && new BigInteger("" + (x - i)).isProbablePrime(100)){

					x = (x - i) - i;
					break;
				}
			}

		}

		System.out.println(counter);

		
		


		input.close();
	}


}
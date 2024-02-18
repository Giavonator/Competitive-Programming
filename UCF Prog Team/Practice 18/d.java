import java.util.*;
public class d{

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int B = input.nextInt();

		if (A <= B){
			System.out.println(B - A);
		}
		else{
			
			int counter = 0;

			while(A > B){
				//System.out.println(A);
				if(A % 2 == 1){
					A = (A + 1) / 2;
					counter += 2;
				}
				else {
					counter++;
					A /= 2;
				}

				
				

			}

			System.out.println(counter + B - A);


		}




		input.close();
	}


}
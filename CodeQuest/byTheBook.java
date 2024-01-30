import java.util.*;
public class byTheBook{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int N = Integer.parseInt(input.nextLine());
		
		for(int i = 0; i < N; i++){
			String[] isbn = (input.nextLine()).split("");
			int total = 0;

			for(int x = 0; x < isbn.length - 1;x++){
				if(isbn[x].equals("X")){
					total += 10 * (10 - x);
				}
				else total += Integer.parseInt(isbn[x]) * (10 - x);
				//System.out.println(i +" TOTAL: " + total);
			}


			int digit = 0;
			if(total % 11 != 0){
				int closestEleven = ((total / 11) + 1) * 11;
				digit = closestEleven - total;
			}

			int last = 0;
			if(isbn[isbn.length - 1].equals("X")) last = 10;
			else last = Integer.parseInt(isbn[isbn.length - 1]);

			if(digit == last){
				System.out.println("VALID");
			}
			else System.out.println("INVALID");
			


		}

		input.close();
	}


}
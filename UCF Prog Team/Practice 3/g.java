import java.util.*;
public class g{

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();


		for (int i = 0; i < n; i++){
			String num = input.next();
			
			if (num.length() < 3){
				System.out.println(num);
				continue;
			}

			int length = (num.toString()).length();
			int counter = 1;
			int start = Integer.parseInt(num.substring(0,1));
			String output = num.substring(0,1);


			int x = 1;
			for (x = 1; x < length; x++){
				int next = Integer.parseInt(num.substring(x, x+1));
				output += num.substring(x, x+1);
				counter++;
				if (next < start){
					start = next;
					x++;
					break;
				}
				start = next;
			}
			

			if (counter != length){
				for (; x < length; x++){
					int next = Integer.parseInt(num.substring(x, x+1));

					if (next > start){
						String[] rest = new String[length-counter];
						Arrays.fill(rest, "" + Integer.parseInt(num.substring(x-1, x)));
						output += String.join("", rest);
						break;
					}

					output += num.substring(x, x+1);
					counter++;
					start = next;
				}
			}
			System.out.println(output);
		}

		input.close();
	}
}
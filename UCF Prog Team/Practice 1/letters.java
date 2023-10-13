import java.util.Scanner;
import java.util.Arrays;

public class letters{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int n = 1;
		while(true){
			String s1 = input.next();
			String s2 = input.next();

			if (s1.equals("END") && s2.equals("END")){
				break;
			}

			String[] a1 = (s1).split("");
			String[] a2 = (s2).split("");
			Arrays.sort(a1);
			Arrays.sort(a2);

			if (String.join("", a1).equals(String.join("", a2))){
				System.out.println("Case " + n + ": same");
			}
			else System.out.println("Case " + n + ": different");
			n++;
			
			
		}

		input.close();
	}
}
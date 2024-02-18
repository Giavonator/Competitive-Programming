import java.util.Scanner;
public class petyaStrings{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		String s1 = input.nextLine();
		String s2 = input.nextLine();


		if (s1.compareToIgnoreCase(s2) < 0) System.out.println(-1);
		else if (s1.compareToIgnoreCase(s2) > 0) System.out.println(1);
		else System.out.println(0);
		input.close();
	}
}
import java.util.*;
public class j{

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int s = input.nextInt();
		int g = input.nextInt();
		if (s == g) System.out.println(0);
		else if (s > g){
			int pos = (g+360) - s;
			int neg = g-s;
			if(Math.abs(neg) < pos) System.out.println(neg);
			else System.out.println(pos);
		}
		else{
			int pos = g-s;
			int neg = pos - 360;
			if(Math.abs(neg) < pos) System.out.println(neg);
			else System.out.println(pos);
		}

		input.close();
	}
}
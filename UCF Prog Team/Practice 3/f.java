import java.util.*;
public class f{

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		long bal = 0;
		long minStart = 0;

		for (int i = 0; i < num; i++){
			int n = input.nextInt();
			if (n >= 0){
				bal += n;
				continue;
			}
			if (Math.abs(n) <= bal){
				bal += n;
				continue;
			}
			minStart += Math.abs(bal + n);
			bal = 0;
		}
		System.out.println(minStart);
	
		input.close();
	}
}
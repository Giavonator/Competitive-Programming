import java.util.Scanner;
public class sumOfThree{

	public static int num = 0;
	public static boolean test = false;

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for (int i = 0; i < n; i++){
			num = input.nextInt();
			test = false;
			for (int x = num - 3; x > 3; x--){
				if ((x%3) != 0) {
					System.out.print(solve(1, 2, x));
				}
				if (test) break;
				
			}
			if (!test) System.out.print("NO");
			System.out.println();

		}


		input.close();
	}

	public static String solve(int a, int b, int c){

		if ((a+b+c) > num) return "";
		if ((a+b+c) == num && a != b && a != c && c!=b) {
			test = true;
			return "YES\n" + a + " " + b + " " + c;
		}

		for (int i = b+1; i < num; i++){
			if((i%3) != 0){
				return solve(a, i, c);
			}
		}

		if ((b+1) % 3 != 0) return solve(b, b+1, c);
		return solve(b, b+2, c);
	}
}
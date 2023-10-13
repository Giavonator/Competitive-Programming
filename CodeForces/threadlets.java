import java.util.Scanner;
public class threadlets{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for (int i = 0; i < n; i++){
			int a = input.nextInt();
			int b = input.nextInt();
			int c = input.nextInt();
			if ((a+b+c) % 3 == 0){
				System.out.println("NO");
				continue;
			}
			if (a == b && b == c && c == a){
				System.out.println("YES");
				continue;
			}

		}
		input.close();
	}
}
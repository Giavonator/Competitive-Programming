import java.util.Scanner;
public class dontCount {
	public static void main(String argsp[]){
		Scanner input = new Scanner(System.in);
		int num = Integer.parseInt(input.next());
		for (int i = 0; i < num; i++){
			int n = Integer.parseInt(input.next());
			int m = Integer.parseInt(input.next());
			n = m;
			m = n;
			String x = input.next();
			String s = input.next();
			boolean exists = false;

			for (int j = 0; j < 10; j++){
				if(x.contains(s)){
					System.out.println(j);
					exists = true;
					break;
				}
				x = (x + x);
			}

			if(!exists) System.out.println(-1);


		}

		input.close();
	}
}

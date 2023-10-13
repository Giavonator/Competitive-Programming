import java.util.Scanner;

public class shuffle{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for (int i = 1; i <= n; i++){
			int c = input.nextInt();
			String s1 = input.next();
			String s2 = input.next();
			String target = input.next();
			int shuffles = find(c, s1, s2, target);
			System.out.println("" + i + " " + shuffles);

		}
		input.close();
	}

	public static int find(int num, String os1, String os2, String target){
		String s1 = os1;
		String s2 = os2;
		int moves = 1;

		while (true){
			String shuffled = "";
			for (int i = 0; i < num; i++){
				shuffled += s2.substring(i, i+1);
				shuffled += s1.substring(i, i+1);
			}
			if (shuffled.equals(target)){
				return moves;
			}
			s1 = shuffled.substring(0, num);
			s2 = shuffled.substring(num);
			if (os1.equals(s1) && os2.equals(s2)){
				return -1;
			}
			moves++;
		}
	}

}
  
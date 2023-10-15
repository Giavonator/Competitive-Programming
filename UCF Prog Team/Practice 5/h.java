import java.util.Scanner;
import java.util.ArrayList;
public class h{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int ds = input.nextInt();
		int ys = input.nextInt();
		int dm = input.nextInt();
		int ym = input.nextInt();
		ArrayList<Integer> sun = new ArrayList<>();
		ArrayList<Integer> moon = new ArrayList<>();
		sun.add(ds * -1);
		moon.add(dm * -1);
		int sindex = -1;
		int mindex = -1;
		for (int i = 0; i < 5001; i++){
			sun.add(sun.get(i) + ys);
			moon.add(moon.get(i) + ym);
			if (sun.contains(moon.get(i+1))){
				mindex = i+1;
				break;
			}
			else if (moon.contains(sun.get(i+1))){
				sindex = i+1;
				break;
			}
		}

		if (sindex != -1) System.out.println(sun.get(sindex));
		else System.out.println(moon.get(mindex));

		input.close();
	}
}
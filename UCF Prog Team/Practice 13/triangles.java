import java.util.*;
public class triangles{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int[] sidesA = new int[3];
		int[] sidesB = new int[3];

		sidesA[0] = input.nextInt();
		sidesA[1] = input.nextInt();
		sidesA[2] = input.nextInt();
		sidesB[0] = input.nextInt();
		sidesB[1] = input.nextInt();
		sidesB[2] = input.nextInt();

		Arrays.sort(sidesA);
		Arrays.sort(sidesB);

		if(sidesA[0] != sidesB[0] || sidesA[1] != sidesB[1] || sidesA[2] != sidesB[2]){
			System.out.println(0);
		}
		else if ((sidesA[0] * sidesA[0] + sidesA[1] * sidesA[1]) != sidesA[2] * sidesA[2]){
			System.out.println(0);
		}
		else System.out.println(1);


		input.close();
	}
}
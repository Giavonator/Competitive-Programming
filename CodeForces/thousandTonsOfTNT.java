import java.util.Arrays;
import java.util.Scanner;
public class thousandTonsOfTNT{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);

		int T = input.nextInt();
		for(int q = 0 ; q < T; q++){

			int N = input.nextInt();
			long[] boxes = new long[N];
			for(int i = 0; i < N; i++){
				boxes[i] = input.nextLong();
			}

			long maxDifference = -1;
			for(int i = 1; i <= N; i++){
				if(N % i == 0){
					//System.out.println("\nNumber of boxes per truck: " + i);
					long[] trucks = new long[N/i];

					for(int x = 0; x < N/i; x++){
						for(int j = x*i; j < x*i+i; j++){
							trucks[x] += boxes[j];
						}
					}
					Arrays.sort(trucks);
					/*for(int x = 0; x < trucks.length; x++){
						System.out.println("Truck #" + x + ": " + trucks[x]);
					}*/
					maxDifference = Math.max(maxDifference, (trucks[trucks.length - 1] - trucks[0]));
				}
			}

			System.out.println(maxDifference);
		}

		input.close();
	}
}
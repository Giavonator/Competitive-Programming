import java.util.*;
import java.io.File;
import java.io.FileWriter;
public class breedCounting{

	public static void main(String args[]){
		try{
		//System.out.println("HELLO");
		File input = new File("bcount.in");
		FileWriter output = new FileWriter("bcount.out");
		Scanner in = new Scanner(input);
		int N = in.nextInt();
		//System.out.println("HEL2afLO");
		int Q = in.nextInt();

		int[][] cows = new int[4][N+1];
		Arrays.fill(cows[1], 0);
		Arrays.fill(cows[2], 0);
		Arrays.fill(cows[3], 0);
		

		for(int i = 1; i <= N; i++){

			int c = in.nextInt();
			cows[c][i] = 1;
			cows[1][i] += cows[1][i-1];
			cows[2][i] += cows[2][i-1];
			cows[3][i] += cows[3][i-1];

		}

		for(int i = 0; i < Q; i++){
			int a = in.nextInt();
			int b = in.nextInt();

			output.write((cows[1][b] - cows[1][a-1]) + " ");
			output.write((cows[2][b] - cows[2][a-1]) + " ");
			output.write((cows[3][b] - cows[3][a-1]) + "\n");

		}
		


		in.close();
		output.close();
		}
		catch (Exception e){

		}
		finally{

		}
	}



}
import java.util.*;
import java.io.File;
import java.io.FileWriter;
public class hoofPaperScissors{

	public static void main(String args[]){
		try{
		File input = new File("hps.in");
		FileWriter output = new FileWriter("hps.out");
		Scanner in = new Scanner(input);
		HashMap<String, Integer> value = new HashMap<>();
		value.put("H", 0);
		value.put("S", 1);
		value.put("P", 2);

		
		int N = in.nextInt();
		
		int[][] points = new int[3][N+1];
		points[0][0] = 0; points[1][0] = 0; points[2][0] = 0;

		for(int i = 1; i <= N; i++){
			points[0][i] = points[0][i-1];
			points[1][i] = points[1][i-1];
			points[2][i] = points[2][i-1];
			points[value.get(in.next())][i]++;

		}

		//for(int i = 0; i <= N; i++){
		//	System.out.println( points[0][i] + " " + points[1][i] + " " + points[2][i]);
		//} 

		int max = -1;
		for(int i = 1; i <= N; i++){
			max = (int)Math.max(max, points[0][i] + (points[1][N] - points[1][i]));
			max = (int)Math.max(max, points[0][i] + (points[2][N] - points[2][i]));
			max = (int)Math.max(max, points[1][i] + (points[0][N] - points[0][i]));
			max = (int)Math.max(max, points[1][i] + (points[2][N] - points[2][i]));
			max = (int)Math.max(max, points[2][i] + (points[1][N] - points[1][i]));
			max = (int)Math.max(max, points[2][i] + (points[0][N] - points[0][i]));
		}

		output.write("" + max);



		in.close();
		output.close();
		}
		catch (Exception e){
			e.printStackTrace();
		}
		finally{

		}
	}



}
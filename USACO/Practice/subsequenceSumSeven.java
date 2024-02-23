import java.util.*;
import java.io.File;
import java.io.FileWriter;
public class subsequenceSumSeven{

	public static void main(String args[]){
		try{
		File input = new File("div7.in");
		FileWriter output = new FileWriter("div7.out");
		Scanner in = new Scanner(input);

		
		int N = in.nextInt();
		
		long[] values = new long[N+1];
		Arrays.fill(values, 0);

		for(int i = 1; i <= N; i++){
			values[i] = values[i-1] + in.nextInt();
		}

		boolean possible = false;
		int range = 0;
		for(int x = N; x > 0; x--){
			int z = x;
			for(int i = 0; z <= N; i++){
				long bottom = values[i];
				long total = values[z];
				//System.out.println(total + " " + bottom);
				if((total - bottom) % 7 == 0){
					possible = true;
					range = x;
					break;
				}
				z++;
			}
			if(possible) break;
		}

		output.write("" + range);




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
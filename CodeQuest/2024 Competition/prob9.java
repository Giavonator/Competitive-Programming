import java.util.*;
public class prob9{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int T = Integer.parseInt(input.nextLine());

		for(int t = 0; t < T; t++){
			String[] line = (input.nextLine()).split(" ");
			int M = Integer.parseInt(line[0]);
			int S = Integer.parseInt(line[1]);
			HashMap<String, Double> materials = new HashMap<>();

			for(int m = 0; m < M; m++){
				String[] mat = (input.nextLine()).split(" ");
				double max = Double.parseDouble(mat[1]);
				materials.put(mat[0], max);
			}

			for(int s = 0; s < S; s++){
				String[] set = (input.nextLine()).split(" ");
				double offset = Double.parseDouble(set[1]) * materials.get(set[0]);
				if(Double.parseDouble(set[2]) < offset){
					System.out.println("Infinity");
				}
				else{
					System.out.println(String.format("%.2f", (50.0)/(Double.parseDouble(set[2]) - offset)));
				}




			}





		}

		input.close();
	}
}
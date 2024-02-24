import java.util.*;
public class goodShipInput{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int N = Integer.parseInt(input.nextLine());
		
		for(int i = 0; i < N; i++){
			String[] inputs = (input.nextLine()).split(" ");
			int X = Integer.parseInt(inputs[0]);
			int Y = Integer.parseInt(inputs[1]);
			
			String[] systems = new String[X];
			for(int j = 0; j < X; j++){
				systems[j] = input.nextLine();
			}

			HashSet<String> reports = new HashSet<>();
			for(int j = 0; j < Y; j++){
				reports.add(input.nextLine());
			}

			Arrays.sort(systems);
			for(int j = 0; j < X; j++){
				if(!reports.contains(systems[j])){
					System.out.println(systems[j]);
				}
			}
		}

		input.close();
	}


}
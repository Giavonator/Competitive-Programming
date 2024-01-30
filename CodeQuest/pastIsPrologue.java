import java.util.*;
public class pastIsPrologue{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int N = Integer.parseInt(input.nextLine());

		for(int i = 0; i < N; i++){
			HashMap<String, int[]> event = new HashMap<>();

			int T = Integer.parseInt(input.nextLine());

			for(int x = 0; x < T; x++){
				String[] data = (input.nextLine()).split(",");
				
				if(!event.containsKey(data[3])){

					event.put(data[3], new int[]{0, 0});
				}

				if(data[4].equals("true")){
					if(data[2].equals("Day")){
						event.put(data[3], new int[] {(1 + event.get(data[3])[0]), event.get(data[3])[1]});
					}
					else{
						event.put(data[3], new int[] {(event.get(data[3])[0]), (1 + event.get(data[3])[1])});
					}
				}
			}


			ArrayList<String> keys = new ArrayList<>(event.keySet());
			keys.sort(Comparator.comparing(Object::toString));

			for(int x = 0; x < keys.size();x++){
				System.out.println(keys.get(x) + "," + event.get(keys.get(x))[0] + "," + event.get(keys.get(x))[1]);
			}


		}
		

		input.close();
	}


}
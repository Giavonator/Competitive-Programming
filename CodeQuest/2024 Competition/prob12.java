import java.util.*;
public class prob12{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int T = Integer.parseInt(input.nextLine());

		for(int t = 0; t < T; t++){
			String[] line = (input.nextLine()).split(" ");
			int C = Integer.parseInt(line[0]);
			int P = Integer.parseInt(line[1]);

			HashMap<String, String[]> players = new HashMap<>();

			for(int c = 0; c < C; c++){
				String[] classes = (input.nextLine()).split(" ");
				players.put(classes[0], classes);
			}

			for(int p = 0; p < P; p++){
				String[] player = (input.nextLine()).split(" ");
				System.out.println(player[0]);
				String[] playerClasses = players.get(player[0]);

				for(int i = 0; i < 7; i++){
					if(playerClasses[i].equals("STR")){
						System.out.println("STR: " + player[7 - i]);
					}

				}

				for(int i = 0; i < 7; i++){
					if(playerClasses[i].equals("DEX")){
						System.out.println("DEX: " + player[7 - i]);
					}

				}


				for(int i = 0; i < 7; i++){
					if(playerClasses[i].equals("CON")){
						System.out.println("CON: " + player[7 - i]);
					}

				}


				for(int i = 0; i < 7; i++){
					if(playerClasses[i].equals("INT")){
						System.out.println("INT: " + player[7 - i]);
					}

				}


				for(int i = 0; i < 7; i++){
					if(playerClasses[i].equals("WIS")){
						System.out.println("WIS: " + player[7 - i]);
					}

				}


				for(int i = 0; i < 7; i++){
					if(playerClasses[i].equals("CHA")){
						System.out.println("CHA: " + player[7 - i]);
					}

				}

			}
			



		}

		input.close();
	}
}
import java.util.*;
public class classy{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int N = Integer.parseInt(input.nextLine());
		String[][] people = new String[N][45];

		for(int i = 0; i < N; i++){
			people[i] = (input.nextLine()).split(" ");
			String pClass = "";

			for(int x = (people[i].length - 1); x > 0; x--){
				if ((people[i][x]).substring(0, 1).equals("u")){
					pClass += "a";
				}
				else if ((people[i][x]).substring(0, 1).equals("m")){
					pClass += "b";
				}
				else if ((people[i][x]).substring(0, 1).equals("l")){
					pClass += "c";
				}
			}

			
			for (int x = pClass.length(); x < 30; x++){
				pClass += "m";
			}
			pClass += (people[i][0]);

			people[i][1] = pClass;

		}

		Arrays.sort(people, Comparator.comparing(temp -> temp[1]));
		for(int i = N-1; i >= 0; i--){
			System.out.println((people[i][1]));
		}

		for(int i = N-1; i >= 0; i--){
			System.out.println((people[i][0]).substring(0, (people[i][0].length() -1) ));
		}


		input.close();
	
	}
}
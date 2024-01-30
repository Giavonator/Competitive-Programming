import java.util.*;
public class trickyTimecards{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int N = Integer.parseInt(input.nextLine());
		
		for(int i = 0; i < N; i++){
			String[] employee = (input.nextLine()).split(",");

			int hours = 0;
			int minutes = 0;

			for(int x = 1; x < employee.length; x++){
				hours += Integer.parseInt(employee[x].substring(0, 2));
				minutes += Integer.parseInt(employee[x].substring(3, 5));
			}

			hours += minutes / 60;
			minutes = minutes % 60;

			System.out.print(employee[0]+ "=" + hours + " ");

			if(hours == 1) System.out.print("hour");
			else System.out.print("hours");


			if(minutes == 1) System.out.println(" 1 minute");
			else if (minutes == 0) System.out.println();
			else System.out.println(" " + minutes + " minutes");






		}

		input.close();
	}


}
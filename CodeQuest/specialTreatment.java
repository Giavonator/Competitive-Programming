import java.util.*;
public class specialTreatment{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int N = Integer.parseInt(input.nextLine());
		
		for(int i = 0; i < N; i++){
			String line = input.nextLine();
			char[] characters = line.toCharArray();
			String printable = " abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
			String result = "";

			for(int x = 0; x < characters.length; x++){
				if(printable.contains("" + characters[x])){
					result += characters[x];
				}
			}

			System.out.println(result);

		}

		input.close();
	}


}
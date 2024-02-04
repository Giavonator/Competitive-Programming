import java.util.*;
public class periodic{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		String list = input.nextLine();

		for(int i = 1; i <= list.length(); i++){

			if(list.length() % i != 0) continue;

			boolean possible = true;
			String subString = list.substring(0, i);
			//System.out.print("Sub = " + subString  + " w/  ");


			for(int x = i; x < list.length(); x += i){

				subString = "" + subString.substring(subString.length()-1, subString.length()) + subString.substring(0, subString.length() - 1);

				String nextString = list.substring(x, (x + i));
				//System.out.print(" " +subString + "&" + nextString);

				if(!subString.equals(nextString)){
					//System.out.println();
					possible = false;
					break;
				}
			}

			if(possible){
				System.out.println(i);
				break;
			}

		}


		input.close();
	}


}
import java.util.*;
public class k{

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		String length = input.next();
		char[] itinerary = length.toCharArray();
		long num = 0;

		for(int i = 0; i < length.length() - 1; i++){
			char first = itinerary[i];
			HashSet<Character> visited = new HashSet<>();

			for(int x = i+1; x < length.length(); x++){
				char last = itinerary[x];
				if(first == last){
					break;
				}
				if (!visited.contains(itinerary[x])){
					//System.out.println(first + " " + last);
					num++;
					visited.add(itinerary[x]);
				}

			}
		}
		System.out.println(num);

		input.close();
	}


}
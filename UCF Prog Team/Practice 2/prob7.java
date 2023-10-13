import java.util.*;
public class prob7{

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
			int num  = Integer.parseInt(input.nextLine());
			TreeMap<String, Integer> freq = new TreeMap<>();
			for (int i = 0; i < num; i++){

				String tweet = input.nextLine();
				String h = "";
				while(tweet.contains("#")){
					tweet = tweet.substring(tweet.indexOf("#") + 1);
					

					if (tweet.contains(" ")) {
						h = tweet.substring(0, tweet.indexOf(" "));
					}
					else if (tweet.contains(".")) {
						h = tweet.substring(0, tweet.indexOf("."));
					}
					else break;

					

					h = h.toLowerCase();
					if (freq.containsKey(h)){
						freq.put(h, (freq.get(h) + 1));
					}
					else freq.put(h, 1);
					
					System.out.print(h);
					System.out.println(freq.get(h));
					
				}

				
			}
			
	
				
			
		input.close();
	}
}
import java.util.*;
public class socks{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		ArrayList<Long> quants = new ArrayList<>();

		long before = 0;
		for(int i = 0; i < N; i++){
			quants.add(input.nextLong());
		}

		Collections.sort(quants);

		for(int i = 0; i < N-1; i++){
			before += quants.get(i);
		}

		if(before >= quants.get(quants.size()-1)){
			System.out.println((before + quants.get(quants.size()-1)) / 2);
		}
		else System.out.println(before);



		input.close();
	}


}
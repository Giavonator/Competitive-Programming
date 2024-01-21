import java.util.*;
public class c{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int P = input.nextInt();
		int D = input.nextInt();
		long partyAWaste = 0;
		long partyBWaste = 0;
		long votes = 0;

		long[][] election = new long[D+1][3];
		
		for(int i = 0; i < P; i++){
			int district = input.nextInt();
			long votesA = input.nextLong();
			long votesB = input.nextLong();
			election[district][0] += votesA;
			election[district][1] += votesB;
			election[district][2] += votesA + votesB;
			votes += votesA + votesB;
		}

		for(int i = 1; i <= D; i++){
			if(election[i][0] > election[i][1]){
				System.out.print("A ");
				//System.out.println("VOTES: " + election[i][0] + " " + (((election[i][2] / 2) + 1)) + " " + election[i][2]);
				long aWaste = election[i][0] - ((election[i][2] / 2) + 1);
				long bWaste = election[i][1];
				System.out.print(aWaste + " ");
				System.out.println(bWaste + " ");
				partyAWaste += aWaste;
				partyBWaste += bWaste;
			}
			else{
				System.out.print("B ");
				//System.out.println("VOTES: " + election[i][1] + " " + (((election[i][2] / 2) + 1)) + " " + election[i][2]);
				long bWaste = election[i][1] - ((election[i][2] / 2) + 1);
				long aWaste = election[i][0];
				partyAWaste += aWaste;
				partyBWaste += bWaste;
				System.out.print(aWaste + " ");
				System.out.println(bWaste + " ");
			}
		}

		long difference = partyAWaste - partyBWaste;
		if(difference < 0)
			difference *= -1;

		double efficiency = (difference) / (votes * 1.0);
		System.out.println(String.format("%.10f", efficiency));

		input.close();
	}


}
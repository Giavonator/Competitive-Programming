import java.util.Scanner;

public class problem2{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		long N = input.nextInt();
		
		String cows = input.next();
		String[] groups = cows.split("0");

		//for(int i = 0; i < groups.length; i++){
			//System.out.println("THESE ARE GROUPS: " + groups[i]);
		//}

		int maxNights = Integer.MAX_VALUE;
		boolean leftEdge = false, rightEdge = false;
		int leftLength = 0, rightLength = 0;

		if(groups[0].length() != 0){
			//System.out.println("LEFFT EDGEEEE");
			int groupMaxNights = groups[0].length() - 1;
			leftLength = groups[0].length();
			leftEdge = true;
			groups[0] = "";
			if (groupMaxNights < maxNights){
				maxNights = groupMaxNights;
			}
		}
		if ((cows.substring(cows.length() - 1, cows.length())).equals("1") && groups.length > 1){
			//System.out.println("RIGHT EDGEEEE");
			int groupMaxNights = groups[groups.length - 1 ].length() - 1;
			rightLength = groups[groups.length - 1 ].length();
			rightEdge = true;
			groups[groups.length - 1] = "";
			if (groupMaxNights < maxNights){
				maxNights = groupMaxNights;
			}
		}
		
		//System.out.println("\nMAX NUM OF NIGHTS MINIMALLY AFTER EDGES:  " + maxNights);

		for(int i = 0; i < groups.length; i++){
				
			if (groups[i].length() != 0){
				//System.out.println("CENTER GROUP YAY");
				if(groups[i].length() % 2 == 0){
					int groupMaxNights = (groups[i].length() / 2) - 1;
					if (groupMaxNights < maxNights){
						maxNights = groupMaxNights;
					}
				}

				else{
					int groupMaxNights = (groups[i].length() - 1) / 2;
					if (groupMaxNights < maxNights){
						maxNights = groupMaxNights;
					}
				}
			}
		}


		//System.out.println("\nMAX NUM OF NIGHTS MINIMALLY AFTER CENTER:  " + maxNights);

		int infectedCounter = 0;
		double coveredArea = (maxNights * 2) + 1;
		for(int i = 0; i < groups.length; i++){
			//System.out.println("\nADDED INFECTED FROM GROUP: " + Math.ceil(groups[i].length() / coveredArea));
			infectedCounter += Math.ceil(groups[i].length() / coveredArea);
		}

		if(leftEdge){
			infectedCounter += Math.ceil(leftLength / coveredArea);
		}

		if (rightEdge) {
			infectedCounter += Math.ceil(rightLength / coveredArea);
		}

		//for(int i = 0; i < groups.length; i++){
			//System.out.println("THESE ARE GROUPS: " + groups[i]);
		//}
		System.out.print(infectedCounter);

		//Get rid of problem thing
		infectedCounter = (int)N;


		/*
		Created sample case = 7
		20
		11111011111101110111110
		 */

		input.close();
	}
}
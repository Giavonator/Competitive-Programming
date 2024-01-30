import java.util.*;
public class cannonball{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int S = input.nextInt();
		int brokenTargets = 0;
		int jumpPower = 1;
		int jumps = 0;
		boolean visited[] = new boolean[N+1];

		//location[position][0] = type;
		//location[position][1] = value
		int[][] locations = new int[(N+1)][2];
		for(int i  = 1; i <= N; i++){
			locations[i][0] = input.nextInt(); //type
			locations[i][1] = input.nextInt(); //value
			//System.out.print(i + "Target type: " + locations[i][0]);
			//System.out.println("  Value: " + locations[i][1]);
		}

		while(S > 0 && S <= N){
			jumps++;
			if(jumps == 1000000){
				break;
			}
			//System.out.println("THIS IS S: " + S);
			//System.out.print("Target type: " + locations[S][0]);
			//System.out.println("  Value: " + locations[S][1]);

			if(locations[S][0] == 0){
				if(jumpPower < 0) jumpPower -= locations[S][1];
				else jumpPower += locations[S][1];

				jumpPower *= -1;
			}

			else if(!visited[S]){

				if(Math.abs(jumpPower) >= locations[S][1]){
					brokenTargets++;
					visited[S] = true;
					//System.out.println("Broke target: " + S);
				}
			}

			S += jumpPower;

		}

		System.out.println(brokenTargets);

		

		input.close();
	}


}
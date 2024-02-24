import java.util.*;
public class moorbles{

	public static int[][] moorbles;
	public static int M;
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		for(int t = 0; t < T; t++){
			int num = input.nextInt();
			M = input.nextInt();
			int K = input.nextInt();

			moorbles = new int[M][4];
			//moorbles[i][0] = min Even;
			//moorbles[i][1] = max Even;
			//moorbles[i][2] = min Odd;
			//moorbles[i][3] = max Odd
			for(int i = 0; i < M; i++){
				moorbles[i][0] = 2000000000; moorbles[i][1] = 0;
				moorbles[i][2] = 2000000000; moorbles[i][3] = 0;
				for(int x = 0; x < K; x++){
					int n = input.nextInt();

					if(n % 2 == 0){
						moorbles[i][0] = Math.min(moorbles[i][0], n);
						moorbles[i][1] = Math.max(moorbles[i][1], n);
					}
					else{
						moorbles[i][2] = Math.min(moorbles[i][2], n);
						moorbles[i][3] = Math.max(moorbles[i][3], n);
					}

				}
			}


			if(!DFS("", 0, num)){
				System.out.println(-1);
			}


			


		}

		input.close();
	}


	public static boolean DFS(String cur, int m, int num){

		if(m == M){
			System.out.println(cur);
			return true;
		}
		String space = "";
		if(m != (M-1)) space = " ";

		if(moorbles[m][3] == 0){
			if(DFS((cur + "Even" + space), (m+1), (num + moorbles[m][0]))) 
				return true;
		}
		
		if(num > moorbles[m][3]) {
			if(DFS((cur + "Even" + space), (m+1), (num - moorbles[m][3]))) 
				return true;
		}
		
		if(moorbles[m][1] == 0) {
			if(DFS((cur + "Odd" + space), (m+1), (num + moorbles[m][2]))) 
				return true;
		}
		
		if(num > moorbles[m][1]) {
			if(DFS((cur + "Odd" + space), (m+1), (num - moorbles[m][1]))) 
				return true;
		}


		return false;

	}


}
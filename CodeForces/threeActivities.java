//MY FIRST EVERY GREEDY/BFS SOLUTION YESSS
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;
public class threeActivities {

	public static Queue<int[]> order = new LinkedList<>();
	public static void main(String argsp[]){
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		for(int x = 0; x < T; x++){
			//System.out.println("THIS IS THE TH TEST CASE: " + (x+1));
			int N = input.nextInt();
			int[][] skiing = new int[N][2];
			int[][] movie = new int[N][2];
			int[][] boardGames = new int[N][2];

			for(int i = 0; i < N; i++){
				skiing[i][0] = input.nextInt();	
				skiing[i][1] = i;		
			}
			for(int i = 0; i < N; i++){
				movie[i][0] = input.nextInt();	
				movie[i][1] = i;		
			}
			for(int i = 0; i < N; i++){
				boardGames[i][0] = input.nextInt();	
				boardGames[i][1] = i;		
			}

			Arrays.sort(skiing, Comparator.comparingInt(test -> test[0]));
			Arrays.sort(movie, Comparator.comparingInt(test -> test[0]));
			Arrays.sort(boardGames, Comparator.comparingInt(test -> test[0]));

			/* 
			System.out.println("Skiing: ");
			for(int i = 0; i < N; i++){
				System.out.println(skiing[i][1] + " " + skiing[i][0]);
			}

			System.out.println("Movie: ");
			for(int i = 0; i < N; i++){
				System.out.println(movie[i][1] + " " + movie[i][0]);
			}

			System.out.println("BoardGames: ");
			for(int i = 0; i < N; i++){
				System.out.println(boardGames[i][1] + " " + boardGames[i][0]);
			}*/

			int[] next = new int[] {N-1, N-1, N-1, 0};
			order.add(next);
			System.out.println(DFS(skiing, movie, boardGames));

		}

		input.close();
	}

	public static int DFS(int[][] s, int[][] m, int[][] b){
		
		int sI, mI, bI;
		int max = 0;

		while(!order.isEmpty()){

			int[] newNumbers = order.remove();
			sI = newNumbers[0];
			mI = newNumbers[1];
			bI = newNumbers[2];

			//System.out.println("sI: " + sI + "   mI: " + mI + "   bI: " + bI + "   max: " + max );


			if ((s[sI][1] != m[mI][1]) && (s[sI][1] != b[bI][1]) && (b[bI][1] != m[mI][1]) ){
				//System.out.println("Possible Solution!!\n");
				max = Math.max(max, s[sI][0] + m[mI][0] + b[bI][0]);
				if(order.isEmpty()){
					return max;
				}
			}

		
			if(s[sI][1] == m[mI][1] && s[sI][1] == b[bI][1] && m[mI][1] == b[bI][1]){
				//System.out.println("ALL COLLUDE!\n");
				if(sI != 0) order.add(new int[] {sI-1, mI, bI});
				if(mI != 0) order.add(new int[] {sI, mI-1, bI});
				if(bI != 0) order.add(new int[] {sI, mI-1, bI-1});
			}

			else if(s[sI][1] == m[mI][1]){
				//System.out.println("SKI AN MOVIE COLLUDE!\n");
				if(sI != 0) order.add(new int[] {sI-1, mI, bI});
				if(mI != 0) order.add(new int[] {sI, mI-1, bI});
			}

			else if(s[sI][1] == b[bI][1]){
				//System.out.println("SKI AND BOARD COLLUDE!\n");
				if(sI != 0) order.add(new int[] {sI-1, mI, bI});
				if(bI != 0) order.add(new int[] {sI, mI, bI-1});
			}

			else if(b[bI][1] == m[mI][1]){
				//System.out.println("BOARD AND MOVIE COLLUDE!\n");
				if(bI != 0) order.add(new int[] {sI, mI, bI-1});
				if(mI != 0) order.add(new int[] {sI, mI-1, bI});
			}
		

		}

		
		return -1;
	} 
}

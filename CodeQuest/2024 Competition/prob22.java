import java.util.*;
public class prob22{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int T = Integer.parseInt(input.nextLine());

		for(int t = 0; t < T; t++){
			String[] hAndWidth = (input.nextLine()).split(" ");
			int R = Integer.parseInt(hAndWidth[0]);
			int C = Integer.parseInt(hAndWidth[1]);
			int[][][] map = new int[R][C][3];
			//map[R][C][0] = elevation
			//map[R][C][1] = 1 is land 

			for(int r = 0; r < R; r++){
				String[] row = (input.nextLine()).split(" ");

				for(int c = 0; c < C; c++){
					String cell = row[c];
					map[r][c][0] = Integer.parseInt(cell.substring(0, cell.length() -1));
					if((cell.substring(cell.length() - 1, cell.length())).equals("L")){
						map[r][c][1] = 1;
					}
					else map[r][c][1] = 0;
				}
			}

			ArrayList<int[]> solutions = new ArrayList<>();

			for(int r = 0; r < R; r++){
				for(int c = 0; c < C; c++){

					if(map[r][c][1] == 0){
						continue;
					}
					else{
						int height = map[r][c][0];

						if((r - 1) >= 0 && (c - 1) >= 0){
							if(Math.min(map[(r-1)][(c-1)][0], height) != height){
								continue;
							}
						}

						if((r - 1) >= 0){
							if(Math.min(map[(r-1)][c][0], height) != height){
								continue;
							}
						}


						if((r - 1) >= 0 && (c + 1) < C){
							if(Math.min(map[(r-1)][(c+1)][0], height) != height){
								continue;
							}
						}

						if((c - 1) >= 0){
							if(Math.min(map[r][(c-1)][0], height) != height){
								continue;
							}
						}

						if((c + 1) < C){
							if(Math.min(map[r][(c+1)][0], height) != height){
								continue;
							}
						}

						if((r + 1) < R && (c - 1) >= 0){
							if(Math.min(map[(r+1)][(c-1)][0], height) != height){
								continue;
							}
						}

						if((r + 1) < R){
							if(Math.min(map[(r+1)][c][0], height) != height){
								continue;
							}
						}


						if((r + 1) < R && (c + 1) < C){
							if(Math.min(map[(r+1)][(c+1)][0], height) != height){
								continue;
							}
						}

						solutions.add(new int[]{height, r, c});

					}
				}
			}

			Collections.sort(solutions, Comparator.comparingInt(temp -> temp[0]));

			for(int x = 0; x < solutions.size(); x++){
				System.out.println(solutions.get(x)[0] + " " + solutions.get(x)[1] + " " + solutions.get(x)[2]);
			}



		}

		input.close();
	}
}
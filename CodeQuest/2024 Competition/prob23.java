import java.util.*;
public class prob23{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int T = Integer.parseInt(input.nextLine());

		for(int t = 0; t < T; t++){
			String[] line = (input.nextLine()).split(" ");
			int N = Integer.parseInt(line[1]);
			
			int dataLevel = 0;
			int continuousLevel = 0;
			int entrancesLevel = 0;

			if(N >= 36) dataLevel = 3;
			else if (N >= 24) dataLevel = 2;
			else if (N >= 12) dataLevel = 1;

			int entrances = 1;
			int curContinuous = 1;
			int maxContinous = 1;

			String[] timeFirst = (input.nextLine()).split(":");
			int hourPrev = Integer.parseInt(timeFirst[0]);
			int minutePrev = Integer.parseInt(timeFirst[1]);

			for(int i = 1; i < N; i++){
				String[] time = (input.nextLine()).split(":");
				int hour = Integer.parseInt(time[0]);
				int minute = Integer.parseInt(time[1]);

				if((minute == (minutePrev+15) && hour == hourPrev) || (minute == 0 && minutePrev == 45 && (hour == (hourPrev+1))) || (minute == 0 && hour == 0 && minutePrev == 45 && hourPrev == 23)){

					//System.out.println(t + "asdfa " + hourPrev + " " + minutePrev + " " + hour + " " + minute);
					curContinuous++;
					maxContinous = Math.max(curContinuous, maxContinous);

				}
				else{
					entrances++;
					curContinuous = 1;
					
				}

				hourPrev = hour;
				minutePrev = minute;

			}



			if(entrances >= 8) entrancesLevel = 3;
			else if (entrances >= 4) entrancesLevel = 2;

			if(maxContinous >= 12) continuousLevel = 3;
			else if (maxContinous >= 8) continuousLevel = 2;
			else if (maxContinous >= 4) continuousLevel = 1;


			//System.out.print("SDFSDF" + entrancesLevel + " " + continuousLevel + " " + dataLevel);
			if(line[0].equals("TRUE")){
				System.out.println("NONE");
			}
			else if(Math.max(dataLevel, Math.max(continuousLevel, entrancesLevel)) == 0){
				System.out.println("NONE");
			}

			else if(Math.max(dataLevel, Math.max(continuousLevel, entrancesLevel)) == 1){
				System.out.println("LOW");
			}


			else if(Math.max(dataLevel, Math.max(continuousLevel, entrancesLevel)) == 2){
				System.out.println("MEDIUM");
			}


			else if(Math.max(dataLevel, Math.max(continuousLevel, entrancesLevel)) == 3){
				System.out.println("HIGH");
			}

			
			



		}

		input.close();
	}
}
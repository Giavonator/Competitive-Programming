import java.util.Scanner;
import java.util.ArrayList;
public class Bronze2022DecP2{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		long n = input.nextLong();


		for(int i = 0; i < n; i++){
			long N = input.nextLong();
			long K = input.nextLong();
			String row = input.next();

			if (K == 0){
				System.out.println(N + "\n" + row);
				continue;
			}

			System.out.println(N);
			ArrayList<Integer> consecutive = new ArrayList<>();
			char[] plots = row.toCharArray();
			int streak = 1; char current = plots[0];
			for (int x = 1; x < N; x++){
				if (current != plots[x]){
					consecutive.add(streak);
					streak = 1;
					current = plots[x];
				}
				else{
					streak++;
				}
			}

			long kMax = K*2 + 1;
			int plotCounter = 0;
			String print = "";
			String plotType = row.substring(0,1);
			String gPlot = "G", hPlot = "H";
			while(!consecutive.isEmpty()){
				plotCounter++;

				if(consecutive.get(0) >= kMax){
					for (int x = 0; x < kMax; x++){
						if(x == K + 1) print += plotType;
						else print += ".";
					}
					if (consecutive.get(0) > kMax){
						consecutive.set(0, consecutive.get(0) - (int)kMax);
					}
					else {
						consecutive.remove(0);
						if (plotType.equals(hPlot)) plotType = gPlot;
						else plotType = hPlot;
					}
				}

				else if(consecutive.get(0) + consecutive.get(1) >= kMax){
					boolean printOnce = true;
					for(int x = 0; x < consecutive.get(0); x++){
						if(printOnce && (x + 1) > (consecutive.get(0)/2)){
							print += plotType;
							printOnce = false;
						}
						else print += ".";
					}

					consecutive.remove(0);
					if (plotType.equals(hPlot)) plotType = gPlot;
					else plotType = hPlot;
				}
				


			}

			System.out.println(plotCounter + "\n" + print);
		}

		input.close();
	}
}
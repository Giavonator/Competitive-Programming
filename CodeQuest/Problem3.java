import java.util.Scanner;
    class Problem3 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < testCases; testcase++) {
                
                String[] quant = input.nextLine().split(" ");
				int total = Integer.parseInt(quant[0]);
				int reports = Integer.parseInt(quant[1]);
				
				String[] all = new String[total];
				for(int i = 0; i < total; i++)
				{
					all[i] = input.nextLine();
				}

				String[] reported = new String[reports];
				for(int j = 0; j < reports;j++)
				{
					reported[j] = input.nextLine();
				}

				for(int x = 0; x < total; x++)
				{
					int isReported = 0;
					for (int t = 0; t < reports; t++)
					{
						if (all[x].equals(reported[t]))
						{
							isReported++;
						}
					}
					if (isReported < 1)
					{
						System.out.println(all[x]);
					}
				}
            
            }
        }
    }
}
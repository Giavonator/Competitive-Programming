import java.util.Scanner;
    class Problem2REAL {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
			String endPrint = "";
            for(int testcase = 0; testcase < testCases; testcase++) {
                String line = input.nextLine();
				String[] eachString = line.split(" ");
				int[] values = new int[eachString.length];
				for(int i = 0; i < eachString.length; i++)
				{
					values[i] = Integer.parseInt(eachString[i]);
				}
				int cass = values[0];
				int lead = values[1];
				if (cass > lead)
				{
					endPrint += "Cassowary Craft sold " + (cass - lead) + " more aircraft\n";
				}
				else if (lead > cass)
					endPrint += "Lead Balloons Ltd sold " + (lead - cass) + " more aircraft\n";
				else
				{
					endPrint += "Cassowary Craft and Lead Balloons Ltd sold the same number of aircraft\n";
				}

			}
			System.out.print(endPrint);
        }
    }
}
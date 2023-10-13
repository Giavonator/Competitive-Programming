import java.util.Scanner;
    class Problem10 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
			String endPrint = "";
            for(int testcase = 0; testcase < testCases; testcase++) {
                double variance = 0;

                int numValues = Integer.parseInt(input.nextLine());
                String stringLine = input.nextLine();
                String[] splitString = stringLine.split(" ");
                double[] expectedList = new double[numValues];
                for (int i = 0; i < numValues; i++)
                {
                    expectedList[i] += Double.parseDouble(splitString[i]);
                }
                String actualLine = input.nextLine();
                String[] actualSplit = actualLine.split(" ");
                double[] actualList = new double[numValues];
                for (int j = 0; j < numValues; j++)
                {
                    actualList[j] += Double.parseDouble(actualSplit[j]);
                }
                for (int x = 0; x < numValues; x++)
                {
                    variance += expectedList[x] - actualList[x];
                }
                variance = variance / -6;
                variance = (double)Math.round(variance * 100) / 100;
                endPrint += variance + "\n";
            }
			System.out.print(endPrint);
        }
    }
}
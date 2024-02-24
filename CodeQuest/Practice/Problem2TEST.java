import java.util.Scanner;
    class Problem2TEST {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            String endPrint = "";
            for(int testcase = 0; testcase < testCases; testcase++) {
                
                String line = input.nextLine();
                String[] values = line.split(" ");
                double volume = Double.parseDouble(values[0]);
                double rateEnter = Double.parseDouble(values[1]);
                double rateLeave = Double.parseDouble(values[2]);

                double leak = (volume / (rateEnter - rateLeave)) * rateLeave;
                int output = (int)Math.round(leak);
                endPrint += output + "\n";

            }
            System.out.print(endPrint);
        }
    }
}
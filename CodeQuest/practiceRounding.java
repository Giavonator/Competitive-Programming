import java.util.Scanner;

    public class practiceRounding {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
			String endPrint = "";
            for(int testcase = 0; testcase < testCases; testcase++) {
                double value = Double.parseDouble(input.nextLine());
                System.out.println(value);

				/* Proper Rounding to the .# decimal place
                endPrint += String.format("%.2f", value) + "\n";
				*/

					
            }
			System.out.print(endPrint);
        }
    }
}
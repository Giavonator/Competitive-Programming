import java.util.Scanner;
    class ProblemB {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < testCases; testcase++) {
                String[] carInfo = input.nextLine().split("\\:");
                double currentSpeed = Double.parseDouble(carInfo[0]);
                double currentDistance = Double.parseDouble(carInfo[1]);
                if (currentSpeed >= currentDistance)
                {
                    System.out.println("SWERVE");
                }
                else if ((5 * currentSpeed) >= currentDistance)
                {
                    System.out.println("BRAKE");
                }
                else
                    System.out.println("SAFE");
            }
        }
    }
}
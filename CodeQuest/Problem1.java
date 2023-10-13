import java.util.Scanner;
    public class Problem1 {
        /**
         * What in the world is this.3
         * @param args
         */
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < testCases; testcase++) { 
                String scramble = input.nextLine();
                String deCoded = "";
                for (int i = 0; i < scramble.length(); i++)
                {
                    String vowels = "aeiou";
                    if (vowels.contains(scramble.substring(i, i + 1)))
                    {
                        deCoded = deCoded + scramble.substring(i + 1, i +2);
                        i++;
                    }
                }
                System.out.println(deCoded);
            }
        }
    }
    
        
}
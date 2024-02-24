import java.util.Scanner;
    class Problem4 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
			String print = "";
            for(int testcase = 0; testcase < testCases; testcase++) {
                
                String line = input.nextLine();
				String newLine = "";
				for (int i = 0; i < line.length();i++)
				{
					char charAtPart = line.charAt(i);
					if ((charAtPart < 58 && charAtPart > 47) || (charAtPart > 64 && charAtPart < 91) || (charAtPart > 96 && charAtPart < 123) || (line.substring(i, i + 1).equals(" ")))
					{
						newLine = newLine + line.substring(i, i + 1);
					}
				}
				print += newLine + "\n";
			}
			System.out.print(print);
        }
    }
}
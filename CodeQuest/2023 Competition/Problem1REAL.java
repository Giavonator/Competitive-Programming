import java.util.Scanner;
    class Problem1REAL {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
			String endPrint = "";
            for(int testcase = 0; testcase < testCases; testcase++) {
                String line = input.nextLine();
				String[] eachWord = line.split(" ");
				int index = 0;
				for(int i = 0; i < eachWord.length; i++)
				{
					if(eachWord[i].equals("Nimo"))
					{
						index = i + 1;
					}
				}
				endPrint += index + "\n";
            }
			System.out.print(endPrint);
        }
    }
}

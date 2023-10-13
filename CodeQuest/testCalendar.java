import java.util.Calendar;
import java.util.Scanner;
    class testCalendar {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
			String endPrint = "";
            for(int testcase = 0; testcase < testCases; testcase++) {
                
                String [] theDate = input.nextLine().split(" ");
                Calendar date = Calendar.getInstance();
                date.set(Integer.parseInt(theDate[0]), Integer.parseInt(theDate[1]), Integer.parseInt(theDate[2]));
                endPrint += date.get(Calendar.DAY_OF_WEEK) + "\n";
                
               
            }
			System.out.print(endPrint);
        }
    }
}
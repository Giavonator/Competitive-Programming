import java.util.Scanner;
public class stringTask{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		line = line.toLowerCase();
		line = line.replaceAll("a", "");
		line = line.replaceAll("e", "");
		line = line.replaceAll("i", "");
		line = line.replaceAll("o", "");
		line = line.replaceAll("u", "");
		line = line.replaceAll("y", "");

		line = line.replaceAll("", ".");
		System.out.println(line.substring(0, line.length()-1));


		input.close();
	}
}
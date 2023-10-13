import java.util.Scanner;
import java.util.ArrayList;
public class letters3{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		boolean similar = true;
		boolean keepGoing = true;
		int caseNumber = 1;
		String output = "";
		while(keepGoing){
			similar = true;
			String wordOne = input.nextLine();
			String wordTwo = input.nextLine();

			if (wordOne.equals("END") && wordTwo.equals("END")){
				keepGoing = false;
				break;
			}
			else if (wordOne.length() != wordTwo.length()){
				output += "Case " + caseNumber + ": different\n";
			}
			else{
				ArrayList<String> fWord = new ArrayList<String>();
				ArrayList<String> sWord= new ArrayList<String>();
				for (int i = 0; i < wordOne.length();i++){
					fWord.add(wordOne.substring(i, i+1));
					sWord.add(wordTwo.substring(i, i+1));
				}
		
				while(fWord.size() > 0){
					if (sWord.contains(fWord.get(0))){
						sWord.remove(fWord.get(0));
						fWord.remove(0);
					}
					else{
						similar = false;
						break;
					}
				}
				if (similar){
				output += "Case " + caseNumber + ": same\n";
				}
				else{
				output += "Case " + caseNumber + ": different\n";
				}
			}
			caseNumber++;
		}
		System.out.print(output);
		input.close();
	
	}
}   
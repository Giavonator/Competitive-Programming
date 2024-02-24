import java.util.Scanner;
    class Problem12 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
			String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String decoded = "";
			String encoded = "";
			String[] key = new String[26];
            for(int testcase = 0; testcase < testCases; testcase++) {
                for(int i = 0; i < 26; i++)
				{
					String code = input.nextLine().substring(2);
					key[i] = code;
				}
				String word = input.nextLine();
				for(int L = 0; L < word.length();L++)
				{
					String letter = word.substring(L, L+1);
					if(letter.equals(" "))
					{
						encoded = encoded + "  ";
					}
					else
					{
						int index = alphabet.indexOf(letter);
						encoded = encoded + "  " + key[index];
					}
				}
				String morse = input.nextLine();
				String[] parts = morse.split("  ");
				for(int j = 0; j < parts.length;j++)
				{
					if (parts[j].equals(" "))
					{
						int morseIndex = 0;
						for(int g = 0; g < 26; g++)
						{
							if (parts[j].equals(key[g]))
							{
								morseIndex = g;
							}
						}
						String newLetter = alphabet.substring(morseIndex, morseIndex + 1);
						decoded = decoded + newLetter;
					}
				}
				System.out.println(encoded + "\n" + decoded);
            }
        }
    }
}
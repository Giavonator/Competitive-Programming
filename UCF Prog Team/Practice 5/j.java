import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
public class j{

    public static ArrayList<HashSet<Character>> conflicts = new ArrayList<>();
    public static String[] words;
    public static HashSet<Character> usedLetters = new HashSet<>();

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                        'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        words = new String[n];
        boolean repeat = false;


        for (int i = 0; i < n; i++){

            words[i] = input.next();
            char[] word = (words[i].toCharArray());
            HashSet<Character> wL = new HashSet<>();

            for (char x : word){
                if(wL.contains(x)) repeat = true;
                usedLetters.add(x);
                wL.add(x);
            }

        }


        if(repeat || usedLetters.size() > 18){
            System.out.println(0);
        }

        else{

            String w1 = words[0].substring(0,1);
            String w2 = words[0].substring(1,2);
            String w3 = words[0].substring(2,3);

            char[] p = words[0].toCharArray();

            HashSet<Character> one = new HashSet<Character>(); one.add(p[1]); one.add(p[2]);
            HashSet<Character> two = new HashSet<Character>(); two.add(p[0]); two.add(p[2]); 
            HashSet<Character> three = new HashSet<Character>(); three.add(p[0]); three.add(p[1]);
            conflicts.add(one); conflicts.add(two); conflicts.add(three);

 
            String[] results = DFS(w1, w2, w3, 1, n);

            if(results[0].equals("-1")) System.out.println("0");

            else{
				int letter = 0;
                for(int x = 0; x < 3; x++){
                    int length = results[x].length();
                    for (; letter < 26 && length < 6; letter++){
                       
                        if (!(usedLetters.contains(alpha[letter]))){
                            results[x] += alpha[letter];
                            length++;
                            if(length == 6){
								letter++;
								break;
							}
                        }
                    }
                   
                }
                System.out.println(results[0] + " " + results[1] + " " + results[2]);
            }

        }

 

        input.close();

    }

 

    public static String[] DFS(String w1, String w2, String w3, int wU, int n){
        String[] result =  {w1, w2, w3};

        if(wU == n && (w1.length() + w2.length() + w3.length()) == usedLetters.size()){
            return result;
        }

        String word1 = w1, word2 = w2, word3 = w3;
        char[] newWord = words[wU].toCharArray();

		//THIS HAS TO GO THROUGH ALL THE PERMUTATIONS OF THE THREE LETTTER WORD
		//THIS HAS TO GO THROUGH ALL THE PERMUTATIONS OF THE THREE LETTTER WORD
		//THIS HAS TO GO THROUGH ALL THE PERMUTATIONS OF THE THREE LETTTER WORD
		//THIS HAS TO GO THROUGH ALL THE PERMUTATIONS OF THE THREE LETTTER WORD
		//THIS HAS TO GO THROUGH ALL THE PERMUTATIONS OF THE THREE LETTTER WORD
		//THIS HAS TO GO THROUGH ALL THE PERMUTATIONS OF THE THREE LETTTER WORD
        for (int i = 0; i < 3; i++){

			System.out.println("Word1: " + w1 + "   Word2: " + w2 + "   Word3: " + w3  + "     WordsUsed:" + wU);
			


            boolean one = false, two = false, three = false;
            if(word1.contains(String.valueOf(newWord[i])) || conflicts.get(0).contains(newWord[i])) one = true;
            if(word2.contains(String.valueOf(newWord[(i+1)%3])) || conflicts.get(1).contains(newWord[(i+1)%3])) two = true;
            if(word3.contains(String.valueOf(newWord[(i+2)%3])) || conflicts.get(2).contains(newWord[(i+2)%3])) three = true;

			if(one && !word1.contains(String.valueOf(newWord[i]))) continue;
			if(two && !word2.contains(String.valueOf(newWord[(i+1)%3]))) continue;
			if(three && !word3.contains(String.valueOf(newWord[(i+2)%3]))) continue;
          

			boolean fS = true, fT = true, sF = true, sT = true, tF = true, tS = true;
            if(conflicts.get(0).contains(newWord[(i+1)%3])) fS = false;
            if(conflicts.get(0).contains(newWord[(i+2)%3])) fT = false;
            if(conflicts.get(1).contains(newWord[i])) sF = false;
            if(conflicts.get(1).contains(newWord[(i+2)%3])) sT = false;
            if(conflicts.get(2).contains(newWord[i])) tF = false;
            if(conflicts.get(2).contains(newWord[(i+1)%3])) tS = false;
            conflicts.get(0).add(newWord[(i+1)%3]);
            conflicts.get(0).add(newWord[(i+2)%3]);
            conflicts.get(1).add(newWord[i]);
            conflicts.get(1).add(newWord[(i+2)%3]);
            conflicts.get(2).add(newWord[i]);
            conflicts.get(2).add(newWord[(i+1)%3]);

 

            if (!one) word1 += newWord[i];
            if (!two) word2 += newWord[(i+1)%3];
            if (!three) word3 += newWord[(i+2)%3];

            if(word1.length() < 7 && word2.length() < 7 && word3.length() < 7){
                result = DFS(word1, word2, word3, (wU+1), n);
                if (!(result[0].equals("-1"))) return result;
            }

            if(fS) conflicts.get(0).remove(newWord[(i+1)%3]);
            if(fT) conflicts.get(0).remove(newWord[(i+2)%3]);
            if(sF) conflicts.get(1).remove(newWord[i]);
            if(sT) conflicts.get(1).remove(newWord[(i+2)%3]);
            if(tF) conflicts.get(2).remove(newWord[i]);
            if(tS) conflicts.get(2).remove(newWord[(i+1)%3]);
            word1 = w1; word2 = w2; word3 = w3;

        }

        System.out.println();
        return result;
    }
}
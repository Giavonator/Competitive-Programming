import java.util.*;
public class threesq{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		int w1 = input.nextInt();
		int h1 = input.nextInt();
		int w2 = input.nextInt();
		int h2 = input.nextInt();
		int w3 = input.nextInt();
		int h3 = input.nextInt();

		
		if((w1 + w2 + w3 == h1) && (h1 == h2) && (h1 == h3) && (h2 == h3)){
			System.out.println(1);
		}

		else if((h1 + h2 + h3 == w1) && (w1 == w2) && (w1 == w3) && (w2 == w3)){
			System.out.println(1);
		}

		else if(w1 == w2 && ((w3 == h3 + w1) || (h3 == w3 + w1))){
			System.out.println(1);
		}

		else if(w2 == w3 && ((w1 == h1 + w2) || (h1 == w1 + w2))){
			System.out.println(1);			
		}

		else if(w3 == w1 && ((w2 == h2 + w3) || (h2 == w2 + w3))){
			System.out.println(1);			
		}

		else if(h1 == h2 && ((w3 == h3 + h1) || (h3 == w3 + h1))){
			System.out.println(1);			
		}

		else if(h2 == h3 && ((w1 == h1 + h2) || (h1 == w1 + h2))){
			System.out.println(1);
		}

		else if(h3 == h1 && ((w2 ==h2 + h3) || (h2 == w2 + h3))){
			System.out.println(1);
		}
		
		else{
			System.out.println(0);
		}

		input.close();
	}


}
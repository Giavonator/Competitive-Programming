import java.util.*;
public class testTubes{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		for(int t = 0; t < T; t++){
			int N = input.nextInt();
			int P = input.nextInt();
			char[] typesF = (input.next()).toCharArray();
			char[] typesS = (input.next()).toCharArray();
			Stack<Integer> first = new Stack<>();
			Stack<Integer> second = new Stack<>();

			char f = typesF[0];
			char s = typesS[0];
			first.push(f - '0');
			second.push(s - '0');

			for(int i = 1; i < N; i++){

				if(typesF[i] != f){
					first.push(typesF[i] - '0');
					f = typesF[i];
				}

				if(typesS[i] != s){
					second.push(typesS[i] - '0');
					s = typesS[i];
				}

			}

			if(first.size() == 1 && second.size() == 1){
				System.out.println(0);
				continue;
			}

			long M = first.size() + second.size() - 1;
			int fNum = 0; int sNum = 0;
			if(first.size() >= second.size()){
				fNum = 1; sNum = 2;
			}
			else{
				fNum = 2; sNum = 1;
			}

			Stack<Integer> longer = new Stack<>();
			longer.addAll(first.size() >= second.size() ? first : second);

			Stack<Integer> shorter = new Stack<>();
			shorter.addAll(first.size() < second.size() ? first : second);


			long fC = longer.size() - 1;
			if (longer.peek() == longer.firstElement() && longer.peek() != shorter.peek()){
				M++; fC++;
			}
			
			boolean single = false;
			if(longer.size() == 1 || shorter.size() == 1){
				M = Math.max(longer.size(), shorter.size()) - 1;
				single = true;
			}
			

			System.out.println(M);

			if(P == 1) continue;
			else{
				
				if(single && first.peek() == second.peek()){
					System.out.println(fNum + " " + sNum);
					continue;
				}


				int third = 0;
				if(shorter.peek() == 1) third = 2;
				else third = 1;

				for(int i = 0; i < fC; i++){
					if(longer.pop() == shorter.peek()){
						System.out.println(fNum + " " + sNum);
					}
					else {
						System.out.println(fNum + " 3");
						
					}
				}

				int bF = 0;
				if(longer.size() == 0) bF = shorter.peek();
				else bF = longer.peek();

				while(shorter.size() > 1){	

					//System.out.println("PEEK " + (int)second.peek());
					if(shorter.pop() == bF){
						System.out.println(sNum + " " + fNum);
					}
					else {
						System.out.println(sNum + " 3");
						
					}
				}

				if(third == shorter.peek()){
					System.out.println("3 " + sNum);
				}
				else System.out.println("3 " + fNum);
				
			}


		}

		input.close();
	}


}
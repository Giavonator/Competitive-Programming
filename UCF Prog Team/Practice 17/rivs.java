import java.util.*;
public class rivs{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		long N = input.nextLong();
		long K = input.nextLong();

		ArrayList<Long> first = new ArrayList<>();
		ArrayList<Long> second = new ArrayList<>();

		int F = input.nextInt();
		for(int i = 0; i < F; i++) first.add(input.nextLong());

		int S = input.nextInt();
		for(int x = 0; x < S; x++) second.add(input.nextLong());

		input.close();


		int f = 0, s = 0;
		ArrayList<Long> addition = new ArrayList<>();
		while(f < F && s < S){

			//System.out.println(f + " " + s);
			if(first.get(f) == second.get(s)) {
				addition.add(first.get(f));
				s++; f++;
			}

			else if(first.get(f) + second.get(s) == 0) {
				s++; f++;
			}
			
			else if(Math.abs(first.get(f)) < Math.abs(second.get(s))){
				addition.add(first.get(f));
				f++;
			}
			
			else if(Math.abs(first.get(f)) > Math.abs(second.get(s))){
				addition.add(second.get(s));
				s++;
			}

			else f++;
		}

		if(f == F && s != S){
			for(; s < S; s++) addition.add(second.get(s)); s++;
		}

		else if(s == S && f != F){
			for(; f < F; f++) addition.add(first.get(f)); f++;
		}

		System.out.print(addition.size() + " ");
		for(int i = 0; i < addition.size(); i++){
			System.out.print(addition.get(i) + " ");
		}
		System.out.println();



		ArrayList<Long> products = new ArrayList<>();
		f = 0; s = 0;

		while(f < F && s < S){

			long fir = first.get(f); long firAbs = Math.abs(fir);
			long sec = second.get(s); long secAbs = Math.abs(sec);

			if(firAbs == secAbs) {

				if((fir + sec > 0) || (fir + sec < 0)) products.add(firAbs);
				
				else products.add(-1 * firAbs);


				s++; f++;
			}
			
			else if(firAbs < secAbs) f++;
			else s++;

		}
		

		System.out.print(products.size() + " ");
		for(int i = 0; i < products.size(); i++){
			System.out.print(products.get(i) + " ");
		}
		System.out.println();

		shift(K, N, first);
		shift(K, N, second);



		System.out.print(first.size() + " ");
		for(int i = 0; i < first.size(); i++){
			System.out.print(first.get(i) + " ");
		}
		System.out.println();


		System.out.print(second.size() + " ");
		for(int i = 0; i < second.size(); i++){
			System.out.print(second.get(i) + " ");
		}
		System.out.println();

		
	}

	public static void shift(long K, long N, ArrayList<Long> vectors){

		int length = vectors.size();
		for(int i = 0; i < length; i++){
			

			if(Math.abs(vectors.get(i)) > K){
				
				if(vectors.get(i) > 0) vectors.set(i, vectors.get(i) - K);
				else vectors.set(i, vectors.get(i) + K);

			}

			else{
				
				if(vectors.get(i) > 0) vectors.add(N - (K - vectors.get(i)));
				else vectors.add((-1* N) + (vectors.get(i) + K));

				vectors.remove(i);
				i--; length--;
			}

		}

	}

}
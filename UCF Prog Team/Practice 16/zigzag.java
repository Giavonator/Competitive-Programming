import java.util.*;
public class zigzag{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();

		if(N == 1) {
			System.out.println(1);
		}

		else{
			int first = input.nextInt();
			int second = input.nextInt();

			int increasing = 0;
			if(first < second) increasing = 1;

			int count = 1;
			if(first != second) count++;

			int last = second;

			for(int i = 2; i < N; i++){

				int next = input.nextInt();

				if(increasing == 1){
					if(next >= last) last = next;
					else{
						increasing = 0;
						count++;
						last = next;
					}
				}

				else{

					if(next <= last) last = next;
					else{
						increasing = 1;
						count++;
						last = next;
					}

				}


			}

			System.out.println(count);

		}


		input.close();
	}


}
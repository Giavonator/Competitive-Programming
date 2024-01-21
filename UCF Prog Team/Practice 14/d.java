import java.util.*;
public class d{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		boolean goodJob = true;
		int[] array = new int[N];
		
		for(int i = 0; i < N; i++)
			array[i] = input.nextInt();

		int x = 0;
		for(int i = 1; i < array[N-1]; i++){
			if(i != array[x]){
				System.out.println(i);
				goodJob = false;
			}
			else{
				x++;
			}
		}
		
		
	

		if(goodJob) System.out.println("good job");

		input.close();
	}


}
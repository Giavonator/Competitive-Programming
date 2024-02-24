import java.util.*;
public class prob3{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		for(int t = 0; t < T; t++){
			int salary = input.nextInt();
			if(salary < 11001){
				System.out.println(String.format("%.0f", salary * 0.1));
			}
			else if(salary < 44726){
				System.out.println(String.format("%.0f", salary * 0.12));
			}
			else if(salary < 95376){
				System.out.println(String.format("%.0f", salary * 0.22));
			}
			else if(salary < 182101){
				System.out.println(String.format("%.0f", salary * 0.24));
			}
			else if(salary < 231251){
				System.out.println(String.format("%.0f", salary * 0.32));
			}
			else if(salary < 578126){
				System.out.println(String.format("%.0f", salary * 0.35));
			}
			else{
				System.out.println(String.format("%.0f", salary * 0.37));
			}


		}

		input.close();
	}
}
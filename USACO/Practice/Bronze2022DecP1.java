import java.util.Scanner;
import java.util.Arrays;

public class Bronze2022DecP1{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		long n = input.nextLong();
		long curTuition = 0;
		long curMoney = -1;

		long[] tuitions = new long[(int)n];

		for(int i = 0; i < n; i++){
			tuitions[i] = input.nextLong();
		}

		Arrays.sort(tuitions);

		for (int i = 0; i < n; i++){
			if (curMoney < (n - i) * (tuitions[i])){
				curMoney = (n-i) * tuitions[i];
				curTuition = tuitions[i];
			}
		}

		System.out.println(curMoney + " " + curTuition);

		input.close();
	}
}
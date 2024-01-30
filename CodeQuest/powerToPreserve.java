import java.util.*;
public class powerToPreserve{


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		
		for(int x = 0; x < T; x++){
			
			double wheelDiameter = input.nextInt() * 0.01;
			double mtrRevNeeded = input.nextInt();
			double oneMtrRevPwr = input.nextInt();
			double mtrSpeed = input.nextInt();
			double availableCurrent = input.nextInt();
			double voltage = input.nextInt();
			double distance = input.nextInt();

			double dPMR = (wheelDiameter * Math.PI) / mtrRevNeeded;
			double mRN = distance / dPMR;
			//System.out.println(mRN);
			double tPN = mRN * oneMtrRevPwr;
			//System.out.println(tPN);
			double aCN = tPN / voltage;
			double aHN = aCN * (mRN / mtrSpeed) / 60;

			//double power = availableCurrent * voltage;

			if(aHN > availableCurrent){
				System.out.println("Fail");
			}
			else{
				double time = mRN / mtrSpeed;
				System.out.println("Success " + String.format("%.4f", time));
				
			}

			
		}

		input.close();
	}


}
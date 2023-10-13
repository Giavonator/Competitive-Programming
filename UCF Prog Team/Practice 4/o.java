import java.util.*;
public class o{

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		int truckCap = input.nextInt();
		int boatCap = input.nextInt();
		int veniceReq = input.nextInt();
		int mestreReq = input.nextInt();

		int totalReq = veniceReq + mestreReq;
		
		int numTrucks = totalReq / truckCap;
		if (totalReq % truckCap != 0) numTrucks++;

		int load = numTrucks * truckCap;
		load -= mestreReq;

		if (load % boatCap != 0){
			System.out.println("No solution.");
		}
		else{
			int numBoats = load / boatCap;
			System.out.print("We need " + numTrucks + " truck");
			if (numTrucks != 1) System.out.print("s");
			System.out.print(" and " + numBoats + " boat");
			if (numBoats != 1) System.out.print("s");
			System.out.println(".");


		}
		

		input.close();
	}
}
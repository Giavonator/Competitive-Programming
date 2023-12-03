import java.util.*;
public class fun{

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		int W = Integer.parseInt(input.next());
		int L = Integer.parseInt(input.next());
		int hNum = 1;

		while(W != 0){
			System.out.println("HOUSE " + hNum);
			char[][] house = new char[L][W];
			int height = 0, width = 0;
			boolean found = false;
			int vert = 0, horiz = 0;
			
			for(int i = 0; i < L; i++){
				char[] array = (input.next()).toCharArray();
				if (!found){
					if (i == 0 || i == L-1){
						for(int x = 0; x < W; x++){
							if(array[x] == '*'){
							height = i;
							width = x;
							found = true;
							break;
							}
						}
					}
					else {
						if (array[0] == '*'){
							height = i;
							width = 0;
							found = true;
						}
						else if (array[W-1] == '*'){
							height = i;
							width = W-1;
							found = true;
						}
					}
				}
				house[i] = array;
			}

			if (height == 0) vert = 1;
			else if (width == 0) horiz = 1;
			else if (height == L-1) vert = -1;
			else horiz = -1;
		

			while(true){
				height += vert;
				width += horiz;
				char next = house[height][width];
				
				if (next == 'x'){
					house[height][width] = '&';
					break;
				}
				else if (next == '/'){
					if (horiz == 0){
						if(vert == 1) horiz = -1;
						else horiz = 1;
						vert = 0;
					}
					else{
						if(horiz == 1) vert = -1;
						else vert = 1;
						horiz = 0;
					}
				}
				else if (next == '\\'){
					if (horiz == 0){
						if(vert == 1) horiz = 1;
						else horiz = -1;
						vert = 0;
					}
					else{
						if(horiz == 1) vert = 1;
						else vert = -1;
						horiz = 0;
					}
				}
			}

			for (char[] x : house){
				for (char i : x){
					System.out.print(i);
				}
				System.out.println();
			}

			W = Integer.parseInt(input.next());
			L = Integer.parseInt(input.next());
			hNum++;
		
		}

		input.close();
	}
}
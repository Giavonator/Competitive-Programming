import java.util.*;
public class paintingFencePosts{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		HashSet<String> coords = new HashSet<>();
		coords.add("1x1");
		coords.add("1x2");
		coords.add("1x3");
		coords.add("1x3");
		coords.add("1x3");
		coords.add("2x3");
		coords.add("23x3");
		coords.add("2x33");

		ArrayList<String> posts = new ArrayList<>(coords);
		for(String post : posts){
			System.out.println(post);
		}


		input.close();
	}
	
}




		// HashSet<ArrayList<Integer>> coords = new HashSet<>();
		// coords.add(new ArrayList<>(){{add(1); add(2);}});
		// coords.add(new ArrayList<>(){{add(2); add(2);}});
		// coords.add(new ArrayList<>(){{add(3); add(2);}});
		// coords.add(new ArrayList<>(){{add(4); add(2);}});
		// coords.add(new ArrayList<>(){{add(1); add(2);}});
		// coords.add(new ArrayList<>(){{add(2); add(2);}});
		// coords.add(new ArrayList<>(){{add(3); add(3);}});

		// ArrayList<ArrayList<Integer>> posts = new ArrayList<>(coords);
		// for(ArrayList<Integer> post : posts){
		// 	for(int x : post){
		// 		System.out.print(x + " ");
		// 	}
		// 	System.out.println();
		// }
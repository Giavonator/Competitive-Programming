// Java program to print all combination of size r in an array of size n

class allPermsOfSizeN {

	/* arr[] ---> Input Array
	data[] ---> Temporary array to store current combination
	start & end ---> Starting and Ending indexes in arr[]
	index ---> Current index in data[]
	r ---> Size of a combination to be printed */
	static void combinationUtil(int arr[], int data[], int start,
								int end, int index, int r)
	{
		// Current combination is ready to be printed, print it
		if (index == r)
		{
			for (int j=0; j<r; j++)
				System.out.print(data[j]+" ");
			System.out.println("");
			return;
		}
		// replace index with all possible elements. The condition
		// "end-i+1 >= r-index" makes sure that including one element
		// at index will make a combination with remaining elements
		// at remaining positions
		for (int i=start; i<=end && end-i+1 >= r-index; i++)
		{
			data[index] = arr[i];
			combinationUtil(arr, data, i+1, end, index+1, r);
		}
	}



	/*Driver function to check for above function*/
	public static void main (String[] args) {
		int arr[] = {0, 1, 2, 3, 4};
		int r = 3;
		int n = arr.length;
		int data[]=new int[r];
		combinationUtil(arr, data, 0, n-1, 0, r);
	}
}

/* This code is contributed by Devesh Agrawal */

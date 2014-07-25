/*
	Sergio Cancinos 13062
	María Isabel Fernandez 13024
	Ana Bartra 13643
	
	InsertionSort.java
	
	
*/

public static void insertionSort(int data[], int n)
	// pre: 0 <= n <= data.length
	// post: values in data[0..n-1] are in ascending order
	{
		int numSorted = 1; // number of values in place
		int index; // general index
		while (numSorted < n)
		{
			// take the first unsorted value
			int temp = data[numSorted];
			// ...and insert it among the sorted:
			for (index = numSorted; index > 0; index--)
			{
				if (temp < data[index-1])
			{
				data[index] = data[index-1];
				} else {
				break;
				}
			}
// reinsert value
	data[index] = temp;
	numSorted++;
		}
}
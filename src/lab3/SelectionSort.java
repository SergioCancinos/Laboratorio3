/*
	Sergio Cancinos 13062
	María Isabel Fernandez 13024
	Ana Bartra 13643
	
	SelectionSort.java
	Se encarga de encontrar un el valor máximo en la lista, asume que el primero es el máximo al principio
	y cuando encuentra uno mayor se actualiza el index. 

*/



public static void selectionSort(int data[], int n)
	// pre: 0 <= n <= data.length
	// post: values in data[0..n-1] are in ascending order
	{
		int numUnsorted = n;
		int index; // general index
		int max; // index of largest value
		while (numUnsorted > 0)
		{
			// determine maximum value in array
			max = 0;
			for (index = 1; index < numUnsorted; index++)
			{
				if (data[max] < data[index]) max = index;
			}
		swap(data,max,numUnsorted-1);
		numUnsorted--;
	}
}
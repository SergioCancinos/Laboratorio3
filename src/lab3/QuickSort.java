/*
	Sergio Cancinos 13062
	María Isabel Fernandez 13024
	Ana Bartra 13643
	
	QuickSort.java
	Coloca los datos menos a la izquierda y aquellos que son mayores los coloca a la izquierda. 

*/

private static int partition(int data[], int left, int right)
		// pre: left <= right
		// post: data[left] placed in the correct (returned) location
	{
	while (true)
	{
		// move right "pointer" toward left
		while (left < right && data[left] < data[right]) right--;
		if (left < right) swap(data,left++,right);
		else return left;
		// move left pointer toward right
		while (left < right && data[left] < data[right]) left++;
		if (left < right) swap(data,left,right--);
		else return right;
	}
}
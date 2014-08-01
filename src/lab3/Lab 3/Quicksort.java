
/*
	Sergio Cancinos 13062
	María Isabel Fernandez 13024
	Ana Bartra 13643
	
	QuickSort.java
	Coloca los datos menos a la izquierda y aquellos que son mayores los coloca a la izquierda. 
        Obtenido del libro de referencia de la clase.
*/
public class Quicksort implements Sort {
    public void Sort(int[] lista){
        quickSort(lista,0,lista.length-1);
    }

private static int quickSort(int data[], int left, int right)	// post: data[left] placed in the correct (returned) location
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
public static void swap(int data[], int i, int j)
// pre: 0 <= i,j < data.length
// post: data[i] and data[j] are exchanged
{
int temp;
temp = data[i];
data[i] = data[j];
data[j] = temp;
}
}

/*
 * HECHO POR:
 * SERGIO CANCIONOS 13062
 * ANA BARTRA 13643
 * MA. ISABEL FERNANDEZ 13024
  Se encarga de hacer el bubbleSort para la lista, poniendo los datos mayores al final de la lista. 
 */
public class BubbleSort implements Sort {
public static void bubbleSort(int data[], int n)
// pre: 0 <= n <= data.length
// post: values in data[0..n-1] in ascending order
{
    int numSorted = 0; // number of values in order
    int index; // general index
    while (numSorted < n)
{
// bubble a large element to higher array index
    for (index = 1; index < n-numSorted; index++)
{
    if (data[index-1] > data[index])
    swap(data,index-1,index);
}
// at least one more value in place
    numSorted++;
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

    public void Sort(int[] lista) {
         bubbleSort(lista,lista.length-1);
    }
}

/*
 * HECHO POR:
 * SERGIO CANCIONOS 13062
 * ANA BARTRA 13643
 * MA. ISABEL FERNANDEZ 13024
	El main de las clases  se encarga de mandar a llamar al random para crear la lista y crear los datos luego de esto utiliza uno de los 4 sorts. 
 */
 
public class MainLab3 {
    static Randomizer rand = new Randomizer();
	static int [] lista_revolution;
public static void main(String[] args) {
    rand.aleatorio();
	lista_revolution=rand.obtenerLista();
	/*Quicksort mi_QuickSort= new Quicksort();
	mi_QuickSort.Sort(lista_revolution);
        InsertionSort mi_InsertionSort= new InsertionSort();
	mi_InsertionSort.Sort(lista_revolution);	*/
        BubbleSort mi_BubbleSort= new BubbleSort();
	mi_BubbleSort.Sort(lista_revolution);
	}
}

/*
 * HECHO POR:
 * SERGIO CANCIONOS 13062
 * ANA BARTRA 13643
 * MA. ISABEL FERNANDEZ 13024
  Clase que se encarga de crear la lista y crear los 2000 datos random, aparte de esto 
 */
import java.util.Random;
public class Randomizer{
//Atritubos, se definen las variables y su tipo
	private int num1;
	private int [ ] listaRandom;
	private int contador;
	private Random nrand;
	private Datos misDatos;
	private int [] mi_lista;
	//Constructores
	public Randomizer (){// los datos se inicializan
	contador=0;
	nrand = new Random(); //se crea el objeto
	listaRandom = new int [2000];
	misDatos = new Datos("documento");
	}
	public void aleatorio(){
		while (contador <2000)
		{
		// Se generan los tres números nuevos
		 num1 = nrand.nextInt(100);
		 listaRandom[contador]=(num1);
		 contador=contador+1;
		 misDatos.escribeDatos(num1);
		 }
	}
	public int [] obtenerLista(){
		mi_lista= misDatos.leerDatos();
		return mi_lista;
	}

}

/*
 * HECHO POR:
 * SERGIO CANCIONOS 13062
 * ANA BARTRA 13643
 * MA. ISABEL FERNANDEZ 13024
Se encarga de crear el archivo en  y el folder en dónde se guarda el archivo de datos, además posee un metodo en el cual
se pueden escribir datos en el archivo. 
 
 */
import java.io.*;
import java.util.*;
public class Datos {
private int cont=0;
		//Unico atributo de la clase
		File archivo = 	null;//Almacena el archivo en donde se guardaran los datos
		java.io.File directorio = null;

		//Constructor que inicializa
		public Datos(String nombre){
			directorio = new File("C:\\Lab3");
			if(!directorio.exists()){
				directorio.mkdirs();
			}
			try{
				archivo = new File("C:\\Lab3\\"+nombre+".txt");
				if(!archivo.exists()){
					archivo.createNewFile();
				}
			}
			catch(Exception e){
				e.printStackTrace();
			}

		}

		//Metodo que escribe datos nuevos en el archivo de texto
		public void escribeDatos(int texto){
			FileWriter fichero = null;
			PrintWriter pw = null;
			try{
				fichero = new FileWriter(archivo, true);
				pw = new PrintWriter(fichero);
				pw.println(texto);
			}
			catch(Exception e){
				e.printStackTrace();
			}
			finally{
				try{
					if(null!=fichero)
						fichero.close();
				}
				catch(Exception e2){
					e2.printStackTrace();
				}
			}
		}
	//Metodo que recorre toda la lista
		public int[] leerDatos(){
			FileReader fr = null;
			BufferedReader br = null;
                        int datos[]= new int[2000];
             int cont=0;
			try{
				fr = new FileReader(archivo);
				br = new BufferedReader(fr);
				String linea;
				while ((linea = br.readLine())!=null){
                                     datos[cont]=Integer.parseInt(linea);
                                     cont+=1;
				}
               
			}
			catch(Exception e){
				e.printStackTrace();
			}
			finally{
				try{
					if(null != fr ){
						fr.close();
                                        }
				}
				catch(Exception e2){
					e2.printStackTrace();
				}
			}
            return datos;
		}
}

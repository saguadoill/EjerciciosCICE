package pruebas_cice;

import static java.lang.Math.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class RepasoPosNavidad {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub

		pow(2,5);  // Usarlos como si fueran metodos de la propia clase, para eso lo importamos
		
		Math.pow(2, 5); // directamente desdede la clase Math, mas sencillo de entender al leer codigo
		
		
	
		//Salida de datos, ejemplo
		PrintStream ps  = new PrintStream(new File("src/texto.txt"));
		
		//pinta la frase en el fichero
		ps.println("Esto es otra cadena");
	}

}

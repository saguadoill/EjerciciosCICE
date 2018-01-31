package saguado.vista;

import saguado.interfaces.EnumMateriales;
import saguado.interfaces.Poligono;
import saguado.interfaces.clases.Cuadrado;
import saguado.interfaces.clases.FiguraGeometrica;
import saguado.interfaces.clases.Pentagono;

/**
 * Aplicacion para practicar la herencia y el uso de interfaces
 * @author Sergio
 *
 */
public class Main {

	public static void main(String[]args) {
		
		FiguraGeometrica pentagono = new Pentagono(EnumMateriales.CARTON, false, 5, "verano", false);		
		
		Poligono poligono = pentagono;
				
		poligono.fabricar(234);
		poligono.vender();
		
		FiguraGeometrica cuadrado = new Cuadrado(EnumMateriales.PLASTICO, true, 5, "verano", true);
		
		poligono = cuadrado;
		poligono.fabricar(15);
		poligono.vender();
		
	}
}

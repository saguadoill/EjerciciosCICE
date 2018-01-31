package saguado.interfaces.clases;

import saguado.interfaces.EnumMateriales;


/**
 * Clase que hereda de FigurasGeometricas
 * @author Sergio
 *
 */
public class Pentagono extends FiguraGeometrica {
	
	public Pentagono(EnumMateriales material, boolean color, int lados, String temporada, boolean autor) {
		super(material, color, lados, temporada, autor);
		
	}
	
	@Override
	public void vender() {
		
		
	}
	@Override
	public void fabricar(int cantidad) {
		
		
	}
	@Override
	public void comprobarStock() {
		
		
	}

	
	

	
}

package saguado.interfaces.clases;

import saguado.interfaces.EnumMateriales;

/**
 * Clase que hereda de FigurasGeometricas
 * @author Sergio
 *
 */
public class Cuadrado extends FiguraGeometrica {

	public Cuadrado(EnumMateriales material, boolean color, int lados, String temporada, boolean autor) {
		super(material, color, lados, temporada, autor);
		
	}
	
	@Override
	public void vender() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fabricar(int cantidad) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comprobarStock() {
		// TODO Auto-generated method stub
		
	}

	
}

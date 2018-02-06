package saguado.interfaces.clases;


import java.util.GregorianCalendar;
import saguado.interfaces.enums.Coleccion;

public class Comic extends Articulo {

	private int numero;
	private Coleccion coleccion;
	
	
	public Comic(GregorianCalendar fechaPublicacion, String titulo, int numero, Coleccion coleccion) {
		super(fechaPublicacion, titulo);
		this.numero = numero;
		this.coleccion = coleccion;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public Coleccion getColeccion() {
		return coleccion;
	}


	public void setColeccion(Coleccion coleccion) {
		this.coleccion = coleccion;
	}
	
	
}

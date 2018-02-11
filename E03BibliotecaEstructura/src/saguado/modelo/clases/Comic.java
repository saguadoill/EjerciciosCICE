package saguado.modelo.clases;

import java.util.GregorianCalendar;

public class Comic extends Articulo {

	private int numero;
	private String coleccion;
	
	
	public Comic(GregorianCalendar fechaPublicacion, String titulo, int numero, String coleccion) {
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


	public String getColeccion() {
		return coleccion;
	}


	public void setColeccion(String coleccion) {
		this.coleccion = coleccion;
	}
	
	
}

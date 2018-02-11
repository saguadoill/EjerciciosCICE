package saguado.modelo.clases;

import java.util.GregorianCalendar;


public class Revista extends Articulo{

	private int numero;
	private String periodicidad;
	

	public Revista(GregorianCalendar fechaPublicacion, String titulo, int numero, String periodicidad) {
		super(fechaPublicacion, titulo);
		this.numero = numero;
		this.periodicidad = periodicidad;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getPeriodicidad() {
		return periodicidad;
	}


	public void setPeriodicidad(String periodicidad) {
		this.periodicidad = periodicidad;
	}
	
}

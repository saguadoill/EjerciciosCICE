package saguado.interfaces.clases;

import java.util.GregorianCalendar;

import saguado.interfaces.enums.Periodicidad;

public class Revista extends Articulo{

	private int numero;
	private Periodicidad periodicidad;
	

	public Revista(GregorianCalendar fechaPublicacion, String titulo, int numero, Periodicidad periodicidad) {
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


	public Periodicidad getPeriodicidad() {
		return periodicidad;
	}


	public void setPeriodicidad(Periodicidad periodicidad) {
		this.periodicidad = periodicidad;
	}
	
}

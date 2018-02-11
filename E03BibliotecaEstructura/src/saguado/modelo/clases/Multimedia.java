package saguado.modelo.clases;

import java.util.GregorianCalendar;

public class Multimedia extends Articulo {
	
	
	private String formato;
	private int duracion;
	
	
	public Multimedia(GregorianCalendar fechaPublicacion, String titulo, String formato, int duracion) {
		super(fechaPublicacion, titulo);
		this.formato = formato;
		this.duracion = duracion;
	}


	public String getFormato() {
		return formato;
	}


	public void setFormato(String formato) {
		this.formato = formato;
	}


	public int getDuracion() {
		return duracion;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
}

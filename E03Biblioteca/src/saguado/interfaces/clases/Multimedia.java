package saguado.interfaces.clases;

import java.util.GregorianCalendar;

import saguado.interfaces.enums.FormatoMultimedia;

public class Multimedia extends Articulo {
	
	
	private FormatoMultimedia formato;
	private int duracion;
	
	
	public Multimedia(GregorianCalendar fechaPublicacion, String titulo, FormatoMultimedia formato, int duracion) {
		super(fechaPublicacion, titulo);
		this.formato = formato;
		this.duracion = duracion;
	}


	public FormatoMultimedia getFormato() {
		return formato;
	}


	public void setFormato(FormatoMultimedia formato) {
		this.formato = formato;
	}


	public int getDuracion() {
		return duracion;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
}

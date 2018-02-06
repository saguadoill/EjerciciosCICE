package saguado.interfaces.clases;

import java.util.GregorianCalendar;

import saguado.interfaces.enums.FormatoMultimedia;

public class Disco extends Multimedia {

	
	
	public Disco(GregorianCalendar fechaPublicacion, String titulo, FormatoMultimedia formato, int duracion) {
		super(fechaPublicacion, titulo, formato, duracion);
		
	}

}

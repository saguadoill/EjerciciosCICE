package saguado.interfaces;


import java.util.GregorianCalendar;

public interface InterfaceArticulo {
	
	boolean estaRentado();
	
	void rentar();

	GregorianCalendar getFechaPublicacion();
	
	String getTitulo();
}

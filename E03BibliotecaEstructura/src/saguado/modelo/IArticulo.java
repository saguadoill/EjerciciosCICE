package saguado.modelo;

import java.util.GregorianCalendar;

/**
 * Interface que añade toda la funcionabilidad del prestamo a los articulos.
 * @author Sergio
 *
 */
public interface IArticulo {
	
	boolean estaPrestado();
	
	boolean esPrestable(String nombreArticulo);
	
	void prestar();
	
	void devolve();

	GregorianCalendar getFechaPublicacion();
	
	String getTitulo();
	
	
}

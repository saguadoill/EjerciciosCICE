package saguado.interfaces.clases;



import java.util.Date;
import java.util.GregorianCalendar;

import saguado.interfaces.enums.Autor;

public class Libro extends Articulo {

	private String edicion;
	private String isbn;
	private Autor autor;
	
	
	public Libro(GregorianCalendar fechaPublicacion, String titulo, String edicion, String isbn, Autor autor) {
		super(fechaPublicacion, titulo);
		this.edicion = edicion;
		this.autor = autor;
		this.isbn = isbn;
	}


	public String getEdicion() {
		return edicion;
	}


	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public Autor getAutor() {
		return autor;
	}


	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	
}

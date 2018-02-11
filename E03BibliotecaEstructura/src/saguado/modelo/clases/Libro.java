package saguado.modelo.clases;

import java.util.GregorianCalendar;

public class Libro extends Articulo {

	private String edicion;
	private String isbn;
	private String autor;
	
	
	public Libro(GregorianCalendar fechaPublicacion, String titulo, String edicion, String isbn, String autor) {
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


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
}

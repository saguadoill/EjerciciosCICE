package saguado.modelo.clases;

import java.util.GregorianCalendar;
import saguado.modelo.IArticulo;
import saguado.modelo.enums.ArticulosPrestables;

public class Articulo implements IArticulo {

	private GregorianCalendar fechaPublicacion;
	private GregorianCalendar fechaPrestamo;
	private String titulo;
	private boolean prestado;
	
	
	public Articulo(GregorianCalendar fechaPublicacion, String titulo) {
		super();
		this.fechaPublicacion = fechaPublicacion;
		this.titulo = titulo;
	}


	public void setFechaPublicacion(GregorianCalendar fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}



	public GregorianCalendar getFechaPrestamo() {
		return fechaPrestamo;
	}



	public void setFechaPrestamo(GregorianCalendar fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	

	/**
	 * Metodo que comprueba si un articulo esta en prestamo o no.
	 */
	@Override
	public boolean estaPrestado() {
		if(this.prestado) {
			return true;
		}else {
			return false;
		}
	}


	/**
	 * Metodo que comprueba primero si el articulo que se quiere prestar es prestable o no.
	 * En caso de ser prestable, cambia la variable prestado a true
	 */
	@Override
	public void prestar(){
		
		if(esPrestable(this.getClass().getSimpleName())) {
			this.setPrestado(true);
		}else {
			System.out.println("ESTE ARTICULO NO ESTA HABILITADO PARA EL PRESTAMO");
		}
			
	}

	/**
	 * Metodo que al devolver el articulo prestado, cambia la variable prestado de nuevo a false
	 */
	@Override
	public void devolve() {
		
		this.setPrestado(false);
		
	}


	/**
	 * Metodo que comprueba si un articulo puede ser prestado o no.
	 */
	@Override
	public boolean esPrestable(String clase) {
		
		if(ArticulosPrestables.valueOf(clase.toUpperCase()).isEsPrestable()) {
			return true;
		}else {
			return false;
		}
		
	}
	
	@Override
	public GregorianCalendar getFechaPublicacion() {
		
		return fechaPublicacion;
	}
	
	@Override
	public String getTitulo() {
		return titulo;
	}


	
}

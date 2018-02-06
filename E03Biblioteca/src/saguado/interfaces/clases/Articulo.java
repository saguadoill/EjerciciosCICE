package saguado.interfaces.clases;

import java.util.Date;
import java.util.GregorianCalendar;

import saguado.interfaces.InterfaceArticulo;

public class Articulo implements InterfaceArticulo {

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
	

	@Override
	public boolean estaRentado() {
		if(this.prestado) {
			return true;
		}else {
			return false;
		}
	}


	@Override
	public void rentar() {
		
		this.setPrestado(true);
		
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

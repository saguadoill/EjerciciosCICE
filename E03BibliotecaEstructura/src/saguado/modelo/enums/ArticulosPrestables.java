package saguado.modelo.enums;

/**
 * Clase enumerada que contiene todos los articulos de la biblioteca y si pueden o no ser prestados
 * Se pueden seguir añadiendo mas articulos y modificar el valor a peticion del cliente.
 * @author Sergio
 *
 */
public enum ArticulosPrestables {
	
	COMIC(false),
	DISCO(true),
	LIBRO(true),
	REVISTA(false);
	
	private boolean esPrestable;

	private ArticulosPrestables(boolean esPrestable) {
		this.esPrestable = esPrestable;
	}

	public boolean isEsPrestable() {
		return esPrestable;
	}

	// Este metodo prodia usarse para modificar si un articulo se vuelve prestable mas adelante o se quita.
	public void setEsPrestable(boolean esPrestable) {
		this.esPrestable = esPrestable;
	}

	
}

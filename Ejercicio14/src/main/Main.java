package main;

import negocio.EmpresaServicio;

/**
 * Aplicacion de gestion del Personal y Departamentos de una empresa
 * @author saguado
 * @version 1.0
 */
public class Main {

	/**
	 * Inicia la aplicacion creando un objeto EmpresaServicio
	 * @see EmpresaServicio
	 * @param args No requiere parametros de entrada
	 */
	public static void main(String[] args) {
		
		EmpresaServicio  servicio = new EmpresaServicio();
		
		servicio.showMenu();

	}

}

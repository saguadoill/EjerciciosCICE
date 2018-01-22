package com.saguado.vista;

import com.saguado.controlador.GestionAgenda;

/***
 * Aplicacion que gestiona una agenda de contactos.
 * SOlo almacena DNI y nombre completo. Usa para ello un Map clave/valor 
 * @author Sergio
 * @version 1.0
 */
public class Main {

	public static void main(String[] args) {
		
		GestionAgenda ga = new GestionAgenda();
		
		ga.showMenu();
		
	}

}

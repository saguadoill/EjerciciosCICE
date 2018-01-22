package com.saguado.controlador;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

/**
 * Clase que gestiona la entrada/salida de los contactos, asi como su visualizacion.
 * En este caso se usan DNI verdaderos. Hay lineas de codigo comentadas para hacerlo como si el DNI fuera un simple Integer
 * El metodo para verificar la letra lo he sacado directamente de la Wikipedia(aunque hay que eliminar una linea)
 * @author Sergio
 *
 */
public class GestionAgenda {

//	private Hashtable<Integer, String> agenda = new  Hashtable<>();
	private Hashtable<String, String> agenda = new  Hashtable<>();
	private VerificacionDNI  vf;
	
	
	/**
	 * Muestra el menu de las opciones y recoge la eleccion del usuario
	 */
	public void showMenu() {
		Scanner entrada = new Scanner(System.in);
		
		int opcion = 0;

		do {
			System.out.println();
			System.out.println("Bienvenido a tu gestion de Empresa");
			System.out.println("==================================");
			System.out.println("1 - Añadir Contacto");
			System.out.println("2 - Eliminar Contacto");
			System.out.println("3 - Mostrar Contactos");
			System.out.println("4 - Salir");
			System.out.print(">");
			opcion = entrada.nextInt();
			
			controles(opcion);

		} while (opcion != 0);
		
		entrada.close();

	}
	
	/**
	 * Gestiona la eleccion del usuario en el menu. No sale en JavaDoc por ser private
	 * @param opcion int con la opcion elegida
	 * @see showMenu()
	 */
	private void controles(int opcion) {
		
		switch (opcion) {

		case 1:
			addContacto();
			break;
		case 2:
			removeContacto();
			break;
		case 3:
			mostrarContactos();
			break;
		case 4:
			System.out.println("Gracias por usar nuestra aplicacion!!");
			break;
		default: System.out.println("Opcion Erronea!!");
			break;
		}

	}
	
	/**
	 * No sale en javaDoc.
	 * Aññade un contacto a la agenda, solicitando el DNI y el nombre y apellidos
	 */
	private void addContacto() {
		Scanner sc = new Scanner(System.in);
//		int dni = 0;
		String dni = "";
		String nombre = "";
		System.out.print("Introducir DNI del contacto: ");
//		System.out.print("Introducir DNI del contacto (sin la letra): ");
//		dni = Integer.parseInt(sc.next());
		dni  = sc.next();
		
		vf = new VerificacionDNI();
		dni = vf.verificarLonguitudDNI(dni);
		if(vf.isNifNumValid(dni)) {
			sc = new Scanner(System.in);
			System.out.print("Introducir Nombre y apelidos del contacto: ");
			nombre = sc.nextLine();		
			agenda.put(dni, nombre);
			System.out.println("CONTACTO AÑADIDO!");
			
		}else {
			System.out.println("FORMATO DNI INCORRECTO !!!!!!!!");
		}
		
		
		
	}
	
	/**
	 * No sale en javaDoc
	 * Elmimina un contacto de la agenda basandose en el DNI que facilita el usuario
	 */
	private void removeContacto() {
		Scanner sc = new Scanner(System.in);
//		int dni = 0;
		String dni = "";
		System.out.print("Introducir DNI contacto (sin la letra) a eliminar: ");
//		dni = Integer.parseInt(sc.next());
		dni = sc.next();
		dni = vf.verificarLonguitudDNI(dni);
		if(agenda.containsKey(dni)) {
			agenda.remove(dni);
			System.out.println("Contacto Eliminado");
		}else {
			System.out.println("¡¡ La persona no se encuentra dentro de la agenda !!");
		}
		
		
	}
	
	/**
	 * No sale en Javadoc
	 * Muestra una lista de todos los contactos  que hay actualmente en la agenda
	 */
	private void mostrarContactos() {
//		Enumeration<Integer> dnis = agenda.keys();
		Enumeration<String> dnis = agenda.keys();
		
		while(dnis.hasMoreElements()) {
		
//			Integer dni = dnis.nextElement();
			String dni = dnis.nextElement();
			System.out.println(dni+" - "+agenda.get(dni));
		 
		}
		
	}
	
}

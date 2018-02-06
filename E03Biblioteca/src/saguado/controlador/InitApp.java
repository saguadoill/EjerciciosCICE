package saguado.controlador;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;
import saguado.interfaces.InterfaceArticulo;
import saguado.interfaces.clases.Comic;
import saguado.interfaces.clases.Disco;
import saguado.interfaces.clases.Libro;
import saguado.interfaces.enums.Autor;
import saguado.interfaces.enums.Coleccion;
import saguado.interfaces.enums.FormatoMultimedia;

public class InitApp {

	Scanner sc = new Scanner(System.in);
	List<InterfaceArticulo> biblioteca;
	
	public InitApp() {
		
		cargarBiblioteca();
		mostrarMenu();
		
	}
	
	// Este metodo podria cargar los datos desde una base de datos o desde un archivo externo y tengo q mirar como hacerlo desde un enum
	private void cargarBiblioteca() {
		biblioteca = new ArrayList<>();
		
		InterfaceArticulo libro1 = new Libro(new GregorianCalendar(1979,2,23), "El Hobbit","2º", "isbn",Autor.JRRT);
		libro1.rentar();
		InterfaceArticulo libro2 = new Libro(new GregorianCalendar(1954,11,2), "El Señor de los anillos","2º", "isbn",Autor.JRRT);
		libro2.rentar();
		InterfaceArticulo comic1 = new Comic(new GregorianCalendar(2012, 3, 12), "Spiderman", 2, Coleccion.AMAZIN_SPIDERMAN);
		InterfaceArticulo disco1 = new Disco(new GregorianCalendar(2016, 6, 28), "El Fary", FormatoMultimedia.DVD, 60);
		disco1.rentar();
		
		
		biblioteca.add(libro1);
		biblioteca.add(comic1);
		biblioteca.add(disco1);
		biblioteca.add(libro2);
		
	}
	
	private void mostrarMenu() {
		
		String seleccion = "x";
		
		do {
			
			System.out.println();
			System.out.println("E03 - BIBLIOTECA");
			System.out.println("================");
			System.out.println("Selecciona una opcion");
			System.out.println("a) Numero de libros prestados ");
			System.out.println("b) Publicaciones anteriores a una fecha ");
			System.out.println("c) Imprimir el listado de publicaciones y discos ");
			System.out.println("d) Imprimir el listado de publicaciones y discos diferenciando por prestado o no");
			System.out.println("x) SALIR");	
			System.out.print(">>");
			seleccion = sc.next().toLowerCase();
			
			gestionarSeleccion(seleccion.charAt(0));
			
		}while(!seleccion.equals("x"));
	}
	
	private void gestionarSeleccion(Character c) {
		
		switch(c) {
		case 'a': 
			listarLibrosPrestados(); break;
		case 'b': 
			publicacionesHastaFecha(); break;
		case 'c': 
			listarTodo(); break;
		case 'd': 
			ListarTodoDetallePrestamo(); break;
		case 'x': 
			System.out.println("Gracias por su visita!"); break;
			default:
				System.out.println("OPCION NO ENCONTRADA!!"); break;
		}
	}

	private void listarTodo() {
		
		biblioteca.forEach(k-> System.out.println(k.getTitulo()));
		
	}
	
	private void ListarTodoDetallePrestamo() {
		
		biblioteca.forEach(k-> System.out.println(k.getTitulo()+" prestado: "+k.estaRentado()));
	}
	
	private void listarLibrosPrestados() {

		for (InterfaceArticulo i : biblioteca) {
			if(i.estaRentado()) {
				System.out.println(i.getTitulo());
			}
		}
		
	}
	
	private void publicacionesHastaFecha() {
		GregorianCalendar hastaFecha;
		
		System.out.println("Introducir fecha(yyyy/mm/dd): ");
		String[] fecha = sc.next().split("/");
		hastaFecha = new GregorianCalendar(Integer.parseInt(fecha[0]),Integer.parseInt(fecha[1]),Integer.parseInt(fecha[2]));
	
		for (InterfaceArticulo i : biblioteca) {
			if(i.getFechaPublicacion().compareTo(hastaFecha) <= 0) {
				System.out.println(i.getTitulo());
			}
		}
	
	}

}

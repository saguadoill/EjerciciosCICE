package controlador;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import modelo.Poligono;
import modelo.PoligonoCarton;
import modelo.PoligonoMadera;
import modelo.PoligonoPlastico;

/**
 * CLase que gestiona el funcinamiento de la aplicacion
 * @author Sergio
 *
 */
public class GestionApp {

	private List<Poligono> carrito = new ArrayList<>();

	/**
	 * Metodo que nicializa la aplicacion mostrando el menu principal
	 */
	public void inicializar() {
		Scanner sc = new Scanner(System.in);
		int seleccion = 0;

		do {
			System.out.println();
			System.out.println("Aplicacion Gestion Poligonos");
			System.out.println("============================");
			System.out.println("Que producto desea adquirir?");
			System.out.println("1- Triangulo");
			System.out.println("2- Cuadrado");
			System.out.println("3- Pentagono");
			System.out.println("4- PentagonoDiseño (OFERTA!)");
			System.out.println("5- Ver Carrito");
			System.out.println("0- SALIR");
			seleccion = sc.nextInt();
			getSeleccion(seleccion);

		} while (seleccion != 0);
	}

	/**
	 * Metodo que gestiona la seleccion que haga el usuario
	 * @param seleccion
	 */
	private void getSeleccion(int seleccion) {

		switch (seleccion) {
		case 1:
			crearTriangulo();
			break;
		case 2:
			crearCuadrado();
			break;
		case 3:
			crearPentagono();
			break;
		case 4:
			crearPentagonoD();
			break;
		case 5:
			mostrarCarrito();
			break;
		default:
			System.out.println("Producto no encontrado!!");
		}

	}

	/**
	 * Metodo que crea un triangulo
	 */
	private void crearTriangulo() {
			
		String material = seleccionarMaterial();
		boolean color = seleccionarColor();
		fabricar("Triangulo",3, material, color, false);
		
	}

	/**
	 * Metodo que crea un cuadrado
	 */
	private void crearCuadrado() {

		String material = seleccionarMaterial();
		boolean color = seleccionarColor();
		fabricar("Cuadrado",4, material, color, false);
		
	}

	/**
	 * Metodo que crea un pentagono
	 */
	private void crearPentagono() {
		String material = seleccionarMaterial();
		boolean color = seleccionarColor();
		fabricar("Pentagono",5, material, color, false);
	}

	/**
	 * Metodo que crea un pentagono de diseño.
	 */
	private void crearPentagonoD() {
		String material = seleccionarMaterial();
		boolean color = false; // al ser de diseño no se puede elegir color.
		fabricar("Pentagono de Diseño",5, material, color, true);
	}

	/**
	 * Metodo que gestiona la seleccion del material del poligono seleccionado
	 * @return String con el nombre del material selecionado
	 */
	private String seleccionarMaterial() {
		Scanner sc = new Scanner(System.in);
		Poligono p = new Poligono();	
		int seleccion = 0;
		
		System.out.println();
		System.out.println("De qué material lo desea?");
		System.out.println("1- Carton");
		System.out.println("2- Plástico");
		System.out.println("3- Madera");
		seleccion = sc.nextInt();
		
		switch(seleccion) {
		case 1: return "carton";
		case 2: return "plastico";
		case 3: return "madera";
		default: System.out.println("Material fuera de la lista!!"); return null;
		}
	}
	
	/**
	 * Metodo que gestiona si el usuario quiere un poligono de color o no
	 * @return boolean true/false si lo quiere con o sin color
	 */
	private boolean seleccionarColor() {
		Scanner sc = new Scanner(System.in);
		String seleccion = "";
		System.out.println();
		System.out.println("Lo quiere de color?(s/n)");
		seleccion = sc.next();
		
		if(seleccion.equalsIgnoreCase("s")) {
			return true;
		}else {
			return false;
		}
		
	}
	
	/**
	 * Metodo que crea el objeto Poligono a partir de los valores seleccionados por el usuario previamente.
	 * @param nombre String con el Nombre del poligono
	 * @param lados in con los lados que tiene el poligono
	 * @param material String con el material seleccionado
	 * @param color boolean si es o no de color
	 * @param autor boolean si es de diseño
	 */
	private void fabricar(String nombre,int lados, String material, boolean color, boolean autor) {
		float porcentaje = 1.15f;
		if(autor) {
			porcentaje = 1.20f;
		}
		
		if(material.equals("carton")) {
			PoligonoCarton p = new PoligonoCarton();
			p.setNombre(nombre);
			p.setLados(lados);
			p.setColor(color);
			p.aplicarPorcentaje(porcentaje);
			carrito.add(p);
			
		}else if(material.equals("plastico")) {
			PoligonoPlastico p = new PoligonoPlastico();
			p.setNombre(nombre);
			p.setLados(lados);
			p.setColor(color);
			p.aplicarPorcentaje(porcentaje);
			carrito.add(p);
		}else {
			PoligonoMadera p = new PoligonoMadera();
			p.setNombre(nombre);
			p.setLados(lados);
			p.setColor(color);
			p.aplicarPorcentaje(porcentaje);
			carrito.add(p);
		}
		
	}
	
	/**
	 * Metodo que muestra todos los poligonos creados por el usuario
	 */
	private void  mostrarCarrito() {
		
		
		carrito.forEach(k-> System.out.println(k.getNombre()+" - "
				+k.getMaterial()+" - "
				+k.getColor()+" --> "
				+k.getPrecio()));
	}
}

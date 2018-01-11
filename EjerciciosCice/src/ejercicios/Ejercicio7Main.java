package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7Main {


	private static ArrayList<Double> precios = new ArrayList<>();

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int opcion = 0;

		do {

			System.out.println("EJERCICIO 7");
			System.out.println("===========");
			System.out.println("1 - Nuevo precio");
			System.out.println("2 - Precio medio");
			System.out.println("3 - Precio maximo");
			System.out.println("4 - Precio minimo");
			System.out.println("5 - Mostrar todos los precios");
			System.out.println("6 - Salir");
			System.out.print(">");
			opcion = entrada.nextInt();

			switch (opcion) {

			case 1:
				addPrecio();
				break;
			case 2:
				System.out.println("El precio medio es: "+precioMedio()+"€");
				break;
			case 3:
				System.out.println("El precio maximo es: "+precioMaximo()+"€");
				break;
			case 4:
				System.out.println("El precio minimo es: "+precioMinimo()+"€");
				break;
			case 5:
				mostrarPrecios();
				break;
			case 6:
				System.out.println("Gracias por su visita");
				break;
			default: System.out.println("Opcion Erronea!!");
				break;
			}


		} while (opcion != 0);

	
	}

	public static void addPrecio() {
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Introducir nuevo precio: ");
		precios.add(entrada2.nextDouble());
	
	}

	public static double precioMedio() {

		double suma = 0;

		for (Double double1 : precios) {

			suma += double1;

		}

		return suma / precios.size();

	}

	public static double precioMaximo() {

		double max = 0;

		for (int i = 0; i < precios.size(); i++) {

			if (precios.get(i) > max) {
				max = precios.get(i);
			}

		}
		return max;

		/* Dentro de un forech
		 * double precioMaximo
		 *  precioMaximo  = Math.max(precio, precioMacximo)
		 */
		
	}

	public static double precioMinimo() {

		double min = precioMaximo();

		for (int i = 0; i < precios.size(); i++) {

			if (precios.get(i) < min) {
				min = precios.get(i);
			}

		}
		return min;
	}

	public static void mostrarPrecios() {
		for (Double double1 : precios) {

			System.out.println(double1);
		}

	}
}

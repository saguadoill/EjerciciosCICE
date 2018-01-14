package negocio;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.Departamento;
import modelo.Empleado;

/**
 * Clase que gestiona las opciones del programa
 * @author Sergio
 * @version 1.0
 */
public class EmpresaServicio {

	private ArrayList<Empleado> listaEmpleados = new ArrayList<>();
	private ArrayList<Departamento> listaDepartamentos = new ArrayList<>();
	
	/**
	 * Muestra por pantalla un meno de seleccion con las distintas opciones. Los demas metodos son private por lo que no se muestran en la documentacion
	 * pero dentro del codigo si se describen
	 * 
	 */
	public void showMenu() {
		Scanner entrada = new Scanner(System.in);
		
		int opcion = 0;

		do {
			System.out.println();
			System.out.println("Bienvenido a tu gestion de Empresa");
			System.out.println("==================================");
			System.out.println("1 - Crear Empleado");
			System.out.println("2 - Crear Departamento");
			System.out.println("3 - Asignar Director a Departamento");
			System.out.println("4 - Asignar empleado a Departamento");
			System.out.println("5 - Mostrar todos los empleados");
			System.out.println("6 - Mostrar todos los Departamentos");
			System.out.println("7 - Mostrar Organigrama Empresa");
			System.out.println("0 - Salir");
			System.out.print(">");
			opcion = entrada.nextInt();
			
			controles(opcion);

		} while (opcion != 0);

	}
	
	/**
	 * Gestiona la eleccion del usuario en el menu. No sale en JavaDoc por ser private
	 * @param opcion int con la opcion elegida
	 * @see showMenu()
	 */
	private void controles(int opcion) {
		
		switch (opcion) {

		case 1:
			crearEmpleado();
			break;
		case 2:
			crearDepartamento();
			break;
		case 3:
			asignarDirector();
			break;
		case 4:
			asignarEmpleado();
			break;
		case 5:
			mostrarEmpleados();
			break;
		case 6:
			mostrarDepartamentos();
			break;
		case 7:
			mostrarOrganigrama();
			break;
		case 0:
			System.out.println("Gracias por usar nuestra aplicacion!!");
			break;
		default: System.out.println("Opcion Erronea!!");
			break;
		}

	}
	
	/**
	 * Crea un empleado con los datos que el usuario va introduciendo
	 */
	private void crearEmpleado() {

		Empleado empleado = new Empleado();
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce el nombre: ");
		empleado.setNombre(entrada.next());
		
		System.out.print("Introduce el apellido: ");
		empleado.setApellido(entrada.next());	
		
		System.out.println(empleado.toString());
		
		listaEmpleados.add(empleado);
		
	}
	
	/**
	 * Muestra una lista de TODOS los empleados, independientemente del departamento en el que esten
	 * 
	 */
	private void mostrarEmpleados() {
//		ESTO HACE LO MISMO QUE LO DE ABAJO
//		for (Empleado empleado : listaEmpleados) {
//			System.out.println("----Lista Empleados ------");
//			System.out.println(empleado.getNombre()+" "+empleado.getApellido());
//			System.out.println("--------------------------");
//			
//		}
		
		System.out.println("----Lista Empleados ------");
		listaEmpleados.forEach(empleado -> System.out.println(empleado.toString()));
		System.out.println("----------------");
		
	}
	
	/**
	 * Muestra una lista de TODOS los departamentos de la empresa
	 */
	public void mostrarDepartamentos() {
//		ESTO HACE LO MISMO QUE LO DE ABAJO
//		for (Departamento departamento : listaDepartamentos) {
//			System.out.println("----Lista Departamentos -------");
//			System.out.println(departamento.getNombre());
//			System.out.println("-------------------------------");
//			
//		}
		
		System.out.println("----Lista Departamentos ------");
		listaDepartamentos.forEach(dep -> System.out.println(dep.getNombre()));
		System.out.println("----------------");
	}
	
	/**
	 * Crea un Departamento con los datos que suministra el usuario.
	 * Da la opcion de repetir el proceso hasta que el usuario quiera
	 */
	private void crearDepartamento() {
		
		String respuesta = "";		
		Scanner entrada = new Scanner(System.in);		
		Departamento  departamento;
		
		do {
			departamento = new Departamento();
			System.out.print("Introduce el nombre: ");
			departamento.setNombre(entrada.next());
			System.out.println("------------------------");
			System.out.println("quieres crear otro departamento?(s/n): ");
			respuesta = entrada.next();
			listaDepartamentos.add(departamento);
			
		}while(respuesta.equals("s"));
		
	}
	
	/**
	 * Asigna un empleado como Director de un Departamento
	 * Primero se elige el Departamento  al cual se va asignar un Director,
	 * y luego un Empleado para que lo sea.
	 */
	private void asignarDirector() {
		Scanner entrada = new Scanner(System.in);
		int opcionDepartamento = 0;
		int opcionEmpleado = 0;
		
		for (Departamento departamento : listaDepartamentos) {
			
			System.out.println(""+(listaDepartamentos.indexOf(departamento)+1)+" - "+departamento.getNombre());
		}
		
		System.out.print("¿A que departamento desea asignar un Director?(1-"+(listaDepartamentos.size())+"): ");
		opcionDepartamento = Integer.parseInt(entrada.next());
		
		
		for (Empleado empleado : listaEmpleados) {
			
			System.out.println(""+(listaEmpleados.indexOf(empleado)+1)+" - "+empleado.toString());
		}
		
		System.out.print("Que empleado quiere asignar como Director?(1-"+(listaEmpleados.size())+"): ");
		opcionEmpleado = Integer.parseInt(entrada.next());
		
		listaDepartamentos.get(opcionDepartamento-1).setDirector(listaEmpleados.get(opcionEmpleado-1));
		
	}
	
	/**
	 * Asigna un Empleado a un Departamento.
	 * Primero se selecciona qué Departamento va a ser y luego el Empleado en cuestion
	 */
	private void asignarEmpleado() {
		Scanner entrada = new Scanner(System.in);
		int opcionDepartamento = 0;
		int opcionEmpleado = 0;
		
		for (Departamento departamento : listaDepartamentos) {
			
			System.out.println(""+(listaDepartamentos.indexOf(departamento)+1)+" - "+departamento.getNombre());
		}
		
		System.out.print("¿A que departamento desea asignar un empleado?(1-"+(listaDepartamentos.size())+"): ");
		opcionDepartamento = Integer.parseInt(entrada.next());
		
		
		for (Empleado empleado : listaEmpleados) {
			
			System.out.println(""+(listaEmpleados.indexOf(empleado)+1)+" - "+empleado.toString());
		}
		
		System.out.print("Que empleado quiere asignar?(1-"+(listaEmpleados.size())+"): ");
		opcionEmpleado = Integer.parseInt(entrada.next());
		
		listaDepartamentos.get(opcionDepartamento-1).getPersonal().add(listaEmpleados.get(opcionEmpleado-1));
		
	}
	
	/**
	 * Muestra una lista de todos los Departamentos, con sus Directores(Si tiene o no asignado uno),
	 * y los empleados de cada Departamento. \t es la tabulacion para que quede un poco organiado
	 */
	private void mostrarOrganigrama() {
		
		System.out.println();
		for (Departamento departamento : listaDepartamentos) {
			
			System.out.println(departamento.getNombre().toUpperCase());
			if(departamento.getDirector()!=null) {
				System.out.println("\tDirector: "+departamento.getDirector().toString());
			}else {
				System.out.println("\tDirector: no asignado");
			}
			departamento.mostrarPersonal();
			
		}
		
		
	}
	
}

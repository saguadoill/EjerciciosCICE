package modelo;

import java.util.ArrayList;

/**
 * CLase que define un Departamento de la empresa
 * @author Sergio
 * @version 1.0
 */
public class Departamento {

	private String nombre;
	private String ubicacion;
	private String telefono;
	
	private Empleado director;
	
	private ArrayList<Empleado> personal = new ArrayList<>();
	
	/**
	 * Contructor sin parametros
	 */
	public Departamento() {
		
	}

	/**
	 * Constructor al que hay que indicar los siguientes parametros
	 * @param nombre Nombre que tendra el Departamento
	 * @param ubicacion En que planta,piso,puerta o lugar se encuentra
	 * @param telefono Telefono o extension que tendra asignado el departamento
	 */
	public Departamento(String nombre, String ubicacion, String telefono) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.telefono = telefono;
	}

	/**
	 * Devuelve el nombre del departamento
	 * @return String del nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Asigna el nombre del departamento
	 * @param nombre String con el nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve la ubicacion del departamento
	 * @return String de la ubicacion
	 */
	public String getUbicacion() {
		return ubicacion;
	}

	/**
	 * Asigna una ubicacion al departamento
	 * @param ubicacion String con la ubicacion
	 */
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	/**
	 * Devuelve el numero de telefono o extension del departamento
	 * @return String con el numero de telefono o extension
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * Asigna el numero de telefono o extension al departamento
	 * @param telefono String con numero telefono o extension
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * Devuelve el director asignado al deparamento
	 * @return Empleado empleado asignado
	 */
	public Empleado getDirector() {
		return director;
	}

	/**
	 * Asigna un empleado como director
	 * @param director Empleado empleado que se asignara
	 */
	public void setDirector(Empleado director) {
		this.director = director;
	}

	/**
	 * Devuelve la lista de todos los empleados asignado al departamento
	 * @return ArrayList de Empleado, de todos los empleados
	 */
	public ArrayList<Empleado> getPersonal() {
		return personal;
	}

	/**
	 * Asigna un ista de empleados al Departamento
	 * @param personal ArrayList de Empleado, con todos los empleados
	 */
	public void setPersonal(ArrayList<Empleado> personal) {
		this.personal = personal;
	}
	
	/**
	 * Muestra una lista de todos los empleadso asignados al departamento
	 */
	public void mostrarPersonal() {
		for (Empleado empleado : personal) {
			System.out.println("\t \t -"+empleado.toString());
		}
	}
	
}

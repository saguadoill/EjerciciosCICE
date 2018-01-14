package modelo;

/**
 * Clase que define a un empleado de la empresa
 * @author Sergio
 *
 */
public class Empleado {

	private String nombre;
	private String apellido;
	private String direccion;
	private String dni;
	private String mail;
	
	/**
	 * Constructor sin parametros
	 */
	public Empleado() {
		
	}

	/**
	 * Contrusctor al que hay que introducir los siguientes parametros
	 * @param nombre Nombre del empleado
	 * @param apellido Apellido del empleado
	 * @param direccion Direccion actual del empleado
	 * @param dni DNI en vigor del empleado
	 * @param mail Correo electronico del empleado
	 */
	public Empleado(String nombre, String apellido, String direccion, String dni, String mail) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.dni = dni;
		this.mail = mail;
	}
	
	/**
	 * Devuelvo el DNI del empleado
	 * @return  String del DNI
	 */
	public String getDni() {
		return dni;
	}
	
	/**
	 * Asigna un numero de DNI al empleado
	 * @param dni String con el DNI
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	/**
	 * Devuelvo el correo electronico del empleado
	 * @return String del mail
	 */
	public String getMail() {
		return mail;
	}
	
	/**
	 * Asigna un correo electronico al empleado
	 * @param mail String con el email
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	/**
	 * Devuelvo el nombre del empleado
	 * @return String del nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Asigna un nombre al empleado
	 * @param nombre String con el  nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Devuelvo el apellido del empleado
	 * @return String del apellido
	 */
	public String getApellido() {
		return apellido;
	}
	
	/**
	 * Asigna un apellido al empleado
	 * @param apellido String con el apellido 
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	/**
	 * Devuelvola direccion del empleado
	 * @return String de la direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	
	/**
	 * Asigna una direccion al empleado
	 * @param direccion String con la direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Sobreescritura del metod toString() para indicar  el nombre y apellidos del empleado 
	 */
	@Override
	public String toString() {
		
		return " "+nombre+" "+apellido;
	}
	
	
	
}

package modelo;

/**
 * Clase padre Poligono
 * @author Sergio
 *
 */
public class Poligono{

	private String nombre;
	private int lados;
	private String material;
	private boolean color;
	private float precio;
	

	public Poligono() {
		
	}

	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getLados() {
		return lados;
	}

	public void setLados(int puntos) {
		this.lados = puntos;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public boolean getColor() {
		return color;
	}

	public void setColor(boolean color) {
		this.color = color;
	}
		
}

package saguado.interfaces.clases;

import saguado.interfaces.EnumMateriales;
import saguado.interfaces.Poligono;

/**
 * Clase base de cualquier figura que se cree, en esete caso implementa la interface Poligonos
 * @author Sergio
 *
 */
public abstract class FiguraGeometrica implements Poligono {

	private EnumMateriales material;
	private double precio;
	private boolean color;
	private int lados;
	private String temporada;
	private boolean autor;
	

	public FiguraGeometrica(EnumMateriales material, boolean color, int lados, String temporada, boolean autor) {
		super();
		this.material = material;
		this.setPrecioBase();
		this.color = color;
		this.lados = lados;
		this.temporada = temporada;
		this.autor = autor;
		this.aplicarPorcentaje();
	}
	
	public EnumMateriales getMaterial() {
		return material;
	}

	public void setMaterial(EnumMateriales material) {
		this.material = material;
	}



	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isColor() {
		return color;
	}

	public void setColor(boolean color) {
		this.color = color;
	}

	public int getLados() {
		return lados;
	}

	public void setLados(int lados) {
		this.lados = lados;
	}

	public String getTemporada() {
		return temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}
	
	public boolean isAutor() {
		return autor;
	}

	public void setAutor(boolean autor) {
		this.autor = autor;
	}

	
	private void setPrecioBase(){
        precio = material.getPrecio();
    }
	
	
	@Override
	public void aplicarPorcentaje() {
		double porcentaje = 1.0;
		if(this.isColor()) {
			porcentaje = 1.15;
			if(this.isAutor()) {
				porcentaje = 1.20;
			}
		}else if(this.isAutor()) {
			porcentaje = 1.20;
		}
		this.setPrecio(this.getPrecio()*porcentaje);
	}
	
}

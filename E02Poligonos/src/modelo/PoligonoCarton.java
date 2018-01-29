package modelo;

/**
 * Clase que hereda de Poligono e implementa la interface DisColor
 * @author Sergio
 *
 */
public class PoligonoCarton extends Poligono implements DisColor {

	public PoligonoCarton() {
		super();
		this.setMaterial("carton");
		this.setPrecio(100);
	}

	@Override
	public void aplicarPorcentaje(float porcentaje) {

		if (this.getColor()) {
			this.setPrecio(this.getPrecio() * porcentaje);
		}

	}

}

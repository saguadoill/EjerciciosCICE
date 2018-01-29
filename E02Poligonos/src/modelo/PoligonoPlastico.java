package modelo;

/**
 *  Clase que hereda de Poligono e implementa la interface DisColor
 * @author Sergio
 *
 */
public class PoligonoPlastico extends Poligono implements DisColor {

	public PoligonoPlastico() {
		super();
		this.setMaterial("plastico");
		this.setPrecio(300);
	}

	@Override
	public void aplicarPorcentaje(float porcentaje) {
		if (this.getColor()) {
			this.setPrecio(this.getPrecio() * porcentaje);
		}

	}

}

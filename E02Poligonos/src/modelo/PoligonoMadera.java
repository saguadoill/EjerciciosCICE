package modelo;

/**
 *  Clase que hereda de Poligono e implementa la interface DisColor
 * @author Sergio
 *
 */
public class PoligonoMadera extends Poligono implements DisColor {

	public PoligonoMadera() {
		super();
		this.setMaterial("madera");
		this.setPrecio(500);
	}

	@Override
	public void aplicarPorcentaje(float porcentaje) {

		if (this.getColor()) {
			this.setPrecio(this.getPrecio() * porcentaje);
		}

	}

}

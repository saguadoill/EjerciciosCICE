package saguado.interfaces;

public enum EnumMateriales {
    CARTON(100d),
    PLASTICO(300d),
    MADERA(500d);

    private double precio;

    EnumMateriales(double precio) {
        this.precio = precio;
    }

    public double getPrecio(){
        return this.precio;
    }

}

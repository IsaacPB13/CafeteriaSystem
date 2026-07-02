public class Bebida extends Producto implements Vendible {

    private String tamano;
    private boolean fria;

    public Bebida(String nombre, double precio, boolean disponible,
                  String tamano, boolean fria) {

        super(nombre, precio, disponible);
        this.tamano = tamano;
        this.fria = fria;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public boolean isFria() {
        return fria;
    }

    public void setFria(boolean fria) {
        this.fria = fria;
    }

    @Override
    public void mostrarinformacion() {
        super.mostrarinformacion();
        System.out.println("Tamaño: " + tamano);
        System.out.println("Temperatura: " + (fria ? "Fría" : "Caliente"));
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecio();
    }
}

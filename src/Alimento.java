public class Alimento extends Producto implements Vendible {

    private boolean vegetariano;
    private int calorias;

    public Alimento(String nombre, double precio, boolean disponible,
                    boolean vegetariano, int calorias) {

        super(nombre, precio, disponible);
        this.vegetariano = vegetariano;
        this.calorias = calorias;
    }

    public boolean isVegetariano() {
        return vegetariano;
    }

    public void setVegetariano(boolean vegetariano) {
        this.vegetariano = vegetariano;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    @Override
    public void mostrarinformacion() {
        super.mostrarinformacion();
        System.out.println("Vegetariano: " + (vegetariano ? "Sí" : "No"));
        System.out.println("Calorías: " + calorias);
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecio();
    }
}
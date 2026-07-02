import java.util.HashMap;

public class Menu {
    private HashMap<String, Producto> productos;

    public Menu() {
        productos = new HashMap<>();
    }// Menu

    public void agregarProducto(Producto producto) {
        productos.put(producto.getNombre(), producto);
    }// agrega un producto al menú


    public void mostrarMenu() {

        System.out.println("========== MENÚ ==========");

        for (Producto producto : productos.values()) {
            producto.mostrarInformacion();
        }// for
    }// muestra todos los productos del menú


    public Producto buscarProducto(String nombre) {
        return productos.get(nombre);
    }// busca un producto por nombre

}// Class Menu
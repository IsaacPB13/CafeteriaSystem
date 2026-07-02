import java.util.HashMap;

public class Orden {
    private HashMap<Producto, Integer> productos;// Use HashMap<Producto, Integer> para permitirnos manejar cantidades.

    public Orden() {
        productos = new HashMap<>();
    }// Orden

    public void agregarProducto(Producto producto) {

        if (!producto.isDisponible()) {
            System.out.println("No es posible agregar este producto porque no está disponible.");
            return;
        }// if

        if (productos.containsKey(producto)) {
            productos.put(producto, productos.get(producto) + 1);
        } else {
            productos.put(producto, 1);
        }// if - else

        System.out.println("Producto agregado: " + producto.getNombre());
    }// Agrega un producto a la orden

    public void mostrarOrden() {

        System.out.println("\n========== ORDEN ==========");

        for (Producto producto : productos.keySet()) {

            int cantidad = productos.get(producto);

            System.out.println(
                    producto.getNombre() +
                            " x" + cantidad
            );
        }// for

        System.out.println("\nCantidad de productos: " + cantidadProductos());
    }// muestra la orden

    public double calcularSubtotal() {

        double subtotal = 0;

        for (Producto producto : productos.keySet()) {

            int cantidad = productos.get(producto);

            if (producto instanceof Vendible) {

                Vendible vendible = (Vendible) producto;

                subtotal += vendible.calcularPrecioFinal() * cantidad;
            }// if
        }// for

        return subtotal;
    }// clacula subtotal

    public void mostrarTotal() {

        double subtotal = calcularSubtotal();
        double iva = subtotal * 0.16;
        double total = subtotal + iva;

        System.out.println("\nSubtotal: $" + subtotal);
        System.out.println("IVA: $" + iva);
        System.out.println("Total: $" + total);
    }// muestra el subtotal, IVA y total

    public int cantidadProductos() {

        int cantidad = 0;

        for (int c : productos.values()) {
            cantidad += c;
        }

        return cantidad;
    }// cantidad total de producto
}// Class Orden

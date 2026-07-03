import java.util.Scanner;

public class Main {

    public static void main(String args[]){

        //Llenando el menu
        Menu menu_cafe = new Menu();

        //Listado de productos
        menu_cafe.agregarProducto(new Bebida("Espresso", 35, true, "Grande", false));
        menu_cafe.agregarProducto(new Bebida("Americano", 35, true, "Mediano", false));
        menu_cafe.agregarProducto(new Bebida("Café de olla", 150, true, "Chico", false));
        menu_cafe.agregarProducto(new Bebida("Capuchino", 40, true, "Mediano", true));
        menu_cafe.agregarProducto(new Bebida("Latte", 60, true, "Chico", true));
        menu_cafe.agregarProducto(new Alimento("Croissant de mantequilla", 20.5, true, false, 50));
        menu_cafe.agregarProducto(new Alimento("Dona de chocolate", 19, true, false, 150));
        menu_cafe.agregarProducto(new Alimento("Concha de vainilla", 12, true, false, 75));
        menu_cafe.agregarProducto(new Alimento("Muffin de rompope", 19, true, false, 110));
        menu_cafe.agregarProducto(new Alimento("Pay de queso con fresa", 29, true, false, 350));

        //--------------------INICIANDO LA INTERFAZ DE LA CAFETERIA----------------
        String opc_menu_principal = "y";
        String opc_menu_productos;
        String opc_orden = "y";
        Scanner leer = new Scanner(System.in);

        do{
            //Primero se despliega menu
            System.out.println("===========BIENVENIDO AL SISTEMA DE CAFETERÍA===========\n");
            menu_cafe.mostrarMenu();

            //Seguido se permiten añadir productos a la orden
            Orden orden_cliente = new Orden();
            String nombre_prod;
            System.out.println("\n--------- ORDEN INICIADA ---------");
            do {

                System.out.println("* Ingresa el producto que desea añadir a la orden: ");
                opc_menu_productos = leer.nextLine();

                //Buscando el producto
                Producto producto = menu_cafe.buscarProducto(opc_menu_productos);

                if(producto != null){

                    orden_cliente.agregarProducto(producto);
                }
                else{

                    System.out.println("ERROR. No existe el producto ingresado. Ingrese uno de la lista");
                }

                System.out.println("Desea ingresar otro producto a la orden? Y/N: ");
                opc_orden = leer.next().toLowerCase();
                leer.nextLine(); // consumir el Enter
            }while(opc_orden.equals("y"));

            //Termina la orden y muestra el total de la misma.
            System.out.println("\n--------- ORDEN COMPLETADA ---------");
            orden_cliente.mostrarOrden();
            System.out.println("\n");
            orden_cliente.mostrarTotal();
            System.out.println("\nDesea ordenar algo más? Y/N");
            opc_menu_principal = leer.next().toLowerCase();
            leer.nextLine();
        }while(opc_menu_principal.equals("y"));

        System.out.println("GRACIAS POR USAR NUESTRO SISTEMA.");
    }
}

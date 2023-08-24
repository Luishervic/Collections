package E6;

import java.util.Scanner;

public class Main {
    static Scanner rd = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        ProductosService productosService = new ProductosService();
        int opcion = 0;
        do {
            System.out.println("~~~~~~~~~~~ MENU ~~~~~~~~~~~");
            System.out.println("1. Ingresar producto.");
            System.out.println("2. Modificar precio del producto.");
            System.out.println("3. Eliminar producto.");
            System.out.println("4. Mostrar productos.");
            System.out.println("5. Salir");


            System.out.println("Ingrese una opción:");
            opcion = rd.nextInt();

            switch (opcion) {
                case 1:
                    productosService.agregarProducto();
                    break;
                case 2:
                    productosService.modificarPrecio();
                    break;
                case 3:
                    productosService.eliminarProducto();
                    break;
                case 4:
                    productosService.imprimirProductos();
                    break;
            }

        }while (opcion!= 5);


    }
}

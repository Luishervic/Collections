package E6;

import java.util.HashMap;
import java.util.Scanner;

public class ProductosService {
    Scanner rd = new Scanner(System.in).useDelimiter("\n");
    public HashMap<String, Float> productosMap = new HashMap<>();

    public void agregarProducto() {
        boolean decision;
        do {
            System.out.println("Ingrese el nombre del producto:");
            String producto = rd.next();
            System.out.println("Ingrese el precio del producto:");
            float precio = rd.nextInt();
            productosMap.put(producto, precio);
            System.out.println("Desea continuar agregando productos...? (S/N)");
            if (rd.next().equalsIgnoreCase("S")) {
                decision = true;
            }else decision = false;
        }while (decision);
    }

    public float obtenerPrecio(String producto) {
        return productosMap.getOrDefault(producto, 0.0f);
    }

    public void imprimirProductos() {
        for (String producto : productosMap.keySet()) {
            float precio = productosMap.get(producto);
            System.out.printf("Producto: %s, Precio: %.2f\n", producto, precio);
        }
    }

    public void modificarPrecio(){
        System.out.println("Ingresa el nombre del producto del cual deseas modificar el precio:");
        String producto = rd.next();

        if (productosMap.containsKey(producto)) {
            System.out.println("El precio actual del producto es:");
            System.out.println(obtenerPrecio(producto));
            System.out.println("Ingresa el nuevo precio:");
            float nuevoPrecio = rd.nextFloat();
            productosMap.put(producto, nuevoPrecio);
            System.out.println("Precio de " + producto + " modificado exitosamente.");
        } else {
            System.out.println("El producto " + producto + " no existe en el registro.");
        }
    }

    public void eliminarProducto(){
        System.out.println("Ingresa el nombre del producto que deseas eliminar:");
        String producto = rd.next();
        if (productosMap.containsKey(producto)){
            System.out.println("Precio de " + producto + " modificado exitosamente.");
            productosMap.remove(producto);
        }else {
            System.out.println("El producto " + producto + " no existe en el registro.");
            System.out.println("Intenta nuevamente.");
        }

    }
}


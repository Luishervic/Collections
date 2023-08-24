package E1_2;

import java.util.Scanner;

public class Main {
    private static Scanner rd = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        Canes canes = new Canes();

        canes.agregarRazas();

        System.out.println("Listando razas...");
        canes.listarCanes();
        System.out.println("Ingrese la raza de perro que desea eliminar");

        if (canes.eliminar(rd.next())){
            System.out.println("Eliminando raza");
            canes.listarCanes();
        }else {
            System.out.println("Raza no encontrada, ordenando perros...");
            canes.listarCanesOrdenados();
        }


    }
}

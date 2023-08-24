package Extras.E2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<CantanteFamoso> listaCantantes = new ArrayList<>();
        Scanner rd = new Scanner(System.in).useDelimiter("\n");
        CantanteService cantanteService = new CantanteService();

        listaCantantes.add(new CantanteFamoso("Jose Jose","40 y 20"));
        listaCantantes.add(new CantanteFamoso("Luis Miguel","Romance"));
        listaCantantes.add(new CantanteFamoso("Ana Gabriel","Luna"));
        listaCantantes.add(new CantanteFamoso("Juan Gabriel","Recuerdos, Vol. II"));
        listaCantantes.add(new CantanteFamoso("José Pablo Moncayo","El Jarabe Tapatío"));

        int opcion = 0;
        do {
            System.out.println("~~~~~~~~~~~ MENU ~~~~~~~~~~~");
            System.out.println("1. Agregar un cantante más.");
            System.out.println("2. Mostrar todos los cantantes.");
            System.out.println("3. Eliminar un cantante.");
            System.out.println("4. Salir.");
            System.out.println("Ingrese una opción:");
            opcion = rd.nextInt();

            switch (opcion) {
                case 1:
                    cantanteService.agregarCantante(listaCantantes);
                    break;
                case 2:
                    cantanteService.mostrarCantantes(listaCantantes);
                    break;
                case 3:
                    cantanteService.eliminarCantante(listaCantantes);
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
            }

        }while (opcion!= 4);
    }
}

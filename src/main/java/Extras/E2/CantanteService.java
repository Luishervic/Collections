package Extras.E2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CantanteService {
    Scanner rd = new Scanner(System.in).useDelimiter("\n");
    public void agregarCantante(ArrayList<CantanteFamoso> listaCantantes){
        System.out.println("Ingresa el nombre del cantante:");
        String nombre = rd.next();
        System.out.println("Ingresa su disco mas vendido hasta la fecha (2023):");
        String disco = rd.next();
        listaCantantes.add(new CantanteFamoso(nombre,disco));
    }

    public void mostrarCantantes(ArrayList<CantanteFamoso> listaCantantes){
        for (CantanteFamoso cantante: listaCantantes) {
            System.out.println(cantante);
        }
    }

    public void eliminarCantante(ArrayList<CantanteFamoso> listaCantantes){
        System.out.println("Ingrese el nombre del cantante a eliminar:");
        String nombre = rd.next();
        Iterator<CantanteFamoso> it = listaCantantes.iterator();
        while (it.hasNext()){
            if (it.next().getNombre().equals(nombre)) {
                it.remove();
                System.out.printf("El artista %s se ha eliminado\n", nombre);
                break;
            }else System.out.println("No se ha encontrado en el registro.");
        }
    }

}

package Extras.E3;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<Libro> setLibros = new HashSet<>();
        Scanner rd = new Scanner(System.in).useDelimiter("\n");
        Libreria libreria = new Libreria();

        boolean opcion = false;
        do {
            System.out.println("Ingrese el titulo del libro:");
            String titulo = rd.next();
            System.out.println("Ingrese el autor del libro:");
            String autor = rd.next();
            System.out.println("Ingrese el numero de ejemplares:");
            Integer numEjemplares = rd.nextInt();
            System.out.println("Ingrese el numero de ejemplares prestados:");
            Integer numEjemplaresPrestados = rd.nextInt();

            setLibros.add(new Libro(titulo, autor, numEjemplares, numEjemplaresPrestados));

            System.out.println("Desea seguir ingresando libros...?");
            if (rd.next().equalsIgnoreCase("S")){
                opcion = true;
            }
        }while (opcion);

        libreria.listarLibros(setLibros);
        libreria.devolucion(setLibros);
        libreria.listarLibros(setLibros);
        libreria.prestamo(setLibros);
        libreria.listarLibros(setLibros);
    }
}

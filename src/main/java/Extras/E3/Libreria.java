package Extras.E3;

import java.util.HashSet;
import java.util.Scanner;

public class Libreria {
    Scanner rd = new Scanner(System.in).useDelimiter("\n");
    public void prestamo(HashSet<Libro> setLibros){
        System.out.println("Ingrese el libro que desea sacar:");
        String nombre = rd.next();
        for (Libro aux: setLibros) {
            if (aux.getTitulo().equalsIgnoreCase(nombre)){
                int numeroActual = aux.getNumeroEjemplares() - 1;
                aux.setNumeroEjemplares(numeroActual);
                int numeroPrestados = aux.getNumeroEjemplaresPrestados() + 1;
                aux.setNumeroEjemplaresPrestados(numeroPrestados);
                break;
            }
        }
    }

    public void devolucion(HashSet<Libro> setLibros){
        System.out.println("Ingrese el libro que devolver:");
        String nombre = rd.next();
        for (Libro aux: setLibros) {
            if (aux.getTitulo().equalsIgnoreCase(nombre)){
                int numeroActual = aux.getNumeroEjemplares() + 1;
                aux.setNumeroEjemplares(numeroActual);
                int numeroPrestados = aux.getNumeroEjemplaresPrestados() - 1;
                aux.setNumeroEjemplaresPrestados(numeroPrestados);
                break;
            }
        }
    }

    public void listarLibros(HashSet<Libro> setLibros){
        for (Libro aux :setLibros) {
            System.out.println(aux);
        }
    }
}

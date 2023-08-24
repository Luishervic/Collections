package E4;

import java.util.ArrayList;
import java.util.Scanner;

public class PeliculaService {
    Scanner rd = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
    public void crearPeliculas(){
        boolean veredicto;
        System.out.println("Creando Películas, ingrese los datos que se piden:");
        do {

            System.out.println("Ingrese el titulo de la película:");
            String nombre = rd.next();
            System.out.println("Ingrese el nombre del director de la película");
            String pelicula = rd.next();
            System.out.println("Ingrese la duración en horas:");
            float horas = rd.nextFloat();

            listaPeliculas.add(new Pelicula(nombre, pelicula, horas));



            System.out.println("Desea ingresar más películas...? (S/N)");
            String opcion = rd.next().toUpperCase();
            if (opcion.equals("N")) {
                veredicto = false;
            }else veredicto = true;
        }while (veredicto);
    }
    public void imprimirPeliculas(){
        for (Pelicula elemento: listaPeliculas) {
            System.out.println(elemento);
        }
        separador();
    }

    public void imprimirPeliculasMasHora(){
        for (Pelicula elemento: listaPeliculas) {
            if (elemento.getDuracion() > 1) {
                System.out.println(elemento);
            }
        }
        separador();
    }

    public void ordenarDuracionDescendente(){
        listaPeliculas.sort(Comparadores.ordenarPorDuracionDescendente);
        imprimirPeliculas();
    }

    public void ordenarDuracionAscendente(){
        listaPeliculas.sort(Comparadores.ordenarPorDuracionAscendente);
        imprimirPeliculas();
    }

    public void ordenarPeliculasPorTitulo(){
        listaPeliculas.sort(Comparadores.ordenarPorTitulo);
        imprimirPeliculas();
    }

    public void ordenarPeliculasPorDirector(){
        listaPeliculas.sort(Comparadores.ordenarPorDirector);
        imprimirPeliculas();
    }

    public void separador(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}

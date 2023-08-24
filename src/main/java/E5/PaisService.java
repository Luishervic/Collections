package E5;

import java.util.*;

public class PaisService {
    Scanner rd = new Scanner(System.in).useDelimiter("\n");
    HashSet<Pais> conjuntoPaises = new HashSet<>();
    public void crearPaises(){
        Scanner rd = new Scanner(System.in).useDelimiter("\n");

        boolean veredicto;
        System.out.println("Creando países...");
        do {

            System.out.println("Ingrese el nombre del pais:");
            String nombre = rd.next();

            conjuntoPaises.add(new Pais(nombre));

            System.out.println("Desea más países...? (S/N)");
            String opcion = rd.next().toUpperCase();
            if (opcion.equals("N")) {
                veredicto = false;
                imprimirConjunto(conjuntoPaises);
            }else veredicto = true;
        }while (veredicto);
    }

    public void imprimirConjunto(Collection<Pais> coleccion){
        for (Pais pais: coleccion) {
            System.out.println(pais);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public void ordenarPaises(){
        ArrayList<Pais> listaPaises = new ArrayList<>(conjuntoPaises);
        listaPaises.sort(Comparadores.ordenarAlfabeticamente);
        imprimirConjunto(listaPaises);
    }

    public void eliminarPais(){
        boolean paisEncontrado = false;
        System.out.println("Ingrese el nombre del pais que desea eliminar:");
        String paisAEliminar = rd.next();

        Iterator<Pais> iterator = conjuntoPaises.iterator();
        while (iterator.hasNext()){
            if (iterator.next().getNombre().equals(paisAEliminar)) {
                System.out.println("Pais encontrado eliminando...");
                iterator.remove();
                paisEncontrado = true;
            }
        }

        if (!paisEncontrado) {
            System.out.println("No se ha encontrado el pais");
        }
        imprimirConjunto(conjuntoPaises);
    }

}

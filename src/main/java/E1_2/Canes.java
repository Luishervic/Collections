package E1_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Canes {
    private ArrayList<String> perros = new ArrayList<>();
    private static Scanner rd = new Scanner(System.in).useDelimiter("\n");

    public void agregarRazas(){
        boolean veredicto;
        do {
            System.out.println("Ingrese la raza del perro a guardar:");
            perros.add(rd.next());
            System.out.println("Desea seguir añadiendo razas...? (S o N)");
            String opcion = rd.next().toUpperCase();
            if (opcion.equals("N")) {
                veredicto = false;
            }else veredicto = true;
        }while (veredicto);
    }

    public void listarCanes(){
        for (String perro: perros) {
            System.out.println(perro);
        }
    }

    public boolean eliminar(String raza){
        Iterator<String> it = perros.iterator();
        while(it.hasNext()) {
            if (it.next().equals(raza)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public void listarCanesOrdenados(){
        Collections.sort(perros);
        listarCanes();
    }
}
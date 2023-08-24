package Extras.E4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creando el HashMap.
        HashMap<Integer, String> codigosPostales = new HashMap<>();
        Scanner rd = new Scanner(System.in).useDelimiter("\n");
        // Añadiendo 10 ciudades al azar junto con el codigo postal
        codigosPostales.put(60018,"Uruapan");
        codigosPostales.put(44100,"Guadalajara");
        codigosPostales.put(64000,"Monterrey");
        codigosPostales.put(72000,"Puebla");
        codigosPostales.put(22000,"Tijuana");
        codigosPostales.put(37000,"León");
        codigosPostales.put(39000,"Acapulco");
        codigosPostales.put(91000,"Veracruz");
        codigosPostales.put(97000,"Mérida");
        codigosPostales.put(97100,"Cancún");

        //Pidiendo 3 al usuario
        for (int i = 0; i < 1; i++) {
            System.out.printf("Ingresando ciudad %d:\n", i + 1);
            String ciudad = rd.next();
            System.out.printf("Ingresa el codigo postal para la ciudad %s:\n", i + 1);
            Integer codigoPostal = rd.nextInt();
            codigosPostales.put(codigoPostal, ciudad);
        }
        //Mostrando valores.
        for(Map.Entry<Integer, String> entry: codigosPostales.entrySet()){
            System.out.printf("Codigo Postal: %d\n", entry.getKey());
            System.out.printf("Ciudad: %s\n", entry.getValue());
        }


        //Buscando Coincidencias...
        System.out.println("Ingrese el Codigo Postal de la ciudad a buscar:");
        Integer codigoPostal = rd.nextInt();
        for(Map.Entry<Integer, String> entry: codigosPostales.entrySet()){
            if (entry.getKey().equals(codigoPostal)) {
                System.out.println("Ciudad encontrada:");
                System.out.println(entry.getValue());
            }
        }

        //Eliminando 3 Ciudades
        for (int i = 0; i < 3; i++) {
            System.out.printf("Ingrese la ciudad %d a borrar:", i+1);
            String ciudad = rd.next();
            Iterator<Map.Entry<Integer, String>> iterator = codigosPostales.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<Integer, String> entry = iterator.next();
                if (entry.getValue().equalsIgnoreCase(ciudad)) {
                    iterator.remove();
                }
            }
        }

        //Mostrando valores.
        for(Map.Entry<Integer, String> entry: codigosPostales.entrySet()){
            System.out.printf("Código Postal: %d\n", entry.getKey());
            System.out.printf("Ciudad: %s\n", entry.getValue());
        }


    }
}

package Extras.E1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistOperaciones {

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Integer> listaNumeros = new ArrayList<>();

        System.out.println("Bienvenido a la calculadora.");
        System.out.println("Para salir de ella ingrese el numero -99.");
        int num = 0, cont = 0;

        while (true){
            System.out.printf("Ingresando numero %d:\n", cont + 1);
            num = rd.nextInt();
            if (num == -99) break;
            listaNumeros.add(num);
            cont++;
        }

        //Calculando la suma.
        float suma = 0;
        System.out.println("Los números ingresados fueron:");
        for (Integer numero: listaNumeros) {
            System.out.println(numero);
            suma += numero;
        }
        //Presentando suma y promedio.
        System.out.printf("La suma de la lista fue: %.2f\n", suma);
        System.out.printf("El promedio de la lista fue: %.2f", (suma/listaNumeros.size()));

    }

}


package E3;

import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoService {
    Scanner rd = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    public void crearAlumnos(){
        ArrayList<Double> calificaciones = new ArrayList<>();
        boolean veredicto;
        do {
            System.out.println("Bienvenido al sistema de gestión de alumnos");
            System.out.println("Ingrese el nombre del alumno:");
            String nombre = rd.next();


            for (int i = 0; i < 3; i++) {
                System.out.printf("Ingrese la calificación del parcial %d:\n", i + 1);
                calificaciones.add(rd.nextDouble());
            }
            listaAlumnos.add(new Alumno(nombre, calificaciones));

            System.out.println("Desea Ingresar mas alumnos...? (S/N)");
            String opcion = rd.next().toUpperCase();
            if (opcion.equals("N")) {
                veredicto = false;
            }else veredicto = true;
        }while (veredicto);
    }

    public double notaFinal(){
        boolean estudianteEncontrado = false;
        System.out.println("Ingrese el nombre del alumno al cual desea calcular la nota final:");
        String estudiante = rd.next();
        double nota = 0;

        for (Alumno aprendiz: listaAlumnos) {
            if (aprendiz.getNombre().equals(estudiante)) {
                System.out.println("Alumno encontrado... Su nota final fue:");
                for (int i = 0; i < 3; i++) {
                    nota += aprendiz.getCalificaciones().get(i);
                }
                estudianteEncontrado = true;
                break;
            }
        }

            if (!estudianteEncontrado) {
                System.out.println("Alumno no encontrado...");
                System.out.println("Deseas intentar de nuevo...? (S/N)");
                if (rd.next().equalsIgnoreCase("S")) {
                    notaFinal();
                } else {
                    System.out.println("Saliendo...");
                    return 0.0;
                }

            }
        return nota/3;
    }

    public void listarAlumnos(){
        System.out.println("Listando alumnos en la base de datos:");
        for (Alumno aprendiz: listaAlumnos) {
            System.out.println(aprendiz);
        }
    }
}

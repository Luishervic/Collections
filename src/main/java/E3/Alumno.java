package E3;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    ArrayList<Double> calificaciones = new ArrayList<>(3);

    public Alumno(String nombre, ArrayList<Double> calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Double> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(ArrayList<Double> calificaciones) {
        this.calificaciones = calificaciones;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", calificaciones=" + calificaciones +
                '}';
    }
}

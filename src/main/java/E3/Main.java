package E3;

public class Main {
    public static void main(String[] args) {
        AlumnoService alumnoService = new AlumnoService();
        alumnoService.crearAlumnos();
        System.out.println(alumnoService.notaFinal());
        alumnoService.listarAlumnos();
    }
}

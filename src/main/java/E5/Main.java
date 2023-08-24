package E5;

public class Main {
    public static void main(String[] args) {
        PaisService paisService = new PaisService();
        paisService.crearPaises();
        paisService.ordenarPaises();
        paisService.eliminarPais();
    }
}

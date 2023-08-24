package E4;

public class Main {

    public static void main(String[] args) {
        PeliculaService peliculaService = new PeliculaService();

        peliculaService.crearPeliculas();
        peliculaService.imprimirPeliculas();
        peliculaService.imprimirPeliculasMasHora();
        peliculaService.ordenarDuracionDescendente();
        peliculaService.ordenarDuracionAscendente();
        peliculaService.ordenarPeliculasPorTitulo();
        peliculaService.ordenarPeliculasPorDirector();
    }
}

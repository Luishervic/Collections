package Extras.E3;

import java.util.Objects;

public class Libro {
    private String titulo;
    private String autor;
    private Integer numeroEjemplares;
    private Integer numeroEjemplaresPrestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, Integer numeroEjemplares, Integer numeroEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(Integer numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public Integer getNumeroEjemplaresPrestados() {
        return numeroEjemplaresPrestados;
    }

    public void setNumeroEjemplaresPrestados(Integer numeroEjemplaresPrestados) {
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(titulo, libro.titulo) && Objects.equals(autor, libro.autor) && Objects.equals(numeroEjemplares, libro.numeroEjemplares) && Objects.equals(numeroEjemplaresPrestados, libro.numeroEjemplaresPrestados);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor, numeroEjemplares, numeroEjemplaresPrestados);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroEjemplares=" + numeroEjemplares +
                ", numeroEjemplaresPrestados=" + numeroEjemplaresPrestados +
                '}';
    }
}

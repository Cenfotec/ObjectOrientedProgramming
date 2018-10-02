package org.bonilla.bl;

import java.time.LocalDate;

public class Texto {
    private String titulo;
    private String nombreAutor;
    private LocalDate fechaPublicacion;
    private int numeroPaginas;
    private String idioma;

    public Texto(String titulo, String nombreAutor, LocalDate fechaPublicacion, int numeroPaginas, String idioma) {
        this.titulo = titulo;
        this.nombreAutor = nombreAutor;
        this.fechaPublicacion = fechaPublicacion;
        this.numeroPaginas = numeroPaginas;
        this.idioma = idioma;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public String toString() {
        return "Texto{" +
                "titulo='" + titulo + '\'' +
                ", nombreAutor='" + nombreAutor + '\'' +
                ", fechaPublicacion=" + fechaPublicacion +
                ", numeroPaginas=" + numeroPaginas +
                ", idioma='" + idioma + '\'' +
                '}';
    }
}

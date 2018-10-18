package org.bonilla.bl;

public class MaterialAudio {
    private String formato;
    private int duracion;
    private String idioma;

    public MaterialAudio(String formato, int duracion, String idioma) {
        this.formato = formato;
        this.duracion = duracion;
        this.idioma = idioma;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public String toString() {
        return "MaterialAudio{" +
                "formato='" + formato + '\'' +
                ", duracion=" + duracion +
                ", idioma='" + idioma + '\'' +
                '}';
    }
}
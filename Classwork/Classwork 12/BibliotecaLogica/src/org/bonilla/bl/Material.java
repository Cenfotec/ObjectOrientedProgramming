package org.bonilla.bl;

import org.bonilla.bl.interfaces.Imprimible;

public abstract class Material implements Imprimible {
    protected String formato;
    protected int duracion;
    protected String idioma;

    public Material(String formato, int duracion, String idioma) {
        this.formato = formato;
        this.duracion = duracion;
        this.idioma = idioma;
    }

    public Material() { }

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

    public abstract String desplegarInfoMaterial();

    @Override
    public String toString() {
        return "Material{" +
                "formato='" + formato + '\'' +
                ", duracion=" + duracion +
                ", idioma='" + idioma + '\'' +
                '}';
    }
}

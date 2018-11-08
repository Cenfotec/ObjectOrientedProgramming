package org.bonilla.bl;

public class MaterialAudio extends Material {

    public MaterialAudio(String formato, int duracion, String idioma) {
        super(formato, duracion, idioma);
    }

    public String desplegarInfoMaterial() {
        return "\n| Formato: " + super.formato +
                "\n| Duración: " + super.duracion +
                "\n| Idioma: " + super.idioma;
    }

    public String desplegarInfoItem() {
        return desplegarInfoMaterial();
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
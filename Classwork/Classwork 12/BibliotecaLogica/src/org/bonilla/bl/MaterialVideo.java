package org.bonilla.bl;

public class MaterialVideo extends Material {
    private String director;

    public MaterialVideo(String formato, int duracion, String idioma, String director) {
        super(formato, duracion, idioma);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String desplegarInfoMaterial() {
        return "\n| Formato: " + super.formato +
                "\n| Duración: " + super.duracion +
                "\n| Idioma: " + super.idioma +
                "\n| Director: " + director;
    }

    public String desplegarInfoItem() {
        return desplegarInfoMaterial();
    }

    @Override
    public String toString() {
        return "MaterialVideo{" +
                "director='" + director + '\'' +
                '}';
    }
}

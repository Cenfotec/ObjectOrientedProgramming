package org.bonilla.bl;

public class Tecnologia {
    private String codigo;
    private String nombre;

    public Tecnologia(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Tecnologia() { }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return codigo + "," + nombre;
    }
}

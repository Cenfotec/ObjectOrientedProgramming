package org.bonilla.clasetres;

public class Materia {
    private String nombre;
    private String descripcion;
    private String codigo;

    // Constructor
    public Materia() {
        nombre = "Matemática";
        descripcion = "Muchos calculos";
        codigo = "MAT-01";
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String toString() {
        return "Nombre: " + nombre+ ", Descripción: " + descripcion +
                ", Código: " + codigo;
    }
}

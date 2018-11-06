package org.bonilla.clasedos;

public class Laboratorio {
    private int codigo;
    private int capacidad;
    private String nombre;

    // Uso de las propiedades para definir atributos "visibles".

    // Setters
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getters
    public int getCodigo() {
        return codigo;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public String getNombre() {
        return nombre;
    }
}

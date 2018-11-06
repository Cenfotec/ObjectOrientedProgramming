package org.bonilla.clasetres;

public class Alumno {
    private String nombre;
    private String identificacion;
    private String apellidos;
    private String direccion;
    private boolean estado;

    // Constructor
    public Alumno() {
        nombre = "Pablo";
        identificacion = "123456789";
        apellidos = "Primero Segundo";
        direccion = "Lugar";
    }



    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public boolean isEstado() {
        return estado;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String toString() {
        return "Nombre: " + nombre + ", Identificación" + identificacion +
                ", Apellidos: " + apellidos + ", Dirección " + direccion +
                ", Estado " + estado;
    }
}

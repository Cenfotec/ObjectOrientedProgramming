package org.bonilla.bl;

public class Contacto {
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String cedula;
    private String correo;
    private int telefono;

    public Contacto(String nombre, String primerApellido, String segundoApellido, String cedula, String correo, int telefono) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
    }

    public Contacto() { }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return nombre + "," + primerApellido + "," +
               segundoApellido + "," + cedula + "," +
               correo + "," + telefono;
    }
}

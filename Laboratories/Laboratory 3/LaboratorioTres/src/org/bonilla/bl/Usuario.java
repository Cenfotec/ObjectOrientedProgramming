package org.bonilla.bl;

public class Usuario {
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String correo;
    private String cedula;
    private String genero;
    private String avatar;

    public Usuario(String nombre, String primerApellido, String segundoApellido, String correo, String cedula, String genero, String avatar) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.correo = correo;
        this.cedula = cedula;
        this.genero = genero;
        this.avatar = avatar;
    }

    public Usuario() { }

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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return nombre + "," + primerApellido + "," +
               segundoApellido + "," + correo + "," +
               cedula + "," + genero + "," +
               avatar;
    }
}

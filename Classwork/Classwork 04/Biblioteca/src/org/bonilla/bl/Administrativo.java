package org.bonilla.bl;

public class Administrativo {
    private String nombre;
    private String apellido;
    private String identificacion;
    private char tipoNombramiento;
    private int cantHoras;

    public Administrativo(String nombre, String apellido, String numeroCedula, char tipoNombramiento, int cantidadHorasSemanalesAsignadas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = numeroCedula;
        this.tipoNombramiento = tipoNombramiento;
        this.cantHoras = cantidadHorasSemanalesAsignadas;
    }

    public Administrativo() { }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public char getTipoNombramiento() {
        return tipoNombramiento;
    }

    public void setTipoNombramiento(char tipoNombramiento) {
        this.tipoNombramiento = tipoNombramiento;
    }

    public int getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(int cantHoras) {
        this.cantHoras = cantHoras;
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", tipoNombramiento=" + tipoNombramiento +
                ", cantHoras=" + cantHoras +
                '}';
    }
}

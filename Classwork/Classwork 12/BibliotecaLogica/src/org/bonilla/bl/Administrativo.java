package org.bonilla.bl;

public class Administrativo extends Persona {
    private char tipoNombramiento;
    private int cantHoras;

    public Administrativo(String nombre, String apellido, String numeroCedula, char tipoNombramiento, int cantidadHorasSemanalesAsignadas) {
        super(nombre, apellido, numeroCedula);
        this.tipoNombramiento = tipoNombramiento;
        this.cantHoras = cantidadHorasSemanalesAsignadas;
    }

    public Administrativo() { }

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

    public String desplegarInfoUsuario() {
        return "\n| Nombre: " + super.nombre +
                "\n| Apellido: " + super.apellido +
                "\n| Número de Cédula: " + super.identificacion +
                "\n| Tipo de Nombramiento: " + tipoNombramiento +
                "\n| Cantidad de horas: " + cantHoras;
    }

    public String desplegarInfoItem() {
        return desplegarInfoUsuario();
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

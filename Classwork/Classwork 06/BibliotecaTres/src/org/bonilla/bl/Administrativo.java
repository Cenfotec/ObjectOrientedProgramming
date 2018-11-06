package org.bonilla.bl;

public class Administrativo extends Persona {
    private char tipoNombramiento;
    private int cantHoras;

    public Administrativo() {
        super(); // Invocando el constructor del padre
    }

    public Administrativo(String nombre, String apellido, String identificacion, char tipoNombramiento, int cantidadHorasSemanalesAsignadas) {
        super(nombre, apellido, identificacion);
        this.tipoNombramiento = tipoNombramiento;
        this.cantHoras = cantidadHorasSemanalesAsignadas;
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
        return " Tipo de Nombramiento: " + tipoNombramiento + " Cantidad de horas: " + cantHoras;
    }
}

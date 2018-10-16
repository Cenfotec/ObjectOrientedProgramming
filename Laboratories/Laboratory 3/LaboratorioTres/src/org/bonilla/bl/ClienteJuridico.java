package org.bonilla.bl;

public class ClienteJuridico extends Cliente {
    private String identificacion;
    //private Contacto contacto;

    public ClienteJuridico(String nombre, String provincia, String canton, String distrito, String direccion, int telefono, String identificacion) {
        super(nombre, provincia, canton, distrito, direccion, telefono);
        this.identificacion = identificacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public String toString() {
        return super.toString() + "," + identificacion;
    }
}

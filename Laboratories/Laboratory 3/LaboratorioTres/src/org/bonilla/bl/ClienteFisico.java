package org.bonilla.bl;

public class ClienteFisico extends Cliente {
    private String primerApellido;
    private String segundoApellido;
    private String correo;

    public ClienteFisico(String nombre, String provincia, String canton, String distrito, String direccion, int telefono, String primerApellido, String segundoApellido, String correo) {
        super (nombre, provincia, canton, distrito, direccion, telefono);
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.correo = correo;
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

    public String getCorreo() { return correo; }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return super.toString()  + "," + primerApellido + "," +
               segundoApellido + "," + correo;
    }
}

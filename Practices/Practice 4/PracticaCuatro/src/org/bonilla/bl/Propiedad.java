package org.bonilla.bl;

public class Propiedad {
    private int codigo;
    private String nombre;
    private double valorInmueble;
    private String direccion;
    private String residencial;
    private int numeroCasa;
    private boolean patio;
    private int cantidadHabitaciones;

    public Propiedad(int codigo, String nombre, double valorInmueble, String direccion, String residencial, int numeroCasa, boolean patio, int cantidadHabitaciones) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.valorInmueble = valorInmueble;
        this.direccion = direccion;
        this.residencial = residencial;
        this.numeroCasa = numeroCasa;
        this.patio = patio;
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    // Getters
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getValorInmueble() {
        return valorInmueble;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getResidencial() {
        return residencial;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public boolean getPatio() {
        return patio;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }


    // Setters
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public void setValorInmueble(double valorInmueble) { this.valorInmueble = valorInmueble; }

    public void setDireccion(String direccion) { this.direccion = direccion; }

    public void setResidencial(String residencial) { this.residencial = residencial; }

    public void setNumeroCasa(int numeroCasa) { this.numeroCasa = numeroCasa; }

    public void setPatio(boolean patio) { this.patio = patio; }

    public void setCantidadHabitaciones(int cantidadHabitaciones) { this.cantidadHabitaciones = cantidadHabitaciones; }


    // toString
    public String toString() {
        return codigo + "," + nombre + "," +
                valorInmueble + "," + direccion + "," +
                residencial + "," + numeroCasa + "," +
                ((patio) ? "Sí" : "No") + "," + cantidadHabitaciones;
    }
}

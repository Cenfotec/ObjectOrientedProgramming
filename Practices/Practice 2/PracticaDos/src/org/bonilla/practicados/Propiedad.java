package org.bonilla.practicados;

// De las propiedades se desea que pueda incluir un código numérico,
// el nombre (el tío Rico es un poco excéntrico, entonces a cada casa
// le pone un nombre), el valor del inmueble, la dirección, el Residencial,
// el número de casa, si tiene patio o no y la cantidad de habitaciones
// (las habitaciones incluyen tanto los cuartos, como la sala, el comedor
// y el cuarto de pilas).

public class Propiedad {
    private int codigo;
    private String nombre;
    private double valorInmueble;
    private String direccion;
    private String residencial;
    private int numeroCasa;
    private boolean patio;
    private int cantidadHabitaciones; // cuartos, sala, comedor y cuarto de pilas


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

    public boolean isPatio() {
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
        return "Código: " + codigo + ", Nombre: " + nombre +
                ", Valor inmueble: " + valorInmueble + ", Dirección: " + direccion +
                ", Residencial: " + residencial + ", Número de casa: " + numeroCasa +
                ", Patio: " + patio + ", Cantidad de habitaciones: " + cantidadHabitaciones;
    }
}


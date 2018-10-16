package org.bonilla.bl;

import java.time.LocalDate;

public class ProyectoComercial extends Proyecto {
    private Cliente cliente;

    public ProyectoComercial(String codigo, String nombre, String descripcion, LocalDate fechaInicio, LocalDate fechaFin) {
        super(codigo, nombre, descripcion, fechaInicio, fechaFin);
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return super.toString() + "," + cliente;
    }
}

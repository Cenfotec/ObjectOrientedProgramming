package org.bonilla.bl;

import java.time.LocalDate;
import java.util.ArrayList;

public class Proyecto {
    protected String codigo;
    protected String nombre;
    protected String descripcion;
    protected LocalDate fechaInicio;
    protected LocalDate fechaFin;
    //protected ArrayList<Tecnologia> listaTecnologias;
    //protected ArrayList<Actividad> listaActividades;
    //protected Bitacora bitacora;

    public Proyecto(String codigo, String nombre, String descripcion, LocalDate fechaInicio, LocalDate fechaFin) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return codigo + "," + nombre + "," +
               descripcion + "," + fechaInicio+ "," +
               fechaFin;
    }
}

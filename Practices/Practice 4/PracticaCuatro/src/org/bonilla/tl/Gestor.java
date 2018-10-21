package org.bonilla.tl;

import org.bonilla.bl.Inquilino;
import org.bonilla.bl.Propiedad;
import org.bonilla.dl.CapaLogica;
import org.bonilla.dl.TextFileReader;

public class Gestor {
    private CapaLogica logica;
    private TextFileReader tfr;

    public Gestor() {
        logica = new CapaLogica();
        tfr = new TextFileReader();
    }

    // Registrar inquilino
    public void registrarInquilino(String nombre, String correoElectronico, String direccion, int telefono, String identificacion, String genero) {
        Inquilino tmpInquilino;
        tmpInquilino = new Inquilino(nombre, correoElectronico, direccion, telefono, identificacion, genero);
        logica.registrarInquilino(tmpInquilino);
    }

    // Registrar propiedad
    public void registrarPropiedad(int codigo, String nombre, double valorInmueble, String direccion, String residencial, int numeroCasa, boolean patio, int cantidadHabitaciones) {
        Propiedad tmpPropiedad;
        tmpPropiedad = new Propiedad(codigo, nombre, valorInmueble, direccion, residencial, numeroCasa, patio, cantidadHabitaciones);
        logica.registrarPropiedad(tmpPropiedad);
    }

    // Listar inquilinos
    public String listarInquilinos() {
        return tfr.listarInquilinos();
    }

    // Listar propiedades
    public String listarPropiedades() { return tfr.listarPropiedades(); }

    // Buscar inquilino
    public boolean buscarInquilino(String identificacion) {
        return tfr.buscarInquilino(identificacion);
    }

    // Buscar propiedad
    public boolean buscarPropiedad(int codigo) {
        return tfr.buscarPropiedad(codigo);
    }
}

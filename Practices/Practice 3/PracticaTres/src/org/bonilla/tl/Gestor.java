package org.bonilla.tl;

import org.bonilla.bl.Inquilino;
import org.bonilla.bl.Propiedad;
import org.bonilla.dl.CapaLogica;

import java.util.ArrayList;

public class Gestor {
    private CapaLogica logica;

    public Gestor() {
        logica = new CapaLogica();
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
    public String[] listarInquilinos() {
        String[] data = new String[logica.getListaInquilinos().size()];
        for (Inquilino i : logica.getListaInquilinos()) {
            data[logica.getListaInquilinos().indexOf(i)] = i.toString();
        }
        return data;
    }

    // Listar propiedades
    public String[] listarPropiedad() {
        String[] data = new String[logica.getListaPropiedades().size()];
        for (Propiedad p : logica.getListaPropiedades()) {
            data[logica.getListaPropiedades().indexOf(p)] = p.toString();
        }
        return data;
    }
}

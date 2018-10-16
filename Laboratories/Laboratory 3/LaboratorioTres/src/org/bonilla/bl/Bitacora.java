package org.bonilla.bl;

import java.util.ArrayList;

public class Bitacora {
    private String codigo;
    private ArrayList<RegistroActividad> listaRegistroActividades;

    public Bitacora(String codigo, ArrayList<RegistroActividad> listaRegistroActividades) {
        this.codigo = codigo;
        this.listaRegistroActividades = listaRegistroActividades;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<RegistroActividad> getListaRegistroActividades() {
        return listaRegistroActividades;
    }

    public void setListaRegistroActividades(ArrayList<RegistroActividad> listaRegistroActividades) {
        this.listaRegistroActividades = listaRegistroActividades;
    }

    @Override
    public String toString() {
        return codigo + "," + listaRegistroActividades;
    }
}

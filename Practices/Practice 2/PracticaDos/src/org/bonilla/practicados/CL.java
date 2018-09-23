package org.bonilla.practicados;

import java.util.ArrayList;

public class CL {
    private ArrayList<Inquilino> inquilinosLista;
    private ArrayList<Propiedad> propiedadesLista;

    public CL() {
        inquilinosLista = new ArrayList<>();
        propiedadesLista = new ArrayList<>();
    }


    // Registrar
    public void registrarInquilino(Inquilino inquilino) {
        inquilinosLista.add(inquilino);
    }

    public void registrarPropiedad(Propiedad propiedad) {
        propiedadesLista.add(propiedad);
    }


    // Listar
    public String listarInquilinos() {
        String lista = "";
        for (int i = 0; i < inquilinosLista.size(); i++) {
            lista += inquilinosLista.get(i).toString();
        }
        return lista;
    }

    public String listarPropiedades() {
        String lista = "";
        for (int i = 0; i < propiedadesLista.size(); i++) {
            lista += propiedadesLista.get(i).toString();
        }
        return lista;
    }


    // Buscar
    public Inquilino buscarInquilino(String identificacion) {
        for (int i = 0; i < inquilinosLista.size(); i++) {
            if (inquilinosLista.get(i).getIdentificacion() == identificacion) {
                return inquilinosLista.get(i);
            }
        }
        return null;
    }

    public Propiedad buscarPropiedad(int codigo) {
        for (int i = 0; i < propiedadesLista.size(); i++) {
            if (propiedadesLista.get(i).getCodigo() == codigo) {
                return propiedadesLista.get(i);
            }
        }
        return null;
    }




    // Getters
    public ArrayList<Inquilino> getInquilinosLista() {
        return inquilinosLista;
    }

    public ArrayList<Propiedad> getPropiedadesLista() {
        return propiedadesLista;
    }
}

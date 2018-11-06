package org.bonilla.dl;

import org.bonilla.bl.Persona;
import org.bonilla.bl.PersonaFisica;
import org.bonilla.bl.PersonaJuridica;

import java.util.ArrayList;

public class CapaLogica {
    private ArrayList<PersonaFisica> listaPersonaFisica;
    private ArrayList<PersonaJuridica> listaPersonaJuridica;
    private ArrayList<Persona> listaPersona;

    public CapaLogica() {
        listaPersonaFisica = new ArrayList<>();
        listaPersonaJuridica = new ArrayList<>();
        listaPersona = new ArrayList<>();
    }

    public void registrarPersonaFisica(PersonaFisica pf) {
        listaPersonaFisica.add(pf);
    }

    public void registrarPersonaJuridica(PersonaJuridica pj) {
        listaPersonaJuridica.add(pj);
    }

    public ArrayList<PersonaFisica> getListaPersonaFisica() {
        ArrayList<PersonaFisica> lista = new ArrayList<>(listaPersonaFisica);
        return lista;
    }

    public ArrayList<PersonaJuridica> getListaPersonaJuridica() {
        ArrayList<PersonaJuridica> lista = new ArrayList<>(listaPersonaJuridica);
        return lista;
    }

    public ArrayList<Persona> getListaPersona() {
        ArrayList<PersonaFisica> listaPF = listaPersonaFisica;
        ArrayList<PersonaJuridica> listaPJ = listaPersonaJuridica;
        ArrayList<Persona> listaP = new ArrayList<>(listaPersona);
        for (PersonaFisica pf : listaPF) {
            listaP.add(pf);
        }
        for (PersonaJuridica pj : listaPJ) {
            listaP.add(pj);
        }
        return listaP;
    }
}

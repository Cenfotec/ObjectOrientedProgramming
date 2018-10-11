package org.bonilla.tl;

import org.bonilla.bl.Persona;
import org.bonilla.bl.PersonaFisica;
import org.bonilla.bl.PersonaJuridica;
import org.bonilla.dl.CapaLogica;

import java.util.ArrayList;

public class Gestor {
    private CapaLogica logica;

    public Gestor() {
        logica = new CapaLogica();
    }

    public void registrarPersonaFisica(String nombre, String cedula, int edad, String apellido, char estadoCivil, double estatura, double peso) {
        PersonaFisica pf;
        pf = new PersonaFisica(nombre, cedula, edad, apellido, estadoCivil, estatura, peso);
        logica.registrarPersonaFisica(pf);
    }

    public void registrarPersonaJuridica(String nombre, String cedula, int edad, String representante, String industria) {
        PersonaJuridica pj;
        pj = new PersonaJuridica(nombre, cedula, edad, representante, industria);
        logica.registrarPersonaJuridica(pj);
    }

    public String[] getPersonasFisica() {
        ArrayList<PersonaFisica> lista = logica.getListaPersonaFisica();
        String[] data = new String[lista.size()];
        for (PersonaFisica pf : lista) {
            data[lista.indexOf(pf)] = pf.toString();
        }
        return data;
    }

    public String[] getPersonasJuridicas() {
        ArrayList<PersonaJuridica> lista = logica.getListaPersonaJuridica();
        String[] data = new String[lista.size()];
        for (PersonaJuridica pj : lista) {
            data[lista.indexOf(pj)] = pj.toString();
        }
        return data;
    }

    public String[] getPersonas() {
        ArrayList<Persona> lista = logica.getListaPersona();
        String[] data = new String[lista.size()];
        for (Persona pf : lista) {
            data[lista.indexOf(pf)] = pf.toString();
        }
        return data;
    }
}

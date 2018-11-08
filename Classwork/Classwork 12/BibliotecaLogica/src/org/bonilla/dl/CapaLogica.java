package org.bonilla.dl;

import org.bonilla.bl.Estudiante;
import org.bonilla.bl.interfaces.Imprimible;
import org.bonilla.bl.Persona;
import org.bonilla.bl.Material;

import java.util.ArrayList;

public class CapaLogica {
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Imprimible> listaIImprimible;

    public CapaLogica() {
        estudiantes = new ArrayList<>();
    }

    public void registrarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void registrarIImprimibleP(Persona persona) { listaIImprimible.add(persona); }
    public void registrarIImprimibleM(Material material) { listaIImprimible.add(material); }

    public ArrayList<Estudiante> getEstudiantes() {
        ArrayList<Estudiante> lista;
        lista = new ArrayList<>(estudiantes);
        return lista;
    }
}

package org.bonilla.dl;

import org.bonilla.bl.Estudiante;

import java.util.ArrayList;

public class CapaLogica {
    private ArrayList<Estudiante> estudiantes;

    public CapaLogica() {
        estudiantes = new ArrayList<>();
    }

    public void registrarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public ArrayList<Estudiante> getEstudiantes() {
        ArrayList<Estudiante> lista;
        lista = new ArrayList<>(estudiantes);
        return lista;
    }
}

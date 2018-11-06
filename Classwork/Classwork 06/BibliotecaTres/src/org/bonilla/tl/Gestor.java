package org.bonilla.tl;

import org.bonilla.bl.Estudiante;
import org.bonilla.dl.CapaLogica;

public class Gestor {
    private CapaLogica logica;

    public Gestor() {
        logica = new CapaLogica();
    }

    public void registrarEstudiante(String nombre, String apellido, String identificacion, String carrera, int creditos) {
        Estudiante tmpEstudiante;
        tmpEstudiante = new Estudiante(nombre, apellido, identificacion, carrera, creditos);
        logica.registrarEstudiante(tmpEstudiante);
    }

    public String[] getEstudiantes() {
        String[] data; // Declarando el arreglo
        data = new String[logica.getEstudiantes().size()]; // Inicializa el arreglo con el tamaño
        int i = 0;                                         // del tamaño del ArrayList de estudiantes.

        for (Estudiante tmpEst : logica.getEstudiantes()) {
            data[i] = tmpEst.toString();
            i++;
        }
        return data;
    }
}

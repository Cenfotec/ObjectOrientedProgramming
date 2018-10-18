package org.bonilla.tl;

import org.bonilla.bl.Estudiante;
import org.bonilla.dl.CapaLogica;

/**
 * Clase que comunica la interfaz gráfica con la CapaLogica.
 * @author Pablo Bonilla G.
 * @since 2018/10/17
 */

public class Gestor {
    private CapaLogica logica;

    public Gestor() {
        logica = new CapaLogica();
    }

    /**
     *
     * @param nombre El nombre del estudiante.
     * @param apellido El apellido del estudiante.
     * @param identificacion La indentificación del estudiante.
     * @param carrera La carrera donde está matriculado el estudiante.
     * @param creditos La cantiad de creditos que lleva el estudiante.
     */
    public void registrarEstudiante(String nombre, String apellido, String identificacion, String carrera, int creditos) {
        Estudiante tmpEstudiante;
        tmpEstudiante = new Estudiante(nombre, apellido, identificacion, carrera, creditos);
        logica.registrarEstudiante(tmpEstudiante);
    }

    /**
     *
     * @return String[] La lista de estudiantes con el formato del método toString().
     */
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

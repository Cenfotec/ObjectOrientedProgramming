package org.bonilla.dl;

import org.bonilla.bl.Estudiante;
import org.bonilla.bl.Profesor;

import java.util.ArrayList;

public class CL {
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Profesor> profesores;

    public CL() {
        estudiantes = new ArrayList<>();
        profesores = new ArrayList<>();
    }

    public void registrarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void registrarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    // Para que se pueda imprimir la información, hay que devolver los datos
    public String[] getEstudiantes() {
        String[] data = new String[estudiantes.size()]; // Obtengo el tamaño del ArrayList
        int i = 0; // Controlar la posición en la que se va a almacenar en el arreglo
        // Se va a recorrer el ArrayList usando un for each
        for (Estudiante e : estudiantes) {
            data[i] = e.toString();
            i++;
        }
        return data;
    }
}

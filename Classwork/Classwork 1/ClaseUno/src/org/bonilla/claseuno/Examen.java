package org.bonilla.claseuno;

import java.time.LocalDate;

public class Examen {
    public String alumno;
    public double nota;
    public String materia;
    public LocalDate fecha;
    public int[][] preguntas;

    public int[][] getPreguntas() {
        return preguntas;
    }

    public void inicializarMatriz(int cantPreguntas) {
        // Inicialización de matriz, y ponerle el valor y puntaje obtenido
        preguntas = new int[cantPreguntas][3];
    }

    public void llenarMatriz(int pregunta, int nota, int valorObtenido) {
        preguntas[pregunta-1][0] = pregunta;
        preguntas[pregunta-1][1] = nota;
        preguntas[pregunta-1][2] = valorObtenido;
    }

    public int[][] getMatriz() {
        return preguntas;
    }

    public void calcularNota() {
        int notaTotal = 0;
        for (int i = 0; i < getPreguntas().length; i++) {
            notaTotal += getPreguntas()[i][2];
        }
        nota = notaTotal;
    }

    public String showData() {
        return "El examen de la materia " + materia + " se realizó el " + fecha +
                " y el alumno " + alumno + " obtuvo una nota de " + nota;
    }
}

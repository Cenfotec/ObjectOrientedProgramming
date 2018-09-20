package org.bonilla.clasetres;

import java.time.LocalDate;

public class Examen {
    private String alumno;
    private double nota;
    private String materia;
    private LocalDate fecha;
    private int[][] preguntas;

    // Constructor
    public Examen() {
        alumno = "Pablo";
        nota = 100;
        materia = "Matemática";
        fecha = LocalDate.now();
        preguntas = new int[3][3];
    }

    // Getters
    public String getAlumno() {
        return alumno;
    }

    public double getNota() {
        return nota;
    }

    public String getMateria() {
        return materia;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int[][] getPreguntas() {
        return preguntas;
    }

    // Setters
    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
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

    public void calcularNota() {
        int notaTotal = 0;
        for (int i = 0; i < getPreguntas().length; i++) {
            notaTotal += getPreguntas()[i][2];
        }
        nota = notaTotal;
    }

    public String toString() {
        return "La materia del examen es " + materia + " y tuvo lugar el " + fecha +
                " y el alumno " + alumno + " obtuvo una nota de " + nota;
    }
}

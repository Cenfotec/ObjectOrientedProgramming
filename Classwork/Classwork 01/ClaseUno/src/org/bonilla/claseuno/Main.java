package org.bonilla.claseuno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.time.LocalDate;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {
        Examen tmpExamen; // Declaración de la variable
        tmpExamen = new Examen(); // Inicialización del objecto

        // Nombre del alumno
        out.print("Digite el nombre del alumno: ");
        tmpExamen.alumno = br.readLine();

        // Materia del examen
        out.print("Digite la materia del examen:");
        tmpExamen.materia = br.readLine();

        // Hora actual
        tmpExamen.fecha = LocalDate.now();

        // Cantidad de preguntas
        out.print("Cuántas preguntas son?");
        int cp = Integer.valueOf(br.readLine());
        tmpExamen.inicializarMatriz(cp);

        // Llenar preguntas
        for (int i = 0; i < tmpExamen.getPreguntas().length; i++) {
            out.print("Número de pregunta: ");
            int pregunta = Integer.parseInt(br.readLine());
            out.print("Cuánto vale la pregunta?");
            int valor = Integer.parseInt(br.readLine());
            out.print("Cuál es el valor obtenido?");
            int valorObtenido = Integer.parseInt(br.readLine());
            out.print("");
            tmpExamen.llenarMatriz(pregunta, valor, valorObtenido);
        }

        // Calcular nota
        tmpExamen.calcularNota();

        // Mostrar datos
        out.print(tmpExamen.showData());
    }
}

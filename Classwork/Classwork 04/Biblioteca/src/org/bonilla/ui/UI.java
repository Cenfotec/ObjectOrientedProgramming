package org.bonilla.ui;

import org.bonilla.bl.Estudiante;
import org.bonilla.dl.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class UI {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    static CL cl = new CL();

    public static void main(String[] args) throws IOException {
        menuPrincipal();

    }


    public static void menuPrincipal() throws IOException {
        String opcion;
        boolean menu = true;
        do {
            mostrarMenu();
            opcion = leerOpcion();
            menu = seleccionarOpcion(opcion);
        } while (menu);
    }


    public static String leerOpcion() throws IOException {
        out.println("----------------------------------------");
        out.print("Seleccione una opción: ");
        String opcion;
        opcion = br.readLine();
        return opcion;
    }


    public static void mostrarMenu() {
        out.println("\n----------------------------------------");
        out.println("1. Registrar estudiante");
        out.println("2. Opción #2");
        out.println("3. Listar estudiantes");
    }


    public static boolean seleccionarOpcion(String opcion) throws IOException {
        boolean menu = true;

        if (opcion.equals("1")) {
            registrarEstudiante();
        }

        if (opcion.equals("2")) {
            // Opción #2
        }

        if (opcion.equals("3")) {
            listarEstudiantes();
        }

        return menu;
    }

    public static void registrarEstudiante() throws IOException {
        String nombre;
        String apellido;
        String identificacion;
        String carrera;
        int creditos;

        out.print("Digite el nombre del estudiante: ");
        nombre = br.readLine();
        out.print("Digite el apellido del estudiante: ");
        apellido = br.readLine();
        out.print("Digite la identificación del estudiante: ");
        identificacion = br.readLine();
        out.print("Digite la carrera del estudiante: ");
        carrera = br.readLine();
        out.print("Digite los creditos del estudiante: ");
        creditos = Integer.parseInt(br.readLine());
        out.print("Digite el nombre del estudiante: ");

        // Creo la instancia del estudiante
        Estudiante estudiante = new Estudiante(nombre, apellido, identificacion, carrera);

        // Se manda a insertar el ArrayList
        cl.registrarEstudiante(estudiante);
    }

    public static void listarEstudiantes() {
        String[] datos;
        datos = cl.getEstudiantes();
        for (String d : datos) {
            out.println(d);
        }
    }
}

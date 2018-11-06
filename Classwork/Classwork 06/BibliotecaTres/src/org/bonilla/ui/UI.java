package org.bonilla.ui;

import org.bonilla.bl.Administrativo;
import org.bonilla.bl.Estudiante;
import org.bonilla.bl.Persona;
import org.bonilla.bl.Profesor;
import org.bonilla.tl.Gestor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.ArrayList;

public class UI {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    static Gestor controller = new Gestor();

    public static void main(String[] args) throws IOException {
        Administrativo testAdmin = procesarAdministrativo();
        Estudiante testEst = procesarEstudiante();
        Profesor testProf = procesarProfesor();
        ArrayList<Persona> lista = new ArrayList<>();
        lista.add(testAdmin);
        lista.add(testEst);
        lista.add(testProf);

        for (Persona p : lista) {
            p.toString();
        }

        //menuPrincipal();
    }

    public static Administrativo procesarAdministrativo() throws IOException {
        String nombre;
        String apellido;
        String identificacion;
        char tipoNombramiento;
        int cantHoras;
        out.print("Nombre: ");
        nombre = br.readLine();
        out.print("Apellido: ");
        apellido = br.readLine();
        out.print("Identificación: ");
        identificacion = br.readLine();
        out.print("Tipo de nombramiento: ");
        tipoNombramiento = br.readLine().charAt(0);
        out.print("Cantidad de horas: ");
        cantHoras = Integer.parseInt(br.readLine());
        Administrativo test = new Administrativo(nombre, apellido, identificacion, tipoNombramiento, cantHoras);
        return test;
    }

    public static Estudiante procesarEstudiante() throws IOException {
        String nombre;
        String apellido;
        String identificacion;
        String carrera;
        int creditos;
        out.print("Nombre: ");
        nombre = br.readLine();
        out.print("Apellido: ");
        apellido = br.readLine();
        out.print("Identificación: ");
        identificacion = br.readLine();
        out.print("Carrera: ");
        carrera = br.readLine();
        out.print("Creditos: ");
        creditos = Integer.parseInt(br.readLine());
        Estudiante test = new Estudiante(nombre, apellido, identificacion, carrera, creditos);
        return test;
    }

    public static Profesor procesarProfesor() throws IOException {
        String nombre;
        String apellido;
        String identificacion;
        int tipoContrato;
        out.print("Nombre: ");
        nombre = br.readLine();
        out.print("Apellido: ");
        apellido = br.readLine();
        out.print("Identificación: ");
        identificacion = br.readLine();
        out.print("Tipo de contrato: ");
        tipoContrato = Integer.parseInt(br.readLine());
        Profesor test = new Profesor(nombre, apellido, identificacion, tipoContrato, LocalDate.now());
        return test;
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

        // Llama al gestor
        controller.registrarEstudiante(nombre, apellido, identificacion, carrera, creditos);
    }

    public static void listarEstudiantes() {
        String[] datos;
        datos = controller.getEstudiantes();
        for (String d : datos) {
            out.println(d);
        }
    }
}

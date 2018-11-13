package org.bonilla.ui;

import org.bonilla.tl.Gestor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.time.LocalDate;

public class UI {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    static Gestor controller = new Gestor();

    public static void main(String[] args) throws IOException {
        /*
        Persona pe = new Persona("117630799", "Pablo", "Bonilla");
        Persona pe2 = new Persona("117630799", "Nombre", "Apellido");

        Medico m = new Medico("117630799", "Pablo", "Bonilla", 1, "especialidad");
        Medico m2 = new Medico("117630799", "Nombre", "Apellido", 1, "especialidad");

        Paciente pa = new Paciente("117630799", "Pablo", "Bonilla", LocalDate.now(), m);
        Paciente pa2 = new Paciente("117630799", "Nombre", "Apellido", LocalDate.now(), m2);

        out.println("Persona: " + pe.equals(pe2));
        out.println("Medico: " + m.equals(m2));
        out.println("Paciente: " + pa.equals(pa2));
        */

        menuPrincipal();
    }

    public static void menuPrincipal() throws IOException {
        String opcion;
        boolean menu;
        do {
            mostrarMenu();
            opcion = leerOpcion();
            menu = seleccionarOpcion(opcion);
        } while (menu);
    }

    public static String leerOpcion() throws IOException {
        out.println("----------------------------------------");
        out.print("Seleccione una opción: ");
        String opcion = br.readLine();
        return opcion;
    }

    public static void mostrarMenu() {
        out.println("\n----------------------------------------");
        out.println("1. Registrar medico");
        out.println("2. Registrar paciente");
        out.println("3. Asignar medico a paciente");
        out.println("4. Listar medicos");
        out.println("5. Listar pacientes");
        out.println("6. Detener la aplicación");
    }

    public static void detenerAplicacion() {
        out.println("[!] Deteniendo la aplicación...");
        System.exit(0);
    }

    public static boolean seleccionarOpcion(String opcion) throws IOException {
        boolean menu = true;

        if (opcion.equals("1")) {
            registrarMedico();
        }

        if (opcion.equals("2")) {
            registrarPaciente();
        }

        if (opcion.equals("3")) {
            asignarMedicoPaciente();
        }

        if (opcion.equals("4")) {
            listar(controller.listarMedico());
        }

        if (opcion.equals("5")) {
            listar(controller.listarPaciente());
        }

        if (opcion.equals("6")) {
            detenerAplicacion();
        }
        return menu;
    }

    public static void registrarMedico() throws IOException {
        String cedula, nombre, apellidos;
        int numColegiado;
        String especialidad;

        out.print("Cédula: "); cedula = br.readLine();
        out.print("Nombre: "); nombre = br.readLine();
        out.print("Apellidos: "); apellidos = br.readLine();
        out.print("Número de colegiado: "); numColegiado = Integer.parseInt(br.readLine());
        out.print("Especialidad: "); especialidad = br.readLine();

        if (controller.buscarMedico(numColegiado) == null) {
            controller.registrarMedico(cedula, nombre, apellidos, numColegiado, especialidad);
            out.print("[+] Medico registrado!");
        } else {
            out.print("[!] Esite medico ya existe!");
        }

    }

    public static void registrarPaciente() throws IOException {
        String cedula, nombre, apellidos;
        LocalDate fechaIngreso = LocalDate.now();

        out.print("Cédula: "); cedula = br.readLine();
        out.print("Nombre: "); nombre = br.readLine();
        out.print("Apellidos: "); apellidos = br.readLine();

        if (controller.buscarPaciente(cedula) == null) {
            controller.registrarPaciente(cedula, nombre, apellidos, fechaIngreso);
            out.print("[+] Paciente registrado!");
        } else {
            out.print("[!] Este paciente ya existe!");
        }

    }

    public static void asignarMedicoPaciente() throws IOException {
        String cedula;
        out.print("Cédula: "); cedula = br.readLine();
        if (controller.buscarPaciente(cedula) != null) {
            controller.asignarMedicoCliente(cedula);
            out.print("[+] Se asignó medico a paciente!");
        } else {
            out.print("[!] Este paciente no existe!");
        }

    }

    public static void listar(String[] data) {
        for (int i = 0; i < data.length; i++) {
            out.print(data[i]);
        }
    }
}
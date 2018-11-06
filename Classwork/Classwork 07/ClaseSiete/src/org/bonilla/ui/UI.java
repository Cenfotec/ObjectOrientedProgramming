package org.bonilla.ui;

import org.bonilla.tl.Gestor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class UI {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    static Gestor controller = new Gestor();

    public static void main(String[] args) throws IOException {
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
        out.println("1. Registrar persona física");
        out.println("2. Registrar persona jurídica");
        out.println("3. Listar personas físicas");
        out.println("4. Listar persona jurídicas");
        out.println("5. Listar personas");
        out.println("6. Detener la aplicación");
    }

    public static void detenerAplicacion() {
        out.println("[!] Deteniendo la aplicación...");
        System.exit(0);
    }

    public static boolean seleccionarOpcion(String opcion) throws IOException {
        boolean menu = true;

        if (opcion.equals("1")) {
            registrarPersonaFisica();
        }

        if (opcion.equals("2")) {
            registrarPersonaJuridica();
        }

        if (opcion.equals("3")) {
            listarPersonasFisicas();
        }

        if (opcion.equals("4")) {
            listarPersonasJuridicas();
        }

        if (opcion.equals("5")) {
            listarPersonas();
        }

        if (opcion.equals("6")) {
            detenerAplicacion();
        }

        return menu;
    }

    public static void registrarPersonaFisica() throws IOException {
        String nombre, cedula;
        int edad;
        String apellido;
        char estadoCivil;
        double estatura, peso;

        out.print("Nombre: ");
        nombre = br.readLine();
        out.print("Cédula: ");
        cedula = br.readLine();
        out.print("Edad: ");
        edad = Integer.parseInt(br.readLine());
        out.print("Apellido: ");
        apellido = br.readLine();
        out.print("Estado civíl: ");
        estadoCivil = br.readLine().charAt(0);
        out.print("Estatura: ");
        estatura = Double.parseDouble(br.readLine());
        out.print("Peso: ");
        peso = Double.parseDouble(br.readLine());

        controller.registrarPersonaFisica(nombre, cedula, edad, apellido, estadoCivil, estatura, peso);
        out.print("[!] Persona física \"" + nombre + "\" ha sido registrado");
    }

    public static void registrarPersonaJuridica() throws IOException {
        String nombre, cedula;
        int edad;
        String representante, industria;

        out.print("Nombre: ");
        nombre = br.readLine();
        out.print("Cédula: ");
        cedula = br.readLine();
        out.print("Edad: ");
        edad = Integer.parseInt(br.readLine());
        out.print("Representante: ");
        representante = br.readLine();
        out.print("Industria: ");
        industria = br.readLine();

        controller.registrarPersonaJuridica(nombre, cedula, edad, representante, industria);
        out.print("[!] Persona jurídica \"" + nombre + "\" ha sido registrado");
    }

    public static void listarPersonasFisicas() {
        String[] data = controller.getPersonasFisica();
        for (String s : data) {
            out.print(s);
        }
    }

    public static void listarPersonasJuridicas() {
        String[] data = controller.getPersonasJuridicas();
        for (String s : data) {
            out.print(s);
        }
    }

    public static void listarPersonas() {
        String[] data = controller.getPersonas();
        for (String s : data) {
            out.print(s);
        }
    }
}
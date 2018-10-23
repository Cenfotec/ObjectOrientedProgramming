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
        out.println("1. Registrar rectangulo");
        out.println("2. Listar rectangulos");
        out.println("3. Detener la aplicación");
    }

    public static void detenerAplicacion() {
        out.println("[!] Deteniendo la aplicación...");
        System.exit(0);
    }

    public static boolean seleccionarOpcion(String opcion) throws IOException {
        boolean menu = true;

        if (opcion.equals("1")) {
            registrarRectangulo();
        }

        if (opcion.equals("2")) {
            listar(controller.listarRectangulo());
        }

        if (opcion.equals("3")) {
            detenerAplicacion();
        }

        return menu;
    }

    public static void registrarRectangulo() throws IOException {
        double base, altura;
        String tipo;

        out.print("Digite la base del rectangulo: ");
        base = Double.parseDouble(br.readLine());
        out.print("Digite la altura de la vase: ");
        altura = Double.parseDouble(br.readLine());
        out.print("Digite el tipo de rectángulo: ");
        tipo = br.readLine();
        controller.registrarRectangulo(base, altura, tipo);
        out.print("[+] Rectangulo registrado");
    }

    public static void listar(String[] data) {
        for (String s : data) {
            out.print(s);
        }
    }
}
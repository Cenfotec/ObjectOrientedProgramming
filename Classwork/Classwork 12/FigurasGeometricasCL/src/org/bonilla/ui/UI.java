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
        out.println("2. Registrar cuadrado");
        out.println("3. Registrar triangulo");
        out.println("4. Listar rectangulos");
        out.println("5. Listar cuadrados");
        out.println("6. Listar triangulos");
        out.println("7. Detener la aplicación");
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
            registrarCuadrado();
        }

        if (opcion.equals("3")) {
            registrarTriangulo();
        }

        if (opcion.equals("4")) {
            listar(controller.listarRectangulo());
        }

        if (opcion.equals("5")) {
            listar(controller.listarCuadrado());
        }
        if (opcion.equals("6")) {
            listar(controller.listarTriangulo());
        }


        if (opcion.equals("7")) {
            detenerAplicacion();
        }

        return menu;
    }

    public static void registrarRectangulo() throws IOException {
        double base, altura;
        String tipo;

        out.print("Digite la base del rectangulo: ");
        base = Double.parseDouble(br.readLine());
        out.print("Digite la altura de la base: ");
        altura = Double.parseDouble(br.readLine());
        out.print("Digite el tipo de rectángulo: ");
        tipo = br.readLine();
        controller.registrarRectangulo(base, altura, tipo);
        out.print("[+] Rectangulo registrado");
    }

    public static void registrarCuadrado() throws IOException {
        double lado;
        String tipo;

        out.print("Digite el lado del cudrado: ");
        lado = Double.parseDouble(br.readLine());
        out.print("Digite el tipo de cuadrado: ");
        tipo = br.readLine();
        controller.registrarCuadrado(lado, tipo);
        out.print("[+] Cuadrado registrado");
    }

    public static void registrarTriangulo() throws IOException {
        double base, altura;
        String tipo;

        out.print("Digite la base del triangulo: ");
        base = Double.parseDouble(br.readLine());
        out.print("Digite la altura de la base: ");
        altura = Double.parseDouble(br.readLine());
        out.print("Digite el tipo de triangulo: ");
        tipo = br.readLine();
        controller.registrarTriangulo(base, altura, tipo);
        out.print("[+] Triangulo registrado");
    }

    public static void listar(String[] data) {
        for (String s : data) {
            out.print(s);
        }
    }
}
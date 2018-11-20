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

    public static void main(String[] args) throws Exception {
        menuPrincipal();
    }

    public static void menuPrincipal() throws Exception {
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
        out.println("1. Registrar cuenta");
        out.println("2. Detener la aplicación");
    }

    public static void detenerAplicacion() {
        out.println("[!] Deteniendo la aplicación...");
        System.exit(0);
    }

    public static boolean seleccionarOpcion(String opcion) throws Exception {
        boolean menu = true;

        if (opcion.equals("1")) {
            registrarCuenta();
        }

        if (opcion.equals("2")) {
            detenerAplicacion();
        }

        return menu;
    }

    public static void registrarCuenta() throws Exception {
        int numCuenta;
        double saldo;
        String duenio;

        out.print("Número de cuenta: "); numCuenta = Integer.parseInt(br.readLine());
        out.print("Saldo: "); saldo = Double.parseDouble(br.readLine());
        out.print("Dueño: "); duenio = br.readLine();

        controller.registrarCuenta(numCuenta, saldo, duenio);
        out.print("[+] Cuenta ha sido registrada!");
    }
}
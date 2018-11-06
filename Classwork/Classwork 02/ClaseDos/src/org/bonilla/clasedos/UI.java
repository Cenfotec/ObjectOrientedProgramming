package org.bonilla.clasedos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class UI {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    static CL logica = new CL();

    public static void main(String[] args) throws IOException {
        String opcion;
        boolean menu = true;

        do {
            mostrarMenu();
            opcion = leerOpcion();
            menu = seleccionarOpcion(opcion);
        } while (menu);
    }

    public static String leerOpcion() throws IOException {
        out.println("Seleccione una opción: ");
        String opcion = "";
        opcion = br.readLine();
        return opcion;
    }

    public static void mostrarMenu() {
        out.println("1. Registrar laboratorio");
        out.println("2. Imprimir laboratorio");
    }

    public static boolean seleccionarOpcion(String opcion) throws IOException {
        boolean menu = true;

        if (opcion.equals("1")) {
            registrarLaboratorio();
        }
        if (opcion.equals("2")) {
            imprimirLaboratorio();
        }
        return menu;
    }

    static void registrarLaboratorio() throws IOException {
        Laboratorio lab;
        lab = new Laboratorio();

        int codigo;
        int capacidad;
        String nombre;

        out.print("Digite el código del laboratorio");
        lab.setCodigo(Integer.parseInt(br.readLine()));

        out.print("Digite la capacidad del laboratorio");
        lab.setCapacidad(Integer.parseInt(br.readLine()));

        out.print("Digite el nombre del laboratorio");
        lab.setNombre(br.readLine());

        // org.bonilla.clasedos.CL agrega el laboratorio
        logica.registrarLaboratorio(lab);
    }
}

package org.bonilla.practicados;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class UI {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    static CL cl = new CL();

    public static void main(String[] args) throws IOException {
        menuHandler();

    }

    public static void menuHandler() throws IOException {
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
        out.println("1. Registrar Inquilino");
        out.println("2. Registrar Propiedad");
        out.println("3. Listar Inquilino");
        out.println("4. Listar Propiedad");
    }

    public static boolean seleccionarOpcion(String opcion) throws IOException {
        boolean menu = true;

        if (opcion.equals("1")) {
            registrarInquilino();
        }

        if (opcion.equals("2")) {
            registrarPropiedad();
        }

        if (opcion.equals("3")) {
            out.print(cl.listarInquilinos());
        }

        if (opcion.equals("4")) {
            out.print(cl.listarPropiedades());
        }

        return menu;
    }


    // Registrar Inquilino
    public static void registrarInquilino() throws IOException {
        out.print("\nNombre: ");
        String nombre = br.readLine();
        out.print("Correo Electrónico: ");
        String correoElectronico = br.readLine();
        out.print("Dirección: ");
        String direccion = br.readLine();
        out.print("Teléfono: ");
        int telefono = Integer.parseInt(br.readLine());
        out.print("Identificación: ");
        String identificacion = br.readLine();
        out.print("Género: ");
        String genero = br.readLine();

        if (cl.buscarInquilino(identificacion) == null) {
            Inquilino inquilino = new Inquilino(nombre, correoElectronico, direccion, telefono, identificacion, genero);
            cl.registrarInquilino(inquilino);
            out.print("[+] Inquilino ha sido registrado !");
        } else {
            out.print("[!] Este inquilino ya existe!");
        }




    }

    // Registrar Propiedades
    public static void registrarPropiedad() throws IOException {
        out.print("\nCódigo: ");
        int codigo = Integer.parseInt(br.readLine());
        out.print("Nombre: ");
        String nombre = br.readLine();
        out.print("Valor inmueble: ");
        double valorInmueble = Double.parseDouble(br.readLine());
        out.print("Dirección: ");
        String direccion = br.readLine();
        out.print("Residencial: ");
        String residencial = br.readLine();
        out.print("Número de casa: ");
        int numeroCasa = Integer.parseInt(br.readLine());
        out.print("Tiene patio? [si/no] ");
        boolean patio = (br.readLine().equalsIgnoreCase("si")) ? true : false;
        out.print("Cantidad de habitaciones: ");
        int cantidadHabitaciones = Integer.parseInt(br.readLine());

        if (cl.buscarPropiedad(codigo) == null) {
            Propiedad propiedad = new Propiedad(codigo, nombre, valorInmueble, direccion, residencial, numeroCasa, patio, cantidadHabitaciones);
            cl.registrarPropiedad(propiedad);
            out.print("[+] Propiedad ha sido registrada!");
        } else {
            out.print("[!] Esta propiedad ya existe!");
        }




    }
}

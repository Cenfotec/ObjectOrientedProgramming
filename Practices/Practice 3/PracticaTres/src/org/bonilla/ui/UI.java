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
        out.println("1. Registrar inquilino");
        out.println("2. Registrar propiedad");
        out.println("3. Listar inquilinos");
        out.println("4. Listar propiedades");
        out.println("5. Detener apliación");
    }

    public static void detenerAplicacion() {
        out.println("[!] Deteniendo la aplicación...");
        System.exit(0);
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
            listarInquilinos();
        }

        if (opcion.equals("4")) {
            listarPropiedades();
        }

        if (opcion.equals("5")) {
            detenerAplicacion();
        }

        return menu;
    }

    // Registrar propiedad
    public static void registrarInquilino() throws IOException {
        String nombre, correoElectronico, direccion;
        int telefono;
        String identificacion, genero;

        out.print("Nombre: ");
        nombre = br.readLine();
        out.print("Correo Electrónico: ");
        correoElectronico = br.readLine();
        out.print("Dirección: ");
        direccion = br.readLine();
        out.print("Teléfono: ");
        telefono = Integer.parseInt(br.readLine());
        out.print("Identificación: ");
        identificacion = br.readLine();
        out.print("Género: ");
        genero = br.readLine();

        if (!controller.buscarInquilino(identificacion)) {
            controller.registrarInquilino(nombre, correoElectronico, direccion, telefono, identificacion, genero);
        } else {
            out.print("[!] Este inquilino ya existe!");
        }
    }

    // Registar propiedad
    public static void registrarPropiedad() throws IOException {
        int codigo;
        String nombre;
        double valorInmueble;
        String direccion, residencial;
        int numeroCasa;
        boolean patio;
        int cantidadHabitaciones;

        out.print("Código: ");
        codigo = Integer.parseInt(br.readLine());
        out.print("Nombre: ");
        nombre = br.readLine();
        out.print("Valor inmueble: ");
        valorInmueble = Double.parseDouble(br.readLine());
        out.print("Dirección: ");
        direccion = br.readLine();
        out.print("Residencial: ");
        residencial = br.readLine();
        out.print("Número de casa: ");
        numeroCasa = Integer.parseInt(br.readLine());
        out.print("Patio (s/n): ");
        patio = br.readLine().equalsIgnoreCase("s");
        out.print("Cantidad de habitaciones: ");
        cantidadHabitaciones = Integer.parseInt(br.readLine());

        if (!controller.buscarPropiedad(codigo)) {
            controller.registrarPropiedad(codigo, nombre, valorInmueble, direccion, residencial, numeroCasa, patio, cantidadHabitaciones);
        } else {
            out.print("[!] Esta propiedad ya existe!");
        }
    }

    // Listar inquilinos
    public static void listarInquilinos() {
        String lista = controller.listarInquilinos();
        out.print(lista);
    }

    // Listar propiedades
    public static void listarPropiedades() {
        String lista = controller.listarPropiedades();
        out.print(lista);
    }
}

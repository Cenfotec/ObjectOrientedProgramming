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
            // Segunda opción
        }

        if (opcion.equals("3")) {
            listarInquilinos();
        }

        if (opcion.equals("4")) {
            listarPropiedades();
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

        Inquilino inquilino = new Inquilino(nombre, correoElectronico, direccion, telefono, identificacion, genero);
        cl.registrarInquilino(inquilino);

        out.print("[+] Inquilino ha sido registrado!");
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
        out.print("Tiene patio? [si/no]");
        boolean patio = (br.readLine().equalsIgnoreCase("si")) ? true : false;
        out.print("Cantidad de habitaciones: ");
        int cantidadHabitaciones = Integer.parseInt(br.readLine());

        Propiedad propiedad = new Propiedad(codigo, nombre, valorInmueble, direccion, residencial, numeroCasa, patio, cantidadHabitaciones);
        cl.registrarPropiedad(propiedad);

        out.print("[+] Propiedad ha sido registrada!");
    }


    // Listar Inquilinos
    public static void listarInquilinos() {
        for (int i = 0; i < cl.getInquilinosLista().size(); i++) {
            out.println("+----------");
            out.println("| Nombre: " + cl.getInquilinosLista().get(i).getNombre());
            out.println("| Correo electrónico: " + cl.getInquilinosLista().get(i).getCorreoElectronico());
            out.println("| Dirección: " + cl.getInquilinosLista().get(i).getDireccion());
            out.println("| Teléfono: " + cl.getInquilinosLista().get(i).getTelefono());
            out.println("| Identificación: " + cl.getInquilinosLista().get(i).getIdentificacion());
            out.println("| Género: " + cl.getInquilinosLista().get(i).getGenero());
        }
    }


    // Listar Propiedad
    public static void listarPropiedades() {
        for (int i = 0; i < cl.getPropiedadesLista().size(); i++) {
            out.println("+----------");
            out.println("| Código: " + cl.getPropiedadesLista().get(i).getNombre());
            out.println("| Nombre: " + cl.getPropiedadesLista().get(i).getNombre());
            out.println("| Valor inmueble: " + cl.getPropiedadesLista().get(i).getValorInmueble());
            out.println("| Dirección: " + cl.getPropiedadesLista().get(i).getDireccion());
            out.println("| Residencial: " + cl.getPropiedadesLista().get(i).getResidencial());
            out.println("| Número de casa: " + cl.getPropiedadesLista().get(i).getNumeroCasa());
            String patio = (cl.getPropiedadesLista().get(i).isPatio()) ? "Sí" : "No";
            out.println("| Tiene patio: " + patio);
            out.println("| Cantidad de habitaciones: " + cl.getPropiedadesLista().get(i).getCantidadHabitaciones());
        }
    }
}

package org.bonilla.laboratoriouno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class UI {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream out = System.out;

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
        out.println("1. Registrar inquilino");
        out.println("2. Registrar propiedad");
        out.println("3. Listar inquilinos");
        out.println("4. Listar propiedades");
    }

    public static boolean seleccionarOpcion(String opcion) throws IOException {
        boolean menu = true;

        if (opcion.equals("1")) {
            String[] info = new String[] { "Nombre: ", "Apellido: ", "Correo: ", "Dirección: ", "Telefono: ", "Identificación: ", "Genero: " };
            String[] inquilino = new String[info.length];
            String infoDetalle;
            out.println("-- Registro de Inquilino --");
            for (int i = 0; i < inquilino.length; i++) {
                infoDetalle = "None";
                out.print("\n" + info[i]);
                infoDetalle = br.readLine();
                inquilino[i] = infoDetalle;

            }
            boolean existe = false;
            for (int i = 0; i < CL.getInquilinos().length; i++) {
                if (i == 0 && CL.getInquilinos()[i][5] != null) {
                    if (CL.getInquilinos()[i][5].equals(inquilino[5])) {
                        existe = true;
                    }
                }
            }

            if (existe) {
                out.println("[!] Registro fallido, este inquilino ya existe!");
            } else {
                CL.registrarInquilino(inquilino);
                out.println("Inquilino \"" + inquilino[0] + "\" (" + inquilino[5] + ") ha sido registrado");
            }

        }

        if (opcion.equals("2")) {
            String[] info = new String[] { "Código: ", "Nombre: ", "Valor inmueble: ", "Dirección: ", "Residencial: ", "Número de casa: ", "Tiene patio? ", "Cantidad de habitaciones: " };
            String[] propiedad = new String[info.length];
            String infoDetalle = "None";
            out.println("-- Registro de Propiedad --");
            for (int i = 0; i < propiedad.length; i++) {
                infoDetalle = "None";
                out.print("\n" + info[i]);
                infoDetalle = br.readLine();
                propiedad[i] = infoDetalle;

            }
            boolean existe = false;
            for (int i = 0; i < CL.getPropiedades().length; i++) {
                if (i == 0 && CL.getPropiedades()[i][5] != null) {
                    if (CL.getPropiedades()[i][5].equals(propiedad[5])) {
                        existe = true;
                    }
                }
            }

            if (existe) {
                out.println("[!] Registro fallido, esta propiedad ya existe!");
            } else {
                CL.registrarPropiedad(propiedad);
                out.println("Propiedad \"" + propiedad[1] + "\" (" + propiedad[2] + ") ha sido registrada");
            }
        }

        if (opcion.equals("3")) {
            out.println("-- Lista de Inquilinos --");
            for (int i = 0; i < CL.getInquilinos().length; i++) {
                for (int j = 0; j < CL.getInquilinos()[0].length; j++) {
                    if (CL.getInquilinos()[i][j] != null) {
                        out.print(CL.getInquilinos()[i][j] + ", ");
                    }
                }
                if (CL.getInquilinos()[i][0] != null) {
                    out.println("");
                }

            }
            out.println("");
        }


        if (opcion.equals("4")) {
            out.println("-- Lista de Propiedades --");
            for (int i = 0; i < CL.getPropiedades().length; i++) {
                for (int j = 0; j < CL.getPropiedades()[0].length; j++) {
                    if (CL.getPropiedades()[i][j] != null) {
                        out.print(CL.getPropiedades()[i][j] + ", ");
                    }
                }
                if (CL.getPropiedades()[i][0] != null) {
                    out.println("");
                }

            }
            out.println("");
        }

        return menu;
    }


}




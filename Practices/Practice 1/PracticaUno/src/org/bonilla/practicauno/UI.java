package org.bonilla.practicauno;

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
        out.print("\nSeleccione una opción: ");
        String opcion = "";
        opcion = br.readLine();
        return opcion;
    }

    public static void mostrarMenu() {
        out.println("1. Registrar empleados");
        out.println("2. Registrar profesores");
        out.println("3. Registrar carreras");
        out.println("4. Registrar laboratorios");
        out.println("5. Listar empleados");
        out.println("6. Listar profesores");
        out.println("7. Listar carreras");
        out.println("8. Listar laboratorios");
    }

    public static boolean seleccionarOpcion(String opcion) throws IOException {
        boolean menu = true;

        if (opcion.equals("1")) {
            String[] info = new String[]{"Cédula: ", "Nombre: ", "Apellido: ", "Dirección: ", "Teléfono: ", "Puesto: "};
            String[] empleado = new String[info.length];
            String infoDetalle;
            out.println("\n-- Registro de Empleado --");
            for (int i = 0; i < empleado.length; i++) {
                out.print(info[i]);
                infoDetalle = br.readLine();
                empleado[i] = infoDetalle;
            }
            if (CL.buscarEmpleado(empleado[0])[0] == null) {
                CL.registrarEmpleado(empleado);
                out.println("Empleado \"" + empleado[1] + "\" (" + empleado[0] + ") ha sido registrado");
            } else {
                out.println("\n[!] Registro fallido, este empleado ya existe!\n");
            }
        }

        if (opcion.equals("2")) {
            String[] info = new String[]{"Cédula: ", "Nombre: ", "Apellido: ", "Dirección: ", "Teléfono: ", "Lugar de trabajo: ", "Años de experiencia: "};
            String[] profesor = new String[info.length];
            String infoDetalle;
            out.println("\n-- Registro de Profesor --");
            for (int i = 0; i < profesor.length; i++) {
                out.print(info[i]);
                infoDetalle = br.readLine();
                profesor[i] = infoDetalle;

            }
            if (CL.buscarProfesor(profesor[0])[0] == null) {
                CL.registrarProfesor(profesor);
                out.println("Profesor \"" + profesor[1] + "\" (" + profesor[0] + ") ha sido registrado");
            } else {
                out.println("\n[!] Registro fallido, este profesor ya existe!\n");
            }
        }

        if (opcion.equals("3")) {
            String[] info = new String[]{"Código: ", "Nombre: ", "Grado: ", "Acreditado: "};
            String[] carrera = new String[info.length];
            String infoDetalle;
            out.println("\n-- Registro de Carrera --");
            for (int i = 0; i < carrera.length; i++) {
                out.print(info[i]);
                infoDetalle = br.readLine();
                carrera[i] = infoDetalle;

            }
            if (CL.buscarCarrera(carrera[0])[0] == null) {
                CL.registrarCarrera(carrera);
                out.println("Carrera \"" + carrera[1] + "\" (" + carrera[0] + ") ha sido registrada");
            } else {
                out.println("\n[!] Registro fallido, esta carrera ya existe!\n");
            }
        }

        if (opcion.equals("4")) {
            String[] info = new String[]{"Código: ", "Nombre: ", "Capacidad: ", "Código de la Carrera: ", "Código del curso: "};
            String[] laboratorio = new String[info.length];
            String infoDetalle;
            out.println("\n-- Registro de Laboratorio --");
            for (int i = 0; i < laboratorio.length; i++) {
                out.print(info[i]);
                infoDetalle = br.readLine();
                laboratorio[i] = infoDetalle;

            }
            if (CL.buscarLaboratorio(laboratorio[0])[0] == null) {
                CL.registrarLaboratorio(laboratorio);
                out.println("Laboratorio \"" + laboratorio[1] + "\" (" + laboratorio[0] + ") ha sido registrado");
            } else {
                out.println("\n[!] Registro fallido, este laboratorio ya existe!\n");
            }
        }

        if (opcion.equals("5")) {
            String[] info = new String[]{"Cédula: ", "Nombre: ", "Apellido: ", "Dirección: ", "Teléfono: ", "Puesto: "};
            out.println("\n-- Lista de Empleados --");
            for (int i = 0; i < CL.getEmpleados().length; i++) {
                for (int j = 0; j < CL.getEmpleados()[0].length; j++) {
                    if (CL.getEmpleados()[i][j] != null) {
                        out.print(info[j] + CL.getEmpleados()[i][j] + "\n");
                    }
                }
                if (CL.getEmpleados()[i][0] != null) {
                    out.println("");
                }

            }
            out.println("");
        }

        if (opcion.equals("6")) {
            String[] info = new String[]{"Cédula: ", "Nombre: ", "Apellido: ", "Dirección: ", "Teléfono: ", "Lugar de trabajo: ", "Años de experiencia: "};
            out.println("\n-- Lista de Profesores --");
            for (int i = 0; i < CL.getProfesores().length; i++) {
                for (int j = 0; j < CL.getProfesores()[0].length; j++) {
                    if (CL.getProfesores()[i][j] != null) {
                        out.print(info[j] + CL.getProfesores()[i][j] + "\n");
                    }
                }
                if (CL.getProfesores()[i][0] != null) {
                    out.println("");
                }

            }
            out.println("");
        }

        if (opcion.equals("7")) {
            String[] info = new String[]{"Código: ", "Nombre: ", "Grado: ", "Acreditado: "};
            out.println("\n-- Lista de Carreras --");
            for (int i = 0; i < CL.getCarreras().length; i++) {
                for (int j = 0; j < CL.getCarreras()[0].length; j++) {
                    if (CL.getCarreras()[i][j] != null) {
                        out.print(info[j] + CL.getCarreras()[i][j] + "\n");
                    }
                }
                if (CL.getCarreras()[i][0] != null) {
                    out.println("");
                }

            }
            out.println("");
        }

        if (opcion.equals("8")) {
            String[] info = new String[]{"Código: ", "Nombre: ", "Capacidad: ", "Código de la Carrera: ", "Código del curso: "};
            out.println("\n-- Lista de Laboratorios --");
            for (int i = 0; i < CL.getLaboratorios().length; i++) {
                for (int j = 0; j < CL.getLaboratorios()[0].length; j++) {
                    if (CL.getLaboratorios()[i][j] != null) {
                        out.print(info[j] + CL.getLaboratorios()[i][j] + "\n");
                    }
                }
                if (CL.getLaboratorios()[i][0] != null) {
                    out.println("");
                }

            }
            out.println("");
        }
        return menu;
    }
}

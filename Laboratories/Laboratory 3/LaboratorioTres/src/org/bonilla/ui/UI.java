package org.bonilla.ui;

import org.bonilla.tl.Gestor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.time.LocalDate;
import java.time.LocalTime;

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
        out.println("1. Registrar Usuario");
        out.println("2. Registrar Cliente Físico");
        out.println("3. Registrar Cliente Jurídico");
        out.println("4. Registrar Contacto");
        out.println("5. Registrar Proyecto Académico");
        out.println("6. Registrar Proyecto Comercial");
        out.println("7. Registrar Tecnología");
        out.println("8. Registrar Actividad");
        out.println("9. Registrar Bitácora");
        out.println("10. Registar Registro de Actividad");
        out.println("11. Listar Usuarios");
        out.println("12. Listar Clientes Físicos");
        out.println("13. Listar Clientes Jurídicos");
        out.println("14. Listar Contactos");
        out.println("15. Listar Proyectos Académicos");
        out.println("16. Listar Proyectos Comerciales");
        out.println("17. Listar Tecnologías");
        out.println("18. Listar Actividades");
        out.println("19. Listar Bitacoras");
        out.println("20. Listar Registro de Actividades");
        out.println("21. Detener la aplicación");
    }

    public static void detenerAplicacion() {
        out.println("[!] Deteniendo la aplicación...");
        System.exit(0);
    }

    public static boolean seleccionarOpcion(String opcion) throws IOException {
        boolean menu = true;

        if (opcion.equals("1")) {
            registrarUsuario();
        }

        if (opcion.equals("2")) {
            registrarClienteFisico();
        }

        if (opcion.equals("3")) {
            registrarClienteJuridico();
        }

        if (opcion.equals("4")) {
            registrarContacto();
        }

        if (opcion.equals("5")) {
            registrarProyectoAcademico();
        }

        if (opcion.equals("6")) {
            registrarProyectoComercial();
        }

        if (opcion.equals("7")) {
            registrarTecnologia();
        }

        if (opcion.equals("8")) {
            registrarActividad();
        }

        if (opcion.equals("9")) {
            registrarBitacora();
        }

        if (opcion.equals("10")) {
            registrarRegistroActividad();
        }

        if (opcion.equals("11")) {
            listarDatos(controller.listarUsuario());
        }

        if (opcion.equals("12")) {
            listarDatos(controller.listarClienteFisico());
        }

        if (opcion.equals("13")) {
            listarDatos(controller.listarClienteJuridico());
        }

        if (opcion.equals("14")) {
            listarDatos(controller.listarContacto());
        }

        if (opcion.equals("15")) {
            listarDatos(controller.listarProyectoAcademico());
        }

        if (opcion.equals("16")) {
            listarDatos(controller.listarProyectoComercial());
        }

        if (opcion.equals("17")) {
            listarDatos(controller.listarTecnologia());
        }

        if (opcion.equals("18")) {
            listarDatos(controller.listarActividad());
        }

        if (opcion.equals("19")) {
            listarDatos(controller.listarBitacora());
        }

        if (opcion.equals("20")) {
            listarDatos(controller.listarRegistroActividad());
        }

        if (opcion.equals("21")) {
            detenerAplicacion();
        }

        return menu;
    }

    public static void registrarUsuario() throws IOException {
        String nombre, primeroApellido, segundoApellido, correo, cedula, genero, avatar;
        out.print("Nombre: "); nombre = br.readLine();
        out.print("Primer apellido: "); primeroApellido = br.readLine();
        out.print("Segundo apellido: "); segundoApellido = br.readLine();
        out.print("Correo: "); correo = br.readLine();
        out.print("Cédula: "); cedula = br.readLine();
        out.print("Género: "); genero = br.readLine();
        out.print("Avatar: "); avatar = br.readLine();

        if (!controller.buscarUsuario(cedula)) {
            controller.registrarUsuario(nombre, primeroApellido, segundoApellido, correo, cedula, genero, avatar);
            out.print("[+] Usuario registrado!");
        } else {
            out.print("[!] Este usuario ya existe!");
        }
    }

    public static void registrarClienteFisico() throws IOException {
        String nombre, provincia, canton, distrito, direccion;
        int telefono;
        String primeroApellido, segundoApellido, correo;

        out.print("Nombre: "); nombre = br.readLine();
        out.print("Provincia: "); provincia = br.readLine();
        out.print("Cantón: "); canton = br.readLine();
        out.print("Distrito: "); distrito = br.readLine();
        out.print("Dirección: "); direccion = br.readLine();
        out.print("Teléfono: "); telefono = Integer.parseInt(br.readLine());
        out.print("Primer apellido: "); primeroApellido = br.readLine();
        out.print("Segundo apellido: "); segundoApellido = br.readLine();
        out.print("Correo: "); correo = br.readLine();

        if (!controller.buscarClienteFisico(correo)) {
            controller.registrarClienteFisico(nombre, provincia, canton, distrito, direccion, telefono, primeroApellido, segundoApellido, correo);
            out.print("[+] Cliente físico registrado!");
        } else {
            out.print("[!] Este cliente físico ya exite!");
        }
    }

    public static void registrarClienteJuridico() throws IOException {
        String nombre, provincia, canton, distrito, direccion;
        int telefono;
        String identificacion;

        out.print("Nombre: "); nombre = br.readLine();
        out.print("Provincia: "); provincia = br.readLine();
        out.print("Cantón: "); canton = br.readLine();
        out.print("Distrito: "); distrito = br.readLine();
        out.print("Dirección: "); direccion = br.readLine();
        out.print("Teléfono: "); telefono = Integer.parseInt(br.readLine());
        out.print("Identificación: "); identificacion = br.readLine();

        if (!controller.buscarClienteJuridico(identificacion)) {
            controller.registrarClienteJuridico(nombre, provincia, canton, distrito, direccion, telefono, identificacion);
            out.print("[+] Cliente jurídico registrado!");
        } else {
            out.print("[!] Este cliente jurídico ya existe!");
        }
    }

    public static void registrarContacto() throws IOException {
        String nombre, primerApellido, segundoApellido, cedula, correo;
        int telefono;

        out.print("Nombre: "); nombre = br.readLine();
        out.print("Primero apellido: "); primerApellido = br.readLine();
        out.print("Segundo apellido: "); segundoApellido = br.readLine();
        out.print("Cédula: "); cedula = br.readLine();
        out.print("Correo: "); correo = br.readLine();
        out.print("Teléfono: "); telefono = Integer.parseInt(br.readLine());

        if (!controller.buscarContacto(cedula)) {
            controller.registrarContacto(nombre, primerApellido, segundoApellido, cedula, correo, telefono);
            out.print("[+] Contacto registrado!");
        } else {
            out.print("[!] Este contacto ya existe!");
        }
    }

    public static void registrarProyectoAcademico() throws IOException {
        String codigo, nombre, descripcion;
        LocalDate fechaInicio, fechaFin;

        out.print("Código: "); codigo = br.readLine();
        out.print("Nombre: "); nombre = br.readLine();
        out.print("Descripción: "); descripcion = br.readLine();
        fechaInicio = LocalDate.now(); out.print("Fecha de inicio: " + fechaInicio + "\n");
        out.print("Fecha de fin (e.g 2018-01-24): "); fechaFin = LocalDate.parse(br.readLine());

        if (!controller.buscarProyectoAcademico(codigo)) {
            controller.registrarProyectoAcademico(codigo, nombre, descripcion, fechaInicio, fechaFin);
            out.print("[+] Proyecto académico registrado!");
        } else {
            out.print("[!] Este proyecto académico ya existe!");
        }
    }

    public static void registrarProyectoComercial() throws IOException {
        String codigo, nombre, descripcion;
        LocalDate fechaInicio, fechaFin;

        out.print("Código: "); codigo = br.readLine();
        out.print("Nombre: "); nombre = br.readLine();
        out.print("Descripción: "); descripcion = br.readLine();
        fechaInicio = LocalDate.now(); out.print("Fecha de inicio: " + fechaInicio + "\n");
        out.print("Fecha de fin (e.g 2018-01-24): "); fechaFin = LocalDate.parse(br.readLine());

        if (!controller.buscarProyectoComercial(codigo)) {
            controller.registrarProyectoComercial(codigo, nombre, descripcion, fechaInicio, fechaFin);
            out.print("[+] Proyecto comercial registrado!");
        } else {
            out.print("[!] Este proyecto comercial ya existe!");
        }
    }

    public static void registrarTecnologia() throws IOException {
        String codigo, nombre;

        out.print("Código: "); codigo = br.readLine();
        out.print("Nombre: "); nombre = br.readLine();

        if (!controller.buscarTecnologia(codigo)) {
            controller.registrarTecnologia(codigo, nombre);
            out.print("[+] Tecnología registrada!");
        } else {
            out.print("[!] Esta tecnología ya existe!");
        }
    }

    public static void registrarActividad() throws IOException {
        String codigo, nombre, descripcion;

        out.print("Código: "); codigo = br.readLine();
        out.print("Nombre: "); nombre = br.readLine();
        out.print("Descripción: "); descripcion = br.readLine();

        if (!controller.buscarActividad(codigo)) {
            controller.registrarActividad(codigo, nombre, descripcion);
            out.print("[+] Actividad registrada!");
        } else {
            out.print("[!] Esta actividad ya existe!");
        }
    }

    public static void registrarBitacora() throws IOException {
        String codigo;

        out.print("Código: "); codigo = br.readLine();

        if (!controller.buscarBitacora(codigo)) {
            controller.registrarBitacora(codigo, null);
            out.print("[+] Bitácora registrada1");
        } else {
            out.print("[!] Esta bitácora ya existe!");
        }
    }

    public static void registrarRegistroActividad() throws IOException {
        String codigo;
        LocalDate fechaInicio, fechaFin;
        LocalTime horaInicio, horaFin = null;

        out.print("Código: "); codigo = br.readLine();
        fechaInicio = LocalDate.now(); out.print("Fecha de inicio: " + fechaInicio + "\n");
        out.print("Fecha de fin (e.g 2018-01-24): "); fechaFin = LocalDate.parse(br.readLine());
        horaInicio = LocalTime.now(); out.print("Hora de inicio: " + horaInicio + "\n");
        out.print("Hora de fin (e.g 22:16:02): ");
        try {
            horaFin = LocalTime.parse(br.readLine());
        } catch (Exception e){ }

        if (!controller.buscarRegistroActividad(codigo)) {
            controller.registrarRegistroActividad(codigo, fechaInicio, horaInicio, fechaFin, horaFin);
            out.print("[+] Registro de actividad registrado!");
        } else {
            out.print("[!] Este registro de actividad ya existe!");
        }
    }

    // Listar datos
    public static void listarDatos(String data) {
        out.print(data);
    }
}
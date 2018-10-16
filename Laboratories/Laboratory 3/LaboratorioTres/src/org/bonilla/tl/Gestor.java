package org.bonilla.tl;

import org.bonilla.bl.*;
import org.bonilla.dl.CapaLogica;
import org.bonilla.dl.TextFileReader;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Gestor {
    private CapaLogica logica;
    private TextFileReader tfr;

    public Gestor() {
        logica = new CapaLogica();
        tfr = new TextFileReader();
    }

    // Registar usuario
    public void registrarUsuario(String nombre, String primerApellido, String segundoApellido, String correo, String cedula, String genero, String avatar) {
        Usuario usuario = new Usuario(nombre, primerApellido, segundoApellido, correo, cedula, genero, avatar);
        logica.registrarUsuario(usuario);
    }

    // Registrar cliente físico
    public void registrarClienteFisico(String nombre, String provincia, String canton, String distrito, String direccion, int telefono, String primerApellido, String segundoApellido, String correo) {
        ClienteFisico clienteFisico = new ClienteFisico(nombre, provincia, canton, distrito, direccion, telefono, primerApellido, segundoApellido, correo);
        logica.registrarClienteFisico(clienteFisico);
    }

    // Registrar cliente jurídico
    public void registrarClienteJuridico(String nombre, String provincia, String canton, String distrito, String direccion, int telefono, String identificacion) {
        ClienteJuridico clienteJuridico = new ClienteJuridico(nombre, provincia, canton, distrito, direccion, telefono, identificacion);
        logica.registrarClienteJuridico(clienteJuridico);
    }

    // Registrar contacto
    public void registrarContacto(String nombre, String primerApellido, String segundoApellido, String cedula, String correo, int telefono) {
        Contacto contacto = new Contacto(nombre, primerApellido, segundoApellido, cedula, correo, telefono);
        logica.registrarContacto(contacto);
    }

    // Registrar proyecto academico
    public void registrarProyectoAcademico(String codigo, String nombre, String descripcion, LocalDate fechaInicio, LocalDate fechaFin) {
        ProyectoAcademico proyectoAcademico = new ProyectoAcademico(codigo, nombre, descripcion, fechaInicio, fechaFin);
        logica.registrarProyectoAcademico(proyectoAcademico);
    }

    // Registrar proyecto comercial
    public void registrarProyectoComercial(String codigo, String nombre, String descripcion, LocalDate fechaInicio, LocalDate fechaFin) {
        ProyectoComercial proyectoComercial = new ProyectoComercial(codigo, nombre, descripcion, fechaInicio, fechaFin);
        logica.registrarProyectoComercial(proyectoComercial);
    }

    // Registrar tecnología
    public void registrarTecnologia(String codigo, String nombre) {
        Tecnologia tecnologia = new Tecnologia(codigo, nombre);
        logica.registrarTecnologia(tecnologia);
    }

    // Registrar actividad
    public void registrarActividad(String codigo, String nombre, String descripcion) {
        Actividad actividad = new Actividad(codigo, nombre, descripcion);
        logica.registrarActividad(actividad);
    }

    // Registrar bitácora
    public void registrarBitacora(String codigo, ArrayList<RegistroActividad> listaRegistroActividad) {
        Bitacora bitacora = new Bitacora(codigo, listaRegistroActividad);
        logica.registrarBitacora(bitacora);
    }

    // Registrar registro de actividad
    public void registrarRegistroActividad(String codigo, LocalDate fechaInicio, LocalTime horaInicio, LocalDate fechaFin, LocalTime horaFin) {
        RegistroActividad registroActividad = new RegistroActividad(codigo, fechaInicio, horaInicio, fechaFin, horaFin);
        logica.registrarRegistroActividad(registroActividad);
    }

    // Listar usuario
    public String listarUsuario() {
        return tfr.listarUsuario();
    }

    // Listar cliente físico
    public String listarClienteFisico() {
        return tfr.listarClienteFisico();
    }

    // Listar cliente jurídico
    public String listarClienteJuridico() {
        return tfr.listarClienteJuridico();
    }

    // Listar contacto
    public String listarContacto() {
        return tfr.listarContacto();
    }

    // Listar proyecto académico
    public String listarProyectoAcademico() {
        return tfr.listarProyectoAcademico();
    }

    // Listar proyecto comercial
    public String listarProyectoComercial() {
        return tfr.listarProyectoComercial();
    }

    // Listar tecnología
    public String listarTecnologia() {
        return tfr.listarTecnologia();
    }

    // Listar actividad
    public String listarActividad() {
        return tfr.listarActividad();
    }

    // Listar bitácora
    public String listarBitacora() {
        return tfr.listarBitacora();
    }

    // Listar registro de actividad
    public String listarRegistroActividad() {
        return tfr.listarRegistroActividad();
    }

    // Buscar usuario
    public boolean buscarUsuario(String cedula) {
        return tfr.buscarUsuario(cedula);
    }

    // Buscar cliente físico
    public boolean buscarClienteFisico(String correo) {
        return tfr.buscarClienteFisico(correo);
    }

    // Buscar cliente jurídico
    public boolean buscarClienteJuridico(String identificacion) {
        return tfr.buscarClienteJuridico(identificacion);
    }

    // Buscar contacto
    public boolean buscarContacto(String cedula) {
        return tfr.buscarContacto(cedula);
    }

    // Buscar proyecto académico
    public boolean buscarProyectoAcademico(String codigo) {
        return tfr.buscarProyectoAcademico(codigo);
    }

    // Buscar proyecto comercial
    public boolean buscarProyectoComercial(String codigo) {
        return tfr.buscarProyectoComercial(codigo);
    }

    // Buscar tecnología
    public boolean buscarTecnologia(String codigo) {
        return tfr.buscarTecnologia(codigo);
    }

    // Buscar actividad
    public boolean buscarActividad(String codigo) {
        return tfr.buscarActividad(codigo);
    }

    // Buscar bitácora
    public boolean buscarBitacora(String codigo) {
        return tfr.buscarBitacora(codigo);
    }

    // Buscar registro de actividad
    public boolean buscarRegistroActividad(String codigo) {
        return tfr.buscarRegistroActividad(codigo);
    }
}
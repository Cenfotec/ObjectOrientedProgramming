package org.bonilla.dl;

import org.bonilla.bl.*;

import java.time.LocalDate;

public class CapaLogica {
    private TextFileReader tfr;

    public CapaLogica() {
        tfr = new TextFileReader();
    }

    public void registrarUsuario(Usuario usuario) {
        tfr.escribirUsuario(usuario);
    }

    public void registrarClienteFisico(ClienteFisico clienteFisico) {
        tfr.escribirClienteFisico(clienteFisico);
    }

    public void registrarClienteJuridico(ClienteJuridico clienteJuridico) {
        tfr.escribirClienteJuridico(clienteJuridico);
    }

    public void registrarContacto(Contacto contacto) {
        tfr.escribirContacto(contacto);
    }

    public void registrarProyectoAcademico(ProyectoAcademico proyectoAcademico) {
        tfr.escribirProyectoAcademico(proyectoAcademico);
    }


    public void registrarProyectoComercial(ProyectoComercial proyectoComercial) {
        tfr.escribirProyectoComercial(proyectoComercial);
    }

    public void registrarTecnologia(Tecnologia tecnologia) {
        tfr.escribirTecnologia(tecnologia);
    }

    public void registrarActividad(Actividad actividad) {
        tfr.escribirActividad(actividad);
    }

    public void registrarBitacora(Bitacora bitacora) {
        tfr.escribirBitacora(bitacora);
    }

    public void registrarRegistroActividad(RegistroActividad registroActividad) {
        tfr.escribirRegistroActividad(registroActividad);
    }
}

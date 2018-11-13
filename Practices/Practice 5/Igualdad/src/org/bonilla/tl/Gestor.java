package org.bonilla.tl;

import org.bonilla.bl.Medico;
import org.bonilla.bl.Paciente;
import org.bonilla.dl.CapaLogica;

import java.time.LocalDate;
import java.util.ArrayList;

public class Gestor {
    private CapaLogica logica;

    public Gestor() {
        logica = new CapaLogica();
    }

    public void registrarMedico(String cedula, String nombre, String apellidos, int numColegiado, String especialidad) {
        Medico medico = new Medico(cedula, nombre, apellidos, numColegiado, especialidad);
        logica.registrarMedico(medico);
    }

    public void registrarPaciente(String cedula, String nombre, String apellidos, LocalDate fechaIngreso) {
        Paciente paciente = new Paciente(cedula, nombre, apellidos, fechaIngreso);
        logica.registrarPaciente(paciente);
    }

    public void asignarMedicoCliente(String cedula) {
        int n = logica.getListaMedico().size();
        int random = (int) (Math.random() * (((n-1) - 0) + 1));
        int numColegiado = logica.getListaMedico().get(random).getNumColegiado();
        logica.asignarMedicoPaciente(numColegiado, cedula);
    }

    public Medico buscarMedico(int numColegiado) {
        ArrayList<Medico> lista = logica.getListaMedico();
        for (Medico m : lista) {
            if (numColegiado == m.getNumColegiado()) {
                return m;
            }
        }
        return null;
    }

    public Paciente buscarPaciente(String cedula) {
        ArrayList<Paciente> lista = logica.getListaPaciente();
        for (Paciente p: lista) {
            if (cedula.equalsIgnoreCase(p.getCedula())) {
                return p;
            }
        }
        return null;
    }

    public String[] listarMedico() {
        ArrayList<Medico> lista = logica.getListaMedico();
        String[] data = new String[lista.size()];
        for (Medico m : lista) {
            data[lista.indexOf(m)] = m.toString();
        }
        return data;
    }

    public String[] listarPaciente() {
        ArrayList<Paciente> lista = logica.getListaPaciente();
        String[] data = new String[lista.size()];
        for (Paciente p : lista) {
            data[lista.indexOf(p)] = p.toString();
        }
        return data;
    }
}

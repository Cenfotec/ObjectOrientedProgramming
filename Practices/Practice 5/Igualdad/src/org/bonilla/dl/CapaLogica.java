package org.bonilla.dl;

import org.bonilla.bl.Medico;
import org.bonilla.bl.Paciente;

import java.util.ArrayList;

public class CapaLogica {
    private ArrayList<Medico> listaMedico;
    private ArrayList<Paciente> listaPaciente;

    public CapaLogica() {
        listaMedico = new ArrayList<>();
        listaPaciente = new ArrayList<>();
    }

    public void registrarMedico(Medico medico) {
        listaMedico.add(medico);
    }

    public void registrarPaciente(Paciente paciente) {
        listaPaciente.add(paciente);
    }

    public ArrayList<Medico> getListaMedico() {
        ArrayList<Medico> lista = new ArrayList<>(listaMedico);
        return lista;
    }

    public ArrayList<Paciente> getListaPaciente() {
        ArrayList<Paciente> lista = new ArrayList<>(listaPaciente);
        return lista;
    }

    public void asignarMedicoPaciente(int numColegiado, String cedula) {
        for (Medico m : getListaMedico()) {
            if (m.getNumColegiado() == numColegiado) {
                for (Paciente p : getListaPaciente()) {
                    if (p.getCedula().equalsIgnoreCase(cedula)) {
                        p.setMedico(m);
                    }
                }
            }
        }
    }
}

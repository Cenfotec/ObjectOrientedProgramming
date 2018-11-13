package org.bonilla.dl;

import org.bonilla.bl.Inquilino;
import org.bonilla.bl.Propiedad;

public class CapaLogica {
    private TextFileReader tfr;

    public CapaLogica() {
        tfr = new TextFileReader();
    }

    // Registrar inquilino
    public void registrarInquilino(Inquilino inquilino) {
        tfr.escribirInquilino(inquilino);
    }

    // Registrar propiedad
    public void registrarPropiedad(Propiedad propiedad) {
        tfr.escribirPropiedad(propiedad);
    }
}

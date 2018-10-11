package org.bonilla.bl;

public class PersonaJuridica extends Persona {
    private String representante;
    private String industria;

    public PersonaJuridica(String nombre, String cedula, int edad, String representante, String industria) {
        super(nombre, cedula, edad);
        this.representante = representante;
        this.industria = industria;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getIndustria() {
        return industria;
    }

    public void setIndustria(String industria) {
        this.industria = industria;
    }

    @Override
    public String toString() {
        return "\n+----------" +
                super.toString() +
                "\n| Representante: " + representante +
                "\n| Industria: " + industria;
    }
}

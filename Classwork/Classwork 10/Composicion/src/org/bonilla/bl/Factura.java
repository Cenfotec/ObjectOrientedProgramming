package org.bonilla.bl;

import java.util.ArrayList;

public class Factura {
    private String numero;
    private String cliente;
    private Fecha fecha;
    private ArrayList<Linea> lineaLista;

    public Factura(String numero, String cliente, int dia, int mes, int anio) {
        this.numero = numero;
        this.cliente = cliente;
        this.fecha = new Fecha(dia, mes, anio);
        this.lineaLista = new ArrayList<>();
    }

    public double calcularSubTotal() {
        double total = 0;
        for (int i = 0; i < lineaLista.size(); i++) {
            total += lineaLista.get(i).calcularCosto();
        }
        return total;
    }

    public double calcularTotal() {
        return calcularSubTotal() + calcularImpuesto();
    }

    public double calcularImpuesto() {
        return calcularSubTotal() * 13/100;
    }

    public void agregarLinea(int cantidad, String codigo, String descripcion, double precio) {
        lineaLista.add(new Linea(cantidad, codigo, descripcion, precio));
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        String lineas = "";
        for (int i = 0; i < lineaLista.size(); i++) {
            lineas += lineaLista.get(i).toString() + "\n";
        }
        return "==================================================\n" +
               "Walmart     No. " + numero + "\n" +
               "cliente: " + cliente + "\n" +
               "                                    " + fecha.getDia() + "/" + fecha.getMes() + "/" + fecha.getAnio() + "\n" +
               "--------------------------------------------------\n" +
               "cant codigo descrip         precio         costo\n" +
               lineas + "\n" +
               "--------------------------------------------------\n" +
               "                    subtotal:    " + calcularSubTotal() + "\n" +
               "                    impuesto:    " + calcularImpuesto() + "\n" +
               "                    total:       " + calcularTotal() + "\n" +
               "==================================================";
    }
}

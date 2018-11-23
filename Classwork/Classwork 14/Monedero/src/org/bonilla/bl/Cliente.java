package org.bonilla.bl;

import org.bonilla.dl.MultiCuenta;
import org.bonilla.dl.MultiCuentaAhorro;
import org.bonilla.dl.MultiCuentaCorriente;

import java.time.LocalDate;

public class Cliente {
    private String cedula;
    private String nombre;
    private String apellido;

    public Cliente(String cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void registrarCuentaCorriente(String cedulaCliente, int numCuenta, double saldo, String duenio, int cantCuentas, int operacionesExentas, double cuotaOperaciones) throws Exception {
        LocalDate fecha = LocalDate.now();
        Cuenta c = new MultiCuenta().crearCuenta(cedulaCliente, numCuenta, saldo, LocalDate.now(), duenio);
        CuentaCorriente cc = new MultiCuentaCorriente().crearCuentaCorriente(numCuenta, saldo, fecha, duenio, cantCuentas, operacionesExentas, cuotaOperaciones);
    }

    public void registrarCuentaAhorro(String cedulaCliente, int numCuenta, double saldo, String duenio, int cantCuentas, double cuotaMantenimiento) throws Exception {
        LocalDate fecha = LocalDate.now();
        Cuenta c = new MultiCuenta().crearCuenta(cedulaCliente, numCuenta, saldo, LocalDate.now(), duenio);
        CuentaAhorro ca = new MultiCuentaAhorro().crearCuentaAhorro(numCuenta, saldo, fecha, duenio, cantCuentas, cuotaMantenimiento);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}

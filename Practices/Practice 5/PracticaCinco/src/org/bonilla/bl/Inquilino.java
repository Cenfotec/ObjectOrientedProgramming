package org.bonilla.bl;

import java.util.Objects;

public class Inquilino {
    private String nombre;
    private String correoElectronico;
    private String direccion;
	private int telefono;
	private String identificacion;
	private String genero;

	public Inquilino(String nombre, String correoElectronico, String direccion, int telefono, String identificacion, String genero) {
		this.nombre = nombre;
		this.correoElectronico = correoElectronico;
		this.direccion = direccion;
		this.telefono = telefono;
		this.identificacion = identificacion;
		this.genero = genero;
	}


	// Getters
	public String getNombre() {
		return nombre;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public String getDireccion() {
		return direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public String getGenero() {
		return genero;
	}


	// Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inquilino inquilino = (Inquilino) o;
        return Objects.equals(identificacion, inquilino.identificacion);
    }

    // toString
	public String toString() {
		return nombre + "," + correoElectronico + "," +
				direccion + "," + telefono + "," +
				identificacion + "," + genero;
	}
}

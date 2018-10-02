package org.bonilla.bl;

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


	// toString
	public String toString() {
		return "\n+----------" +
				"\n| Nombre: " + nombre +
				"\n| Correo electrónico: " + correoElectronico +
				"\n| Dirección: " + direccion +
				"\n| Teléfono: " + telefono +
				"\n| Identificación: " + identificacion +
				"\n| Género: " + genero;
	}
}

package colegio;

public class alumno {

	public alumno(String name, String surname, int years) {
		// Initialization of attributes
		nombre = name;
		apellido = surname;
		edad = years;
	}

	// Atributos privados
	private String nombre;
	private String apellido;
	private int edad;
	
	// Métodos públicos
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}
}

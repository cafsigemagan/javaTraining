package colegio;

public class clase {

	public clase() {
		// Inicialización de atributos
		nombre = "Sin nombre";
		profesor = "Sin nombre";
		numAlumnos = 0;
		numMaxAlumnos = 30;
		alumnos = new alumno[numMaxAlumnos];
	}
	
	// Atributos Protegidos
	private String nombre;
	private int numAlumnos;
	private String profesor;
	private int numMaxAlumnos;
	private alumno[] alumnos;
	
	// Métodos Públicos
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getProfesor() {
		return profesor;
	}
	
	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	// Matricular un alumno
	public void matricular(alumno a) {
		if (numAlumnos < numMaxAlumnos) {
			alumnos[numAlumnos] = a;
			numAlumnos++;
		} else {
			System.out.println("No se pueden matricular más alumnos");
		}
	}
	
	// Desmatricular un alumno
	public void desmatricular(alumno a) {
		for (int i = 0; i < numAlumnos; i++) {
			if (alumnos[i] == a) {
				alumnos[i] = alumnos[numAlumnos - 1];
				numAlumnos--;
				break;
			}
		}
	}
	
	// Obtener el número de alumnos
	public int getNumAlumnos() {
		return numAlumnos;
	}
	
	// Buscar un alumno

	public alumno getAlumno(String nombre) {
		for (int i = 0; i < numAlumnos; i++) {
			if (alumnos[i].getNombre().equals(nombre)) {
				return alumnos[i];
			}
		}
		return null;
	}
	
	// Mostrar los alumnos
	public void mostrarAlumnos() {
		System.out.println("La clase: " + nombre + " tiene " + numAlumnos + " alumnos:");
		for (int i = 0; i < numAlumnos; i++) {
			System.out.println("Alumno: " + alumnos[i].getNombre() + " " + alumnos[i].getApellido() + " ");
		}
	}
}

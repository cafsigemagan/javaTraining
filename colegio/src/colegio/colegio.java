package colegio;

public class colegio {

	public static void main(String[] args) {
		
		// Generamos una clase
		clase c = new clase();
		c.setNombre("1º A");
		c.setProfesor("Luisa");
		
		// Comprobamos los alumnos de la clase
		System.out.println("La clase: " + c.getNombre() + " tiene " + c.getNumAlumnos() + " alumnos");
		
		// Genera 30 alumnos con un bucle 
		for (int i = 0; i < 32; i++) {
			alumno a = new alumno("Nombre" + i, "Apellido" + i, 10 + i);
			c.matricular(a);
		}
	
		// Mostar los alumnos de la clase
		c.mostrarAlumnos();
		

	}

}

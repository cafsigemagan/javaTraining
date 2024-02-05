package variables;

import java.io.IOException;

public class EjemploVariables {

	public static void main(String[] args) throws IOException {
						
		// Declaración, inicialización y asignación
		
		String msg = "Hola Mundo";  // Declaración e inicialización
		int x; // Declaración
		x = 7;  // Inicialización
		System.out.println(msg);

		if (x == 7) {
			msg = "Valor correcto de x"; // Asignación
			System.out.println(msg);
		}
		else {
			msg = "Valor incorrecto de x"; // Asignación
			System.out.println(msg);
		}
		msg = "Hasta luego"; // Asignación
		System.out.println(msg);

	}
	
}

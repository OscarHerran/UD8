package Ejercicio1;

public class PersonaApp {

	public static void main(String[] args) {
		inicioApp();
	}
	
	public static void inicioApp() {
		Persona persona1 = new Persona();
		
		Persona persona2 = new Persona("Elena", 24, "M");
		
		Persona persona3 = new Persona("Arthur", "2238485g", 27, "M", 78);

		sexVerified(persona3.sexIs(persona3));
	}

	public static void sexVerified(boolean sex) {
		if(sex) {
			System.out.println("El sexo es masculino");
		} else if(!sex){
			System.out.println("El sexo es femenino");
		} else {
			System.out.println("El sexo es indeterminado");
		}
	}
}
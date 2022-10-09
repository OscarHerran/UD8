package Ejercicio1;


public class Persona {
	private String  nombre;
	private String dni;
	private int edad = 0;
	private final static  String sexo = "H";
	private String sex = sexo;
	
	
	
	public Persona() { 
		this.nombre = "";
		this.edad = 0;
		
	}
	/*
	 * CONSTRUCTOR CON PARÁMETROS = NOMBRE, EDAD Y SEXO
	 * @param name = String name
	 * @param age = int age
	 * @param sex = String sex
	 * @param weight = 0
	 * */
	public Persona(String name, int age, String sex) {//
		this.nombre = name;
		this.edad = age;
		this.sex = sex;
		
	}
	

	/*
	 * CONSTRUCTOR CON PARÁMETROS = NOMBRE, DNI, EDAD, SEXO Y PESO
	 * @param name = String name
	 * @param dni = String dni
	 * @param age = int age
	 * @param sex = String sex
	 * @param weight = 0
	 * */
	public Persona(String name, String dni, int age, String sex, int weight) {
		this.nombre = name;
		this.dni = dni;
		this.edad = age;
		this.sex = sex;
		
	}
	
	public static boolean sexIs(Persona person) {
		if(person.sex.equals("H")) {
			return true;
		}
		
		return false;
	}
	
}

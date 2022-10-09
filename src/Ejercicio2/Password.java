package Ejercicio2;

public class Password {
	protected int longitud;
	protected String passwordRandom;
	//CONSTRUCTOR POR DEFECTO
	 
	 
	public Password() {
		this.longitud = 8;
		this.passwordRandom = "";
	}
	
	/*
	 * CONSTRUCTOR CON 1 PARÁMETRO
	 * @param longitud = longitud que recibe por teclado
	 * @param passwordRandom = contraseña por defecto
	 * */
	public Password(int longitude) {
		this.longitud = longitude;
		this.passwordRandom = "";
	}
	
// MÉTODOS GETTERS Y SETTERS
	
	public void setLongitud(int longitude) {
		this.longitud = longitude;
	}
	
	public int getLongitud() {
		return this.longitud;
	}
	
	public void setPassword(String password) {
		this.passwordRandom = password;
	}
	
	public String getPasswordRandom() {
		return this.passwordRandom;
	}
	
	//MÉTODO QUE VERIFICA SI LA LONGITUD ES MENOR O NO A 8
	public boolean passwordGenerate() {
		if(this.longitud < 8) {
			return false;
		}
		return true;
	}
	
	//MÉTODO QUE GENERA LA CONTRASEÑA
	public String createPassword() {
		if(passwordGenerate()) {
			this.passwordRandom = "123456789";
		} else {
			this.passwordRandom = "La contraseña debe de ser de 8 caracteres mínimo";
		}
		return passwordRandom;
	}
}

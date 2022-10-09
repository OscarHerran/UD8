package Ejecicio3;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Electrodomestico {
	protected int precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected int peso;
	
	final static String COLOR = "blanco";
	final static char CONSUMO = 'F';
	final static int PRECIO = 100;
	final static int PESO = 5;
	
	//CONSTRUCTOR POR DEFECTO
	
	public Electrodomestico() {
		this.color = COLOR;
		this.consumoEnergetico = CONSUMO;
		this.precioBase = PRECIO;
		this.peso = PESO;
		//this("blanco", 'f', 100, 5);
	}
	
	//CONSTRUCTOR CON PARAMETROS PRECIO Y PESO

	public Electrodomestico(int precio, int peso) {
		this.precioBase = precio;
		this.peso = peso;
	}
	
	//CONSTRUCTOR QUE RECIBE TODOS LOS PAÁMETROS
	 
	public Electrodomestico(String color, char consumo, int precio, int peso) {
		this.color = color;
		this.consumoEnergetico = consumo;
		this.precioBase = precio;
		this.peso = peso;
	}
	
	// MÉTODOS DE ACCESO
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setConsumo(char consumo) {
		this.consumoEnergetico = consumo;
	}
	
	public void setPrecio(int precio) {
		this.precioBase = precio;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public char getConsumo() {
		return this.consumoEnergetico;
	}
	
	public int getPrecio() {
		return this.precioBase;
	}
	
	public int setPeso() {
		return this.peso;
	}
	
	//MÉTODO PARA VERIFICAR EL COLOR
	public void verificaColor(String colour) {//blanco, negro, rojo, azul y gris
		switch("colour") {
			case "blanco":
				this.color = colour;
				break;
			case "negro":
				this.color = colour;
				break;
			case "rojo":
				this.color = colour;
				break;
			case "azul":
				this.color = colour;
				break;
			case "gris":
				this.color = colour;
				break;
		}
		
	}
	//MÉTODO PARA VERIFICAR LA LETRA CONSUMO
	public void verificaConsumo(char consumo) {
		String consume = "ABCDEF";
		for(int i = 0; i < consume.length(); i++) {
			if(consume.charAt(i) == consumo) {
				this.consumoEnergetico = consumo;
			}
		}
	}
	
	//MÉTODO PARA IMPRIMIR TODOS LOS ATRIBUTOS
	public String toString() {
		return "La descripcion del electrodoméstico  es : \nColor = " + this.color +
				"\nConsumo = " + this.consumoEnergetico + "\nPrecio = " + this.precioBase +
				"\nPeso = " + this.peso;
	
	}
}
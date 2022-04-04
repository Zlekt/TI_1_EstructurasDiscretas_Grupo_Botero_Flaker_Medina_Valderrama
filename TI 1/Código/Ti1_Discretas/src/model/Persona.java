package model;

public class Persona {

	private String nombre;
	private int pisoACT;
	private int oficina;

	// Construtor
	public Persona(String nombre, int pisoACT, int oficina) {
		this.nombre = nombre;
		this.pisoACT = pisoACT;
		this.oficina = oficina;
	}

	// getters & setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPisoACT() {
		return pisoACT;
	}

	public void setPisoACT(int pisoACT) {
		this.pisoACT = pisoACT;
	}

	public int getOficina() {
		return oficina;
	}

	public void setOficina(int oficina) {
		this.oficina = oficina;
	}

	public String toString() {
		return nombre + " se mueve a la oficina :" + oficina;
	}

	public String toString2() {
		return nombre + " se queda sin oficina";
	}

}

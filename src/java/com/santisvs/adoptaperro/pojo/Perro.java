package com.santisvs.adoptaperro.pojo;

public class Perro extends Animal{
	
	public enum Tama�o{GRANDE, MEDIANO, PEQUE�O}
	
	private String nombre;
	private String raza;
	private String color;
	private Tama�o tama�o;
	private boolean chip;
	private String numchip;
	private boolean adoptado;
	private Due�o due�o;
	
	public Perro() {
		super();

	}
	
	
	
}

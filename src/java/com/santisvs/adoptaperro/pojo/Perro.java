package com.santisvs.adoptaperro.pojo;

public class Perro extends Animal{
	
	public enum Tamaño{GRANDE, MEDIANO, PEQUEÑO}
	
	private String nombre;
	private String raza;
	private String color;
	private Tamaño tamaño;
	private boolean chip;
	private String numchip;
	private boolean adoptado;
	private Dueño dueño;
	
	public Perro() {
		super();

	}
	
	
	
}

package com.santisvs.adoptaperro.pojo;

/**
 * Clase Animal que utiliaremos como padre de clases más específicas:
 * - Perro
 * - Gato
 * - Ave
 * - Reptil
 * 
 * @edad Atributo que define la edad del animal (EDAD_MIN < @edad < EDAD_MAX)
 * @domestico Atributo booleano que indica si el animal es domestico 
 * 
 * @author santisvs 
 *
 */
public class Animal {
	
	/*Constantes
	 **************/
	public static final int EDAD_MAX = 100;
	public static final int EDAD_MIN = 0;
	
	/*Atributos
	 **************/
	private int edad;
	private boolean domestico;
	
	/*Constructores
	 **************/
	public Animal() {
		super();
		setEdad(EDAD_MIN);
		setDomestico(false);
	}


	public Animal(int edad, boolean domestico) throws AnimalException{
		this();
		if (edad < 0){
			throw new AnimalException( AnimalException.MSG_ERR_EDAD_MIN );
		}
		else if(edad > 100){
			throw new AnimalException( AnimalException.MSG_ERR_EDAD_MAX );
		}
		setEdad(edad);
		setDomestico(domestico);		
	}

	/*Get´s y Set´s
	 **************/
	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public boolean isDomestico() {
		return domestico;
	}


	public void setDomestico(boolean domestico) {
		this.domestico = domestico;
	}
	
	/*Métodos
	 **************/
	@Override
	public String toString() {
		return "Animal [edad=" + edad + ", domestico=" + domestico + "]";
	}
	
}

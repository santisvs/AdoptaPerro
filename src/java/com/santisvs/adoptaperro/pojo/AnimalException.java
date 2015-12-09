package com.santisvs.adoptaperro.pojo;

public class AnimalException extends Exception{
	
	private static final long serialVersionUID = 6460039326976515643L;
	
	/*Mensajes de ERROR
	 *******************/
	public static final String MSG_ERR_EDAD_MIN = "Un animal no puede tener una edad menor a 0 (negativa)";
	public static final String MSG_ERR_EDAD_MAX = "Un animal no puede tener más de 100 años";
	
	/*Constructores
	 **************/
	public AnimalException(String msgErrInsuficiente) {
		super(msgErrInsuficiente);
	}

}

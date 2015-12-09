package com.santisvs.adoptaperro.pojo;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test para comprobar que el objeto animal se crea correctamente
 * @author santi
 *
 */
public class AnimalTest {

	@Test
	public void testAnimalSinParam() {
		Animal animal = new Animal();
		assertEquals(Animal.EDAD_MIN, animal.getEdad());
		assertEquals(false, animal.isDomestico());
	}
	
	@Test
	public void testAnimalConParam() {
		int edad_test = 10;
		boolean domestico_test = true;
		
		try{
			Animal animal = new Animal(edad_test, domestico_test);
			assertEquals(edad_test, animal.getEdad());
			assertEquals(domestico_test, animal.isDomestico());
		}catch (AnimalException e){
			fail("No deberia lanzar excepcion");
		}	
	}
	
	@Test
	public void testExceptionEdadMax() {
		int edad_test = 101;
		boolean domestico_test = true;
		
		try{
			Animal animal = new Animal(edad_test, domestico_test);
			fail("Deberia lanzar excepcion "+AnimalException.MSG_ERR_EDAD_MAX);
		}catch (AnimalException e){
			assertEquals( AnimalException.MSG_ERR_EDAD_MAX, e.getMessage() );
		}	
	}
	
	@Test
	public void testExceptionEdadMin() {
		int edad_test = -2;
		boolean domestico_test = true;
		
		try{
			Animal animal = new Animal(edad_test, domestico_test);
			fail("Deberia lanzar excepcion "+AnimalException.MSG_ERR_EDAD_MIN);
		}catch (AnimalException e){
			assertEquals( AnimalException.MSG_ERR_EDAD_MIN, e.getMessage() );
		}	
	}
}

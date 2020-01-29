package sesion6;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCalculadoraTest2 {

	Calculadora calc;

	
	@Before
	public void before() {
		System.out.println("Before");
		calc = new Calculadora();
	}
	
	 @Test
	 public void testSumar2() {
		 System.out.println("test prueba unitaria Sumar");
		 int value1 = 10;
		 int value2 = 20;
		 int resultado = calc.Sumar(value1, value2);
		 int expected_value = 30;
		
		 assertEquals(expected_value, resultado);
	 }

}

package s5_JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculadoraFuncionalidadesCriticas {

	@Test
	public void testSumar1() {
		Calculadora calc = new Calculadora();
		System.out.println("testSumar1");
		int value1 = 10;
		int value2 = 20;
		int expected_value = 30;
		int result_sumar = calc.Sumar(value1, value2);
		
		assertEquals(expected_value, result_sumar);	
	}

}

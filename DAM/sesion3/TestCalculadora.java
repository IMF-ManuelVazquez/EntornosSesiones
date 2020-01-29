package sesion3;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculadora {

	@Test
	public void testSumar() {
		Calculadora calc = new Calculadora();
		int operador = 10;
		int operador2 = 15;
		int expected_value = 25;
		assertEquals(expected_value, calc.Sumar(operador, operador2));	
	}
	
	@Test
	public void testRestar() {
		Calculadora calc = new Calculadora();
		int operador = 10;
		int operador2 = 15;
		int expected_value = -5;
		assertEquals(expected_value, calc.Restar(operador, operador2));
	}
	
}



//public static void main(String[] args) {
//	Calculadora calc = new Calculadora();
//	int operador = 10;
//	int operador2 = 15;
//	
//	int resutado_esperado = 25;
//	
//	int suma = Sumar(operador, operador2);
//	System.out.println(suma);
//	
//	if (suma==resutado_esperado) {
//		System.out.println("Prueba correcta");
//	}else {
//		System.out.println("Prueba incorrecta");
//	}
//}
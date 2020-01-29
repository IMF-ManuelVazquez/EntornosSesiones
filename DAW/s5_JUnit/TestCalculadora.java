package s5_JUnit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCalculadora {
	static Calculadora calc;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClass");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("afterClass");
	}
	
	@Before
	public void before() {
		calc = new Calculadora();
		System.out.println("before");
	}
	
	@After
	public void after() {
		System.out.println("after");
	}

	@Test
	public void testSumar1() {
		System.out.println("testSumar1");
		int value1 = 10;
		int value2 = 20;
		int expected_value = 30;
		int result_sumar = calc.Sumar(value1, value2);
		
		assertEquals(expected_value, result_sumar);	
	}
	
	@Test
	public void testRestar1() {
		System.out.println("testRestar1");
		int value1 = 10;
		int value2 = 20;
		int expected_value = -10;
		int result_restar = calc.Restar(value1, value2);
		
		assertEquals(expected_value, result_restar);
	}
	
	@Test
	public void testRestar2() {
		System.out.println("testRestar2");
		int value1 = 20;
		int value2 = 10;
		int expected_value = 10;
		int result_restar = calc.Restar(value1, value2);
		
		assertEquals(expected_value, result_restar);
	}
	
	@Test
	public void testMulti1() {
		System.out.println("testMulti1");
		int value1 = 10;
		int value2 = 15;
		int expected_value = 150;
		int result_multi = calc.Multiplicar(value1, value2);
		
		assertEquals(expected_value, result_multi);
	}
	
	@Test
	public void testDiv1() {
		System.out.println("testDiv1");
		int value1 = 5;
		int value2 = 2;
		double expected_value = 2.5;
		double result_div = calc.Dividir(value1, value2);
		double delta = 0.0001;
		
		assertEquals(expected_value, result_div, delta);
	}
	
	@Test (timeout = 10)  // 10 ms como maximo para ejecutar una simple division
	public void testDiv1Vago() {
		System.out.println("testDiv1");
		int value1 = 5;
		int value2 = 2;
		calc.Dividir(value1, value2);
	}
	
	@Test (expected = ArithmeticException.class)
	public void testDivZero() {
		System.out.println("testDiv1");
		int value1 = 5;
		int value2 = 0;
		double result_div = calc.Dividir(value1, value2);
	}
	
}

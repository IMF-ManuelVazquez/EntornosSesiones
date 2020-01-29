package junit_ref;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTest {
	
	Calculadora calc;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before class");
	}
	
	@Before
	public void before() {
		System.out.println("Before");
		calc = new Calculadora();
	}
	
	@After
	public void after() {
		System.out.println("After");
		calc.clear();
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	

	@Test
	public void TestSuma() {
		System.out.println("Test suma");

		int actual = calc.suma(5,5);
		int expected = 5 + 5;

		assertEquals(expected, actual);
	}

	@Test
	public void TestResta() {
		System.out.println("Test resta");

		int actual = calc.resta(10,5);
		int expected = 10 - 5;

		assertEquals(expected, actual);
	}
	
	/*
	 * ENTERO: Assert long.
	 * DECIMAL: No asonsejable assertEqual(double,double) sino assertEqual(double,double,delta)
	 * assertTrue - assertNotEquals (equals usa Object) - assertNull - assertNotNull
	 */
	
	/* TEST EXCECPCIONES */
	
	@Test
	public void TestDivCero() {
		System.out.println("Test Division");
		double div = calc.div(10, 5);
		double expected = 2;
		assertEquals(expected, div,0.01);
	}
	
	// Exception
	@Test(expected = ArithmeticException.class)
	public void TestDiv() {
		System.out.println("Test Division");
		double div = calc.div(10, 0);
		double expected = 2;
		//assertEquals(expected, div);
	}
	
	/*TEST TEMPORIZACIÓN */
	@Test(timeout = 11000)
	public void TestSleep() {
		System.out.println("Test Sleep");
		calc.sleep();
		System.out.println("End Test Sleep");
	}
	
	

}

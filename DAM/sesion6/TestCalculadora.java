package sesion6;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCalculadora {

	Calculadora calc;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("AfterClass");
	}
	
	@Before
	public void before() {
		System.out.println("Before");
		calc = new Calculadora();
	}
	
	@After
	public void after() {
		System.out.println("After");
	}
	
	 @Test
	 public void testSumar() {
		 System.out.println("test prueba unitaria Sumar");
		 int value1 = 10;
		 int value2 = 20;
		 int resultado = calc.Sumar(value1, value2);
		 int expected_value = 30;
		
		 assertEquals(expected_value, resultado);
	 }
	 
	 @Test
	 public void testRestar() {
		 System.out.println("test prueba unitaria Restar");
		 int value1 = 20;
		 int value2 = 10;
		 int expected_value = 10;
		 int resultado = calc.Restar(value1, value2);
		 
		 assertEquals(expected_value, resultado);
	 }
	 
	 @Test
	 public void testMulti() {
		 System.out.println("test prueba unitaria Multi");
		 double value1= 10;
		 double value2= 20;
		 double expected_value  = 200;
		// int resultado = calc.Multi(value1, value2);
		 
		 assertEquals(expected_value, calc.Multi(value1, value2), 0.0001);
	 }
	 
	 @Test
	 public void testDiv() {
		 System.out.println("test prueba unitaria Div");
		 int value1 = 4;
		 int value2 = 2;
		 double expected_value  = 2;
		 double delta = 0.00001;
		 
		 assertEquals(expected_value, calc.Div(value1, value2),delta);	 
	 }
	 
	 @Test(expected = ArithmeticException.class)
	 public void testExcepcionDivZero() {
		 System.out.println("test prueba unitaria Div");
		 int value1 = 4;
		 int value2 = 0;
		 double expected_value  = 2;
		 double delta = 0.00001;
		 
		 assertEquals(expected_value, calc.Div(value1, value2),delta);	 
	 }
	 
	 @Test(timeout = 10000)  // Validamos que la prueba unitaria termina antes de lo indicado en el timeout
	 public void testTimeout() {
		 calc.sleep1s();
		 System.out.println("test prueba unitaria Restar");
		 int value1 = 20;
		 int value2 = 10;
		 int expected_value = 10;
		 int resultado = calc.Restar(value1, value2);
		 
		 assertEquals(expected_value, resultado);
		 calc.sleep1s();
	 }
	 
}

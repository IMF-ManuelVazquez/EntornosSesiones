package junit_ref;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)  // Constructor que se encarga de realizar todas las acciones que de nuestras pruebas unitarias con multiples parametros.

/**
 * Pruebas parametrizadas unitarias son una forma comoda de realizar pruebas unitarias donde comprabar que para varios valores tenemos los resultados esperados.
 * Probar varios grupos de datos que necesito probar.
 * @author Manuel Vazquez
 *
 */

public class CalculadoraTestParametrizado {

	Calculadora calc;
	private int a,b,exp;
	
	public CalculadoraTestParametrizado(int a, int b, int exp) {
		this.a=a;
		this.b=b;
		this.exp=exp;
	}
	
	// Cuando ejecutemos este testo con el runner (parameterized.class) va a buscar el metodo que tenga la anotación @parameters y que sea compatible: Static + Return Iterable<Object[]>
	// Cada uno de los array Object[] deberá tener el mismo número de parametros que tenga el constructor: Serán los parametros con que Junit deba instanciar cada vez la clase de prueba.
	@Parameters
//	public static Iterable<Object[]> getData(){
//		
//		List<Object[]> obj = new ArrayList<Object[]>();
//		obj.add(new Object[] {3,1,4});
//		obj.add(new Object[] {2,3,5});
//		obj.add(new Object[] {2,4,6});
//		obj.add(new Object[] {4,4,8});
//		obj.add(new Object[] {4,5,9});
//		return obj;
//	}

	public static Iterable<Object[]> getData(){
		return Arrays.asList(new Object[][] {
			{3,1,4}, {2,3,5},{3,3,6}
		});
	}

	
	@Before
	public void before() {
		calc = new Calculadora();
	}
	
	@Test
	public void testSumaParams() {
		int result = calc.suma(a,b);
		assertEquals(exp, result);
		
	}
	

}

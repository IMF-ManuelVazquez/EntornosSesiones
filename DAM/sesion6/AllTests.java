package sesion6;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestCalculadora.class, TestCalculadoraTest2.class })
public class AllTests {

}


//ETIQUETAS CLAVE (PARA LA CHULETA):
//
//@Test
//@Before  		@After
//@BeforeClass	@AfterClass
//@Test(expected = ArithmeticException.class)  		## Para pruebas unitaria de que se genera una excepción.
//@Test(timeout = 1000) 							## Para pruebas unitaria de cuando tarda en ejecutarse todo.

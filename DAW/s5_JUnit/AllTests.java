package s5_JUnit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestCalculadora.class, TestCalculadoraFuncionalidadesCriticas.class })
public class AllTests {

}

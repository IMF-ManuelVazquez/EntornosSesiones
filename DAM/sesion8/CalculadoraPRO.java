package sesion8;

/**
 * Clase CalculadoraPRO
 * @author Profe IMF
 * @version 1.0
 * @since 0.1
 *
 */
public class CalculadoraPRO {
	
	/**
	 * CalculadoraPRO constructor
	 */
	public CalculadoraPRO() {
		super();
	}
	
	/**
	 * Metodo sumar se encarga de sumar porque sí.
	 * @param num1 argumento del primer operador para realizar la suma
	 * @param num2 argumento del segundo operador para realizar la suma
	 * @return retorna el valor de la suma.
	 */
	public int Sumar(int num1, int num2) {
		int suma = num1 + num2;
		return suma;
	}
	
	/**
	 * Metodo restar se encagar de restar.
	 * @param num1 argumento del primer operador para realizar la resta
	 * @param num2 argumento del primer operador para realizar la resta
	 * @return retorna el valor de la resta.
	 */
	public int Restar(int num1, int num2) {
		int resta = num1 - num2;
		return resta;
	}
	
	/**
	 * Metodo multi se encagar de multiplicar.
	 * @param num1 argumento del primer operador para realizar la multi
	 * @param num2 argumento del primer operador para realizar la multi
	 * @return retorna el valor de la multi.
	 */
	public double Multi(double num1, double num2) {
		double multi = num1 * num2;
		return multi;
	}

	/**
	 * Metodo Div se encagar de dividir.
	 * @param num1 argumento del primer operador para realizar la division
	 * @param num2 argumento del primer operador para realizar la divisoin
	 * @exception ArithmeticException.class cuando en el operador 2 es 0 y no se puede dividir.
	 * @return retorna el valor de la division o 0 en caso de que el operador 2 sea 0.
	 */
	public double Div (int num1, int num2) {
		double div = 0;
		if (num2 == 0) {
			throw new ArithmeticException("No se puede dividir entre cero");
		}else {
			div = (double)num1/(double)num2;
		}
		return div;
	}
	
	/**
	 * Metodo sleep1s. Pues se encarga de dormir el programa 1 segundo
	 * @deprecated Modo deprecated.
	 */
	public void sleep1s() {
		System.out.println("Incio del metodo sleep");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Fin del metodo sleep");
	}
	
}

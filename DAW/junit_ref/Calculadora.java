package junit_ref;

public class Calculadora {
	
	public int suma(int num1, int num2) {
		
		int suma = num1 + num2;
		return suma;

	}
	
	public int resta(int num1, int num2) {
		
		int resta = num1 - num2;
		return resta;

	}
	
	public void clear() {
		System.out.println("Clear");
	}
	
	public double div(double num1, double num2) {
		
		if (num2 ==0) {
			throw new ArithmeticException("No se puede dividir entre cero");
		}
		double div = num1 / num2;
		return div;
		
	}
	
	public void sleep() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}

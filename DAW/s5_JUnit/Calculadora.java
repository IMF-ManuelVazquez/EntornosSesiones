package s5_JUnit;

public class Calculadora {
	
//	public static void main(String[] args) {
//		
//		Calculadora calc = new Calculadora();
//		int value1 = 10;
//		int value2 = 20;
//		int expected_value = 30;
//		int resultado_sumar = calc.Sumar(value1, value2);
//		
//		if (expected_value==resultado_sumar) {
//			System.out.println("Metodo sumar ok");
//		}else {
//			System.out.println("Metodo sumar con fallos");
//		}
//		
//	}

	public int Sumar(int num1 , int num2) {
		
		int sumar = num1 + num2;
		if (sumar >= 0) {
			System.out.println("sumar positiva");
		}else {
			System.out.println("Sumar es negativo");
		}
		return sumar;
		
	}
	
	public int Restar(int num1 , int num2) {
		
		int restar = num1 - num2;
		
//		if (restar > 0) {
//			System.out.println("restar positiva");
//		}else {
//			System.out.println("restar es negativo");
//		}
		return restar;
		
	}
	
	public int Multiplicar (int num1, int num2) {
		int multi = num1 *  num2;
		return multi;
	}
	
	public double Dividir (int num1, int num2) {
		
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		double div=0;
		if (num2 == 0) {
			throw new ArithmeticException("No se puede dividir entre cero"); 
		}else {
			div = (double)num1/(double)num2;
		}
		
		return div;
	} 
	
}

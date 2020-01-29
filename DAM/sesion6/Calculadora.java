package sesion6;

public class Calculadora {

//	public static void main(String[] args) {
//		
//		Calculadora calc  = new Calculadora();
//		
//		int resultado_sumar = calc.Sumar(5, 6);
//		int valor_esperado = 11;
//		if (valor_esperado == resultado_sumar) {
//			System.out.println("ok pasa la prueba sumar");
//		}else {
//			System.out.println("no pasa la prueba sumar");
//		}
//		
//		int resultado_resta = calc.Restar(5, 6);
//		valor_esperado = -1;
//		if (valor_esperado == resultado_resta) {
//			System.out.println("ok pasa la prueba restar");
//		}else {
//			System.out.println("no pasa la prueba restar");
//		}
//		//System.out.println(calc.Sumar(5, 6));
//		//System.out.println(calc.Restar(5, 6));
//		
//	}
	
	public Calculadora() {
		super();
	}
	
	public int Sumar(int num1, int num2) {
		int suma = num1 + num2;
		return suma;
	}
	
	public int Restar(int num1, int num2) {
		int resta = num1 - num2;
		return resta;
	}
	
	public double Multi(double num1, double num2) {
		double multi = num1 * num2;
		return multi;
	}
	
	public double Div (int num1, int num2) {
		double div = 0;
		if (num2 == 0) {
			throw new ArithmeticException("No se puede dividir entre cero");
		}else {
			div = (double)num1/(double)num2;
		}
		return div;
	}
	
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

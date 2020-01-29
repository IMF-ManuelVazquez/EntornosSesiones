package sesion3;

public class ProbarDebugger {

	public static void main(String[] args) {
		
		
		int nota = 10;
		String nota_alumno = null;
		
		switch (nota) {
		case 1:
		case 2:
		case 3:
		case 4:
			nota_alumno= "suspendido";
			break;
		case 5:
			nota_alumno= "suficiente";
			break;
		case 6:
			nota_alumno= "bien";
			break;
		case 7:
		case 8:
			nota_alumno="notable";
			break;
		case 9:
		case 10:
			nota_alumno="sobresaliente";
			break;
		default:
			break;
		}
		System.out.println("nota alumno: "+nota_alumno);
		
		funcionPrueba(nota);
		
				
	}
	
	
	public static void funcionPrueba(int nota) {
		if (nota>5) {
			System.out.println("aprobado");
		} else {
			System.out.println("suspenso");
		}
	}

}

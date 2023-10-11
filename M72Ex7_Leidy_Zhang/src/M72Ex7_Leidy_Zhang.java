import java.util.Scanner;

public class M72Ex7_Leidy_Zhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//El usuario/a introduce un año en por teclado
		//y el programa llama a un método que indique si el año es bisiesto o no.
		
		int year = 0;
		String respuesta = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un año");
		year = sc.nextInt();
		
		respuesta = bisiesto(year);
		System.out.println("El año introducido " + respuesta);
		
		sc.close();

	}
	
	public static String bisiesto (int x) {
		if (x % 400 == 0) {
			return "bisiesto";
		}else if(x % 4 == 0 && x % 100 != 0) {
			return "bisiesto";
		}else {
			return "no es bisiesto";
		}
		
	}

}

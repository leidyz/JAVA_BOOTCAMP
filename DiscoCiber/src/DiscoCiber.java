import java.util.Scanner;

public class DiscoCiber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ontar un afista joven
		//jueves van a porder a entrar mayor o igual de 16
		//1. tengo todos los ingredientes? no, me falttan los dias
		//2. donde poner el nuevo algoritmo? && 
		//3. como desarollar este algoritmo
		//4.puedes entrar si tienes invitacion
		//
		
		String dia= "";
		int edad = 0;
		boolean invitacion = false; //siempre se tiene que declarar false
		
		Scanner entrada = new Scanner(System.in); //aqui lo estas abriendo
		
		System.out.println("Indica una edad");
		edad = entrada.nextInt(); 
		System.out.println("Que dia es hoy?");
		entrada.nextLine(); //con esto limpiamos el buffer
		dia = entrada.nextLine();
		System.out.println("Tienes invitacion?");
		entrada.nextLine();
		invitacion = entrada.nextBoolean();
		
		
		if (edad >= 18 || invitacion || dia.equalsIgnoreCase("jueves") && (edad>=16)) { //primero considera la primera condicion y luego la segunda. por eso hay que poner el de 18 primero.
			System.out.println("Puedes pasar");
			
		}else if (edad == 0) {
			System.out.println("Tienes que identificarte");

		}else {
			System.out.println("No puedes pasar");
		}
		entrada.close(); //con esto cierras la funcion de scanner

	}

}

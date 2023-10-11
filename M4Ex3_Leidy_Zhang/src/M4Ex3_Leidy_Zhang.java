import java.util.Scanner;

public class M4Ex3_Leidy_Zhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Al alumno/a se le asigna una beca si es mayor de edad y si tiene un título universitario. 
		 * O también se le asigna una beca si el alumno/a está en paro.
		El programa pide los tres datos por pantalla y al finalizar muestra si el alumno/a tiene o no la beca.
		 */

		int edad = 0;
		boolean universitario = false;
		boolean paro = false;
		String mensaje = "";
		Scanner entrada =new Scanner(System.in);
		
		System.out.println("Hola, te haremos una serie de preguntas para ver si cumples con los requisitos de la beca\n"
				+ "1. Indica tu edad" );
		edad = entrada.nextInt();
		
		System.out.println("2. Tienes titulo universitario? Por favor responder con True o False ");
		universitario = entrada.nextBoolean();//que hacer si el usuario escribe "si"? como hago un condicional reconocerlo como true

		System.out.println("3. Estas en el paro? Por favor responder con True o False" );
		paro = entrada.nextBoolean();
		
		
		if(edad>=18 && universitario || paro ) {  //si es con las regulaciones de paro le incluiria paro && edad>=16
			mensaje = "Cumples con los requisitos de la beca, enhorabuena!";
			
		}else {
			mensaje = "Lo siento, no cumples con los requisitos para la beca.";
		}
			System.out.println(mensaje);
			
		entrada.close();
		
	}

}

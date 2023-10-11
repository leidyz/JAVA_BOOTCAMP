import java.util.Scanner;

public class M73Ex1_Leidy_Zhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Realizar un programa que tenga un menú donde se le mostrarán 4 opciones al usuario por pantalla:

			1.- Cuadrado

			2.- Triángulo

			3.- Rectángulo

			4.- Círculo

			0.- Salir del programa

			Según la opción escogida deberá introducir unos u otros datos 
			para que el programa muestre por pantalla el área (el valor) del polígono escogido.
		*/
		
		
		int opcion = 0;
		int longitud = 0;
		int ancho = 0;
		int base = 0;
		int altura =0;
		int lado = 0;
		int radio = 0;
		double area = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Escoge una opcion entre las siguientes:\n"
					+ "1.- Cuadrado\n"
					+ "2.- Triángulo\n"
					+ "3.- Rectángulo\n"
					+ "4.- Círculo\n"
					+ "0.- Salir del programa");
			
			opcion = sc.nextInt();
			
			switch(opcion) {
			case 1:
				
				System.out.println("Para saber el area de un cuadrado. Necesito saber el siguiente valor: \n"
						+ "lado:");
				lado = sc.nextInt();
				
				
				area = lado * lado ; 
				
				System.out.println("El area del cuadrado es " + area);
				break;
				
			case 2:
				System.out.println("Para saber el area de un triangulo. Necesito saber los siguientes valores: \n"
						+ "base:");
				base = sc.nextInt();
				
				System.out.println("altura:");
				altura = sc.nextInt();
				
				area = (base * altura)/2; 
				
				System.out.println("El area del triangulo es " + area);
			
				break;
			case 3:
				System.out.println("Para saber el area de un rectangulo. Necesito saber los siguientes valores: \n"
						+ "longitud:");
				longitud = sc.nextInt();
				
				System.out.println("ancho:");
				ancho = sc.nextInt();
				
				area = longitud * ancho; 
				
				System.out.println("El area del rectangulo es " + area);
			
				break;
			case 4:
				System.out.println("Para saber el area de un circulo. Necesito saber el siguiente valor: \n"
						+ "radio:");
				radio = sc.nextInt();
				
				area = (Math.PI * Math.pow(radio, 2));
				
				System.out.println(" El area del circulo es " + area);
				break;
				
			default:
				System.out.println("Error. Introduzca un numero entre 0-4");
					
		}
		
		}while(opcion != 0);
		
		
		
		sc.close();
	}

}

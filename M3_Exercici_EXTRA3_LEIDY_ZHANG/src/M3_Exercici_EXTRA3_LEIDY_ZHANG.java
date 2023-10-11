import java.util.Scanner;

public class M3_Exercici_EXTRA3_LEIDY_ZHANG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escribe un programa Java que calcule los litros de pintura necesarios para pintar una pared rectangular.

Un litro de pintura cubre aproximadamente, 12m² en una sola mano.

Crea una constante llamada cobertura Litro para guardar el dato de cobertura de la pintura (12m²)
Tendrás que pedir al usuario:

- El alto y ancho de la pared (multiplicante sabrás el área de la misma)
- El número de manos a aplicar. (12m2/mano)
Muestra en pantalla los litros de pintura a utilizar.
		 */

		Scanner entrada = new Scanner(System.in);
		
		int litro = 0; 
		final int COBERTURA = 12;
		int alto = 0; 
		int ancho = 0; 
		int area = 0; 
		int manos = 0;
		
		System.out.println("Para calcular los litros para pintar tu pared, introduce el alto");
		alto = entrada.nextInt(); 
		
		System.out.println("Para calcular los litros para pintar tu pared, introduce el ancho");
		ancho = entrada.nextInt(); 
		
		area = ancho*alto;
		
		System.out.println("Tu area es el ancho " + ancho +  "por el alto " +  alto + "que es igual a" + area);
		
		litro = area/COBERTURA;
		
		System.out.println("Dime el numero de manos que quieres?"); //manos significa capas
		
		manos = entrada.nextInt(); 
		area *= manos; //el nuevo area es la cantidad de capas por el area de la pared
		litro = area / COBERTURA; //el total del nuevo area dividido entre 12
		
		System.out.println("La cantidad de litros a utilizar son " + litro);
		
		entrada.close();
		
	}

}

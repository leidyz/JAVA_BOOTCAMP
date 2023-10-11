import java.util.Scanner;

public class M3Ex3_LEIDY_ZHANG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*El programa pide al usuario que introduzca 3 notas y el programa muestra la media de las 3 notas por pantalla.
		 * Las notas que introduce el usuario son números enteros, pero la media puede tener decimales.
		 */
		int nota1 = 0;
		int nota2 = 0;
		int nota3 = 0;
		float promedio = 0f;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Bienvenido a la calculadora de promedio de notas\n"
				+ "Introduce tu primera nota en formato de numero entero");
		
		nota1 = entrada.nextInt();
		
		System.out.println("Introduce tu segunda nota");
		
		nota2 = entrada.nextInt();
		
		System.out.println("Introduce tu tercera nota");
		
		nota3 = entrada.nextInt();
		
		promedio = (nota1+nota2+nota3)/3;
		
		System.out.println("El promedio de tus notas es " + promedio);
		
		entrada.close();

	}

}

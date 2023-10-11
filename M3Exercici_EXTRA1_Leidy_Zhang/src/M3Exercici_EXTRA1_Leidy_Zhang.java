import java.util.Scanner;

public class M3Exercici_EXTRA1_Leidy_Zhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 
Escribe un programa Java que lee un número entero por teclado y obtiene y muestra por pantalla el doble y el triple de ese número.
 */
		int num1 = 0;
		int doble = 0;
		int triple = 0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu numero entero");
		num1 = entrada.nextInt(); 
		
		doble = num1*2;
		triple = num1*3;
		
		System.out.println("El numero que has escogido es " + num1 + ". El doble de ese numero es " + doble + ". El triple de ese numero es " + triple + ".");
		
		entrada.close();

}
}

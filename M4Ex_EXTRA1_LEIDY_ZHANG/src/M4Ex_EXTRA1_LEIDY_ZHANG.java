import java.util.Scanner;

public class M4Ex_EXTRA1_LEIDY_ZHANG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Haz un programa que pregunte al usuario dos números enteros al que llamarás dividendo y divisor respectivamente.

El divisor deberá estar comprendido entre 2 y 7.

De lo contrario, el programa deberá mostrar un mensaje de error.

Si el divisor es correcto (2-7) muestra en pantalla si el dividendo es múltiplo del divisor, o no.
 */
		int dividendo = 0;
		int divisor = 0; // tiene que ser entre 2 y 7; sino msg error ; si si 
		String texto = "";

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero entero como dividendo");
		dividendo = entrada.nextInt();
		
		System.out.println("Introduce un numero entero como divisor entre 2-7");
		divisor = entrada.nextInt();
		
		
		if(divisor >= 2 && divisor <= 7) {
			
			
			if(dividendo % divisor == 0) {
				texto = "El dividendo es múltiplo del divisor";
				
			}else {
				texto = "El dividendo no es múltiplo del divisor";
				
			}
			
		}else {
			texto = "Error";
		}
		
		System.out.println(texto);
		
		entrada.close();
	}

}

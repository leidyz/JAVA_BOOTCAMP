import java.util.ArrayList;
import java.util.Scanner;

public class M6Ex2_Leidy_Zhang {
	
	/*
	 * Este programa calcula la edad media de un número de personas. Este número deberá preguntarse al usuario/a.
	Se debe crear una función que se encargue de pedir las edades al usuario y de calcular la edad media.
	La función recibirá por parámetro el núm. de personas a las que debe pedir la edad.
	La edad de las personas sólo será válida si está comprendida entre 0 y 120 años.
	La media de las edades introducidas debe devolverse por la función (returno).
	//Esra malament no utilitzes l'estructura iterativa correcte. Torna-ho a presentar.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int personas = 0;
		int resultado = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el numero de personas");
		personas = sc.nextInt();
		sc.nextLine();
		resultado = (int) media(personas);
		System.out.println("La media de edades es " + resultado);

		
		sc.close();
	}
	
	public static double media (int personas) {
		Scanner sc = new Scanner(System.in);
		int edad = 0;
		int sumaTotal = 0;
	
		ArrayList<Integer> listaEdades = new ArrayList<Integer>();
		
		for(int i = 0; i< personas; i++) {
			
			System.out.println("Introduzca las edades entre  0-120 ");
			edad = sc.nextInt();
			
			if (edad >= 0 && edad <= 120) {
				listaEdades.add(edad);
				sumaTotal += edad;
				
			}else {
				System.out.println("Edad fuera de rango");
			}
			
		}
		 
		sc.close();
		return sumaTotal/personas;
	}
	

}

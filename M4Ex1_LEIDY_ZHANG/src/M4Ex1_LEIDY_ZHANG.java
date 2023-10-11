import java.util.Scanner;

public class M4Ex1_LEIDY_ZHANG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Modifica l’exercici 1 del mòdul 3. Un cop introduïdes les dades, el programa ha de mostrar el següent per pantalla:

- Si l’usuari/ària té 18 anys o més: “Nom Cognom, ets MAJOR d’edat” 

- Si l’usuari/ària és menor de 18 anys: “Nom Cognom, ets MENOR d’edat”.
		 */
		
		String nom = "";
		String apellido = "";
		int edad = 0;
		
		
		Scanner entrada = new Scanner(System.in);//usar Scanner para usar el input del user
		
		
		System.out.println("Introduce tu nombre"); //pregunta
		nom = entrada.nextLine(); //para definir un input de string	
		
		System.out.println("Introduce tu apellido"); //pregunta
		
		apellido = entrada.nextLine(); //para definir un input de string
		
		System.out.println("Introduce tu edad"); //pregunta
		edad = entrada.nextInt(); //para definir un input de interger
		
		
		if (edad >= 18 ) { 
			System.out.println( nom + " " + apellido +  " Mayor de edad");
		

		}else {
			System.out.println( nom + " " +  apellido +  " Menor de edad");
		}
		
		entrada.close();

	}

}

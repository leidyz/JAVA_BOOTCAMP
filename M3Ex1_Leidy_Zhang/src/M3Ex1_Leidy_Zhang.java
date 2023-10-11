import java.util.Scanner;

public class M3Ex1_Leidy_Zhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fer un programa que li demani a l’usuari/ària: El nom, el cognom i l’edat.
		//Un cop l’usuari/ària hagi acabat d’introduir les dades, aquestes s’han de mostrar per pantalla.
		
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
		
		//output
		System.out.println("Tus datos introducidos son los siguiente: Nombre: " + nom + ", Apellido: " + apellido + " y Edad: " + edad  ); 
		
		
	
		entrada.close();
	

	}

}

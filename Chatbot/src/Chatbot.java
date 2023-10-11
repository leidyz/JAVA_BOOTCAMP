import java.util.Scanner;

public class Chatbot {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);//usar Scanner para usar el input del user
		
		
		System.out.println("Hola como te llamas?");
		String nom = entrada.nextLine();
		
		System.out.println("Hola " + nom + ", ¿qué estas estudiando?");//tenemos que realizar un metodo de entrada para que el usuario indique que estudia															
		
		String estudio = entrada.nextLine(); //para definir un input de string
		
		System.out.println("Estás estudiando " + estudio + ".¡Qué guay!");//teneis que mostrar lo que estudia
		
		

		System.out.println("¿Cuántos años tienes?");//teneis que preguntar edad
		
		int edad = entrada.nextInt(); //para definir un input de interger
		
		System.out.println("Wow " + edad + " años! Encantada de conocerte, hasta la próxima :) ");//teneis que mostrar la edad y despediros
		
		entrada.close();
	
	
		
	}

}

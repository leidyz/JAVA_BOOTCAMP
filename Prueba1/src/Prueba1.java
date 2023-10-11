import java.util.Scanner;

public class Prueba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Registro usuario
		//preguntar el nombre
		//preguntar el apellido
		//preguntar fecha de nacimiento : 0000-00-00
		//preguntar el email
		//preguntar la clave
		//preguntar el saldo de puntos
		//mostrar todo en un contexto inventado
		

		Scanner entrada = new Scanner(System.in);//usar Scanner para usar el input del user
		
		int saldo = 0;
		
		System.out.println("Bienvenido al club de LIBROS-COOL, para comenzar a acumular puntos por favor rellenar el siguiente questionario:");
		System.out.println("Introduce tu nombre");
				
		String nom = entrada.nextLine();
		
		System.out.println("Introduce tu apellido");														
		
		String apellido = entrada.nextLine(); 
		
		System.out.println("Introduce tu fecha de nacimiento en el siguiente formato: YYYY-MM-DD ");
		
		String fecha = entrada.nextLine(); 
		
		System.out.println("Introduce tu email");
		
		String email = entrada.nextLine(); 
		
		System.out.println("Crea una clave numerica de 6 digitos");
		
		int clave = entrada.nextInt(); 
		
		System.out.println("Tu saldo actual es " + saldo + " por ser un nuevo integrante");
		
		
		System.out.println("Bienvenido a LIBROS-COOL, confirmamos tus datos. Nombre: " + nom + " Apellido: " + apellido + " Fecha de nacimiento: " + fecha + " Email: " + email + " Nueva clave: " + clave + " Nuevo saldo de: " + saldo);
		
		
		entrada.close();
		

	}

}

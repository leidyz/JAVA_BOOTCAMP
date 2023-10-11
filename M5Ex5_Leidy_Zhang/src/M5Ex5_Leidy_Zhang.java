import java.util.ArrayList;
import java.util.Scanner;

public class M5Ex5_Leidy_Zhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//El programa irá recabando los datos de los alumnos/as hasta que se den estas 5 becas. 
		//se debe mostrar por pantalla los nombres de los/as 5 alumnos que tienen beca.
		
		int edad = 0;
		boolean universitario = false;
		boolean paro = false;
		String mensaje = "";
		Scanner entrada =new Scanner(System.in);
			
		int becas = 5;
		int suma = 0;
		String nombre = "";
		ArrayList<String> becados = new ArrayList<String>();
		
		while(suma != becas) { //se usa while en este caso ya no sabes cuantas veces hay que hacer el loop
			
			System.out.println("Hola, te haremos una serie de preguntas para ver si cumples con los requisitos de la beca\n"
					+ "1. Indica tu nombre");
			nombre = entrada.nextLine();
			entrada.nextLine();
			
			System.out.println("2. Indica tu edad" );
			edad = entrada.nextInt();
			entrada.nextLine();
			
			System.out.println("3. Tienes titulo universitario? Por favor responder con True o False ");
			universitario = entrada.nextBoolean();
			entrada.nextLine();
			
			System.out.println("4. Estas en el paro? Por favor responder con True o False" );
			paro = entrada.nextBoolean();
			entrada.nextLine();
			
			
			if(edad>=18 && universitario || paro ) {  //si es con las regulaciones de paro le incluiria paro && edad>=16
				mensaje = "Cumples con los requisitos de la beca, enhorabuena!";
				becados.add(nombre);//aqui es para ir agregando los nombres a la lista
				suma++;//esto es para que se pueda ir acumulando las veces que alguien se lleva una beca
		
				
			}else {
				mensaje = "Lo siento, no cumples con los requisitos para la beca.";
			}
				System.out.println(mensaje);
				
		}System.out.println(becados);
		
		entrada.close();
		

	}

}

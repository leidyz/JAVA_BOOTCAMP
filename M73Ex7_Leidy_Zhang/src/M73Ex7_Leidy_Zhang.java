import java.util.Scanner;

public class M73Ex7_Leidy_Zhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion = 0;
		boolean experiencia = false;
		int altura = 0;
		int tabla = 0;
		int minutos = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Introduce un numero entre 1-4\n"
					+ "1. Selection del material de tabla\n"
					+ "2. Forecast de olas\n"
					+ "3. Costo de reserva\n"
					+ "4. Salir");
			
			opcion = sc.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("Tienes experiencia? Responde true o false");
				experiencia = sc.nextBoolean();
				System.out.println(materialTabla(experiencia));
				break;
			case 2:
				System.out.println("La altura de la ola es");	
				altura = sc.nextInt();
				System.out.println(forecast(altura));
				break;
			case 3:
				System.out.println("Elige un tipo de tabla entre \n"
						+ "1. iniciacion \n"
						+ "2. intermedio");		
				tabla = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Dinos por cuantos minutos quieren reservar la tabla");
				minutos = sc.nextInt();
				sc.nextLine();
				
				System.out.println("El coste de tu reserva es " + coste(tabla, minutos) );
				break;
			}
	
			
		}while(opcion!=4);
		sc.close();

	}
	
	public static String materialTabla(boolean experiencia) {
		if(experiencia == true) {
			return "taula de fibra";
		}else 
		return "taula d'espuma";
	}
	
	public static String forecast(int altura){
		if(altura>2) {
			return "oleadas grandes";
		}else {
			return "oleadas pequeñas";
		}
	}
	
	public static String coste (int tabla, int minutos) {
		
		String respuesta = "";
		switch(tabla) {
		
		case 1:
			respuesta = (minutos / 60) * 20 + "€";
			break;
		case 2:
			respuesta = (minutos / 60) * 35 + "€";
			break;
		}
		
		return respuesta;
				
	}


}

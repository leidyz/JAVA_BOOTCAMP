import java.util.Scanner;

public class M73Ex4_Leidy_Zhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//El usuario/a debe introducir un DNI y el programa debe decir si la letra es correcta o no con el número de DNI. 
		//Si la letra no es correcta, debe decir qué letra es la correcta.
		//Para calcular la letra DNI debes tomar el número de DNI a verificar y dividirlo entre 23.
		//El residuo se reemplaza por una letra que ya está asignada a ese número mediante la tabla adjunta:
		
		int numDni = 0;
		String letraDni = "";
		int verifico = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el numero de tu DNI");
		numDni = sc.nextInt();
		
		System.out.println("Introduce el letra de tu DNI");
		sc.nextLine();
		letraDni = sc.nextLine();
		
		verifico = numDni%23;
		//System.out.println(verifico);
		
		
		String[]letra = { "T", "R", "W", "A", "G", "M", "Y", "F", "D", "P", "X", "B", "N", "J", "Z", "S", "Q", "V", "H","L", "C", "K", "E"};
		
		
		
	
		if(letra[verifico].equalsIgnoreCase(letraDni)) { //Para verificar que son iguales
			System.out.println("la letra es la correcta.");
		}else {
			System.out.println("la letra no es correcta. La letra correcta es " + letra[verifico]);
		}
		
		

		sc.close();
	}

}

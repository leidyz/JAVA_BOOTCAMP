import java.util.Scanner;

public class M72Ex6_Leidy_Zhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//el usuario/a debe introducir números hasta que introduzca un número primero.
		//En el momento que el usuario introduzca un número primero, 
		//el programa debe sacar por pantalla el siguiente mensaje: "Exacto, ¡el número “x” es primero!"
		
		int num = 0;
		System.out.println("Introduce un numero prime");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
	
		while(Prime(num) != true) {
			System.out.println("Vuelve a intentar. Introduce un numero prime");
			num = sc.nextInt();
		}
		
		System.out.println("Exacto, ¡el número " + num + " es prime!");
		
		
		sc.close();

	}
	
	public static boolean Prime (int num) {
		
		boolean isPrime = true;
		
	
		for (int i = 2 ; i<num ; i++) {
			if(num % i == 0) {
				isPrime = false;
			}
		}
		
		if(isPrime) {
			return true;
		}else {
			return false;
		}

		
	}

}

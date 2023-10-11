import java.util.Scanner;

public class M72Ex5_Leidy_Zhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//The user enters a number by keyboard
		//and the program calls a method that indicates whether the number is prime or not.
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
	
		
		System.out.println("Introduce un numero y te diremos si es prime");
		num = sc.nextInt();
		
		System.out.println(Prime(num));
		
		
	
		sc.close();
	}
	
	public static String Prime (int num) {
		boolean isPrime =true;
		
		for (int i = 2; i <num; i++ ) {
			
			if (num % i == 0) {
				isPrime = false;
			}
		}
		
		if (isPrime) {
			return num + " es un numero prime";
		}else {
			return num + " no es un numero prime";
		}
	}
	
	
	

}

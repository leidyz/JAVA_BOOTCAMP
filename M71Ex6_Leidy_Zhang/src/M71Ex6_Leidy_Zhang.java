import java.util.Scanner;

public class M71Ex6_Leidy_Zhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//El usuario/a introducirá un número (del 1 al 10) por pantalla, 
		//y utilizando un bucle, el programa le mostrará la tabla de multiplicar de ese número.
		
		int num = 0;
		int multiplicacion = 0;
		Scanner sc = new Scanner(System.in);
		
		
		do {
			System.out.println("Introduzca un numero entre 1-10");	
			num = sc.nextInt();
		
			 
			 if(num>=1 && num <= 10) {
				 System.out.println("La tabla de multiplicar de " + num );
				 
				 for(int i = 1; i <= 10; i++) {
					 multiplicacion = i * num;
					 System.out.println(num + " * " + i + " = " + multiplicacion);
				 }
				 	
			 }
		}
		while(num>=1 && num <= 10);
		System.out.println("Ha introducido un numero fuera de rango. Vuelva a intentar.");
			
			

		

		sc.close();
		
	}

}

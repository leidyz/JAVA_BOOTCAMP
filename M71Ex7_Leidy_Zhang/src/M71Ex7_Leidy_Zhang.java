import java.util.Scanner;

public class M71Ex7_Leidy_Zhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hacer un programa en el que el usuario introduce por pantalla un carácter y un número. 
		//El programa imprime por pantalla un cuadrado con el tamaño y el carácter introducidos por el usuario/a.
		
		String simbolo = "";
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un caracter especial");
		simbolo = sc.nextLine();
		System.out.println("Introduce un numero");
		num = sc.nextInt();
		
		//el primer for, se usa para el string repetitivo de una sola linea
		String resultado = "";	
		for(int i = 0; i < num; i ++) {
			resultado += simbolo;
		}
		
		
		//el segundo for, se usa para las repeticiones de lineas
		for (int a = 0 ; a < num; a++ ) {
			System.out.println(resultado);
			
		}
		
		
		sc.close();
		
	}

}

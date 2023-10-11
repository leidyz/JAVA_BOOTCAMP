import java.util.Scanner;

public class M73Ex2_Leidy_Zhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//En este programa el usuario debe introducir un string y el programa debe mostrar el string al revés.
		
		String palabra = "";
		char letra = ' ';
		String reverse = "";
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduce un palabra y te lo diremos al reves");
		palabra = sc.nextLine();
		
		for (int i = 0; i< palabra.length(); i ++) {
			letra = palabra.charAt(i);
			reverse = letra + reverse;
		}
		
		System.out.print("La palabra al reves es " + reverse);
		
		
		
		sc.close();
		

	}

}

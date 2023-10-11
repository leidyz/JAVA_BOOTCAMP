import java.util.Scanner;

public class M73Ex3_Leidy_Zhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//El usuario/a debe introducir una frase y el programa debe decir si la frase es un palíndromo.
		
		String frase = "";
		char letra = ' ';
		String reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Inntroduce un frase y te dire si es palindromo");
		frase = sc.nextLine();

		for(int i = 0; i < frase.length(); i++) {
			letra = frase.charAt(i);
			reverse = letra + reverse;
		}
		
		//System.out.println(reverse);
		
		if(frase.equals(reverse)) {
			System.out.println("la frase es un palíndromo");
		}else {
			System.out.println("la frase no es un palíndromo");
		}
		
		sc.close();
	}

}

import java.util.Scanner;

public class M73Ex5_Leidy_Zhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Comprobar si una frase introducida por el usuario está formada sólo por minúsculas, sólo por mayúsculas o por minúsculas y mayúsculas.
		
		String frase = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase y te diremos como esta compuesta");
		frase = sc.nextLine();
		
		if(frase.equals(frase.toLowerCase())) {
			System.out.println("la frase está formada sólo por minúsculas");
		}else if(frase.equals(frase.toUpperCase())) {
			System.out.println("la frase está formada sólo por mayúsculas");
		}else {
			System.out.println("la frase está formada por minúsculas y mayúsculas.");
		}
		
		sc.close();

	}

}

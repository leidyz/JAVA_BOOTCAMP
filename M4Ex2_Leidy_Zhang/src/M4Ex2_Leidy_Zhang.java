import java.util.Scanner;

public class M4Ex2_Leidy_Zhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Aquest programa li demana l’edat a l’usuari/ària, en funció d’aquesta, mostrarem un dels següents missatges per pantalla:

Si té 5 anys o menys: preescolar.

Si té entre 6 i 11 anys: primària.

Si té entre 12 i 15: ESO.

Si té entre 16 i 17: Batxillerat.

Si és major d'edat: FP o Universitat.
 */
		int edad = 0;
		String texto = "";
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Indica tu edad");
		edad = entrada.nextInt();
		
		
		if (edad >= 0 && edad<=5) {
			texto = "Preescolar";
		}else if(edad >= 6 && edad <= 11) { 
			texto = "Primaria";
		}else if(edad >= 12 && edad <= 15){
			texto = "ESO";
		}else if(edad >= 16 && edad <= 17) {
			texto = "Bachillerato";	
		}else if(edad>=18) {
			texto = "FP o Universitario";
		}
		else {
			texto = "Por favor introducir un numero entero positivo";
		}
		
		System.out.println(texto);
		entrada.close();
	}

}

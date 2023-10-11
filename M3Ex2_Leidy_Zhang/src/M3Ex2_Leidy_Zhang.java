import java.util.Scanner;

public class M3Ex2_Leidy_Zhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Fer un programa que li demani dos números sencers a l’usuari/ària. Al final, el programa imprimeix per pantalla el següent missatge:  
		El resultat de la suma és: “valor”
		El resultat de la resta és: “valor”
		El resultat de la multiplicació és: “valor”
		El resultat de la divisió és: “valor”.*/

		int num1 = 0;
		int num2 = 0;
		float suma = 0f;
		float resta = 0f;
		float division = 0f;
		float multiplicacion=0f;
		
				
		Scanner entrada = new Scanner(System.in);//usar Scanner para usar el input del user
				
				
		System.out.println("Vamos a ser tu calculadora en Java! Introduce tu primer numero");
				
		num1 = entrada.nextInt(); 
				
		System.out.println("Introduce tu segundo numero");
				
		num2 = entrada.nextInt(); 
		
		suma = num1+num2;
		resta = num1-num2;
		division = (num1/num2);
		multiplicacion= num1*num2;
		
		System.out.println("El resultado de la suma de " + num1 + "+" + num2 + " es: " + suma); 
		System.out.println("El resultado de la resta de " + num1 + "-" + num2 + " es: " + resta);
		System.out.println("El resultado de la multiplicación de " + num1 + "*" + num2 + " es: " + multiplicacion );
		System.out.println("El resultado de la división de " + num1 + "/" + num2 + " es: " + division);
		
		entrada.close();
	
	}

}

import java.util.Scanner;

public class M4Ex5_Leidy_Zhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Hacer un programa que solicite dos números y un operador(+,-,*,/).
			Al final, el programa debe imprimir por pantalla el resultado de realizar la operación que contenga la variable operador.
		 */
		int num1 = 0;
		int num2 = 0;
		char operador = ' ';
		float resultado = 0f;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Hola, voy a ser tu nueva calculadora :) \n"
				+ "1. Indica tu primer numero entero");
		num1 = entrada.nextInt();
	
		
		System.out.println("2. Indica tu segundo numero entero");
		num2 = entrada.nextInt();
		
		
		System.out.println("3. Indroduce un operador entre + , - , / , * ");
		operador = entrada.next().charAt(0); //char c = sc.next().charAt(0);
		
		//como hacer una condiciona de ver si int==null?

		if (operador == '+' || operador == '-' || operador == '/' || operador == '*') { 
		//hice el if primero para que no haga la calculacion en caso de que ponga un operador incorrecto. 
		//cuando ponia el default dentro del switch, el mensaje de error salia, pero el print del resulatado tambien. 
		//i.e. El resultado de 32n65 = 0.0
		
			switch(operador) {
				case '+':
					resultado = num1 + num2;
					break;
				case '-':
					resultado = num1 - num2;
					break;
				case '*':
					resultado = num1 * num2;
					break;
				case '/':
					resultado = (float)num1 /num2;
					break;
					
			}System.out.println("El resultado de \n"
				+ num1 + operador + num2 + " = "+ resultado);
		
		}else {
			System.out.println("Has introducido un operador fuera de rango:( Vuelve a intentar.");
	
			
		}

		entrada.close();
	}

}

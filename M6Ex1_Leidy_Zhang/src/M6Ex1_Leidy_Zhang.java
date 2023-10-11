import java.util.Scanner;

public class M6Ex1_Leidy_Zhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1 = 0;
		double num2 = 0;
		char operador = ' ';
		double resultado = 0d;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu primer numero");
		num1 = sc.nextDouble();
		
		System.out.println("Introduce tu segundo numero");
		num2 =sc.nextDouble();
		
		System.out.println("que operacion quieres realizar? +, -, *, /");
		operador = sc.next().charAt(0);
	
		
		switch(operador) {
		case '+':
			resultado = suma(num1,num2);
			break;
		case '*':
			resultado = multiplicacion(num1,num2);
			break;
		case '-':
			resultado = resta(num1,num2);
			break;
		case '/':
			resultado = division(num1,num2);
			break;
			
		}System.out.println("La suma de " + num1 + " y " + num2 + " es " + resultado);
		
	sc.close();

	}
	

	public static double suma(double x, double y) {
		return x + y;
	}
	
	
	public static double resta(double x, double y) {
		return x - y;
	}
	
	public static double division(double x, double y) {
		return x / y;
	}
	
	public static double multiplicacion(double x, double y) {
		return x * y;
		
	}
	

}

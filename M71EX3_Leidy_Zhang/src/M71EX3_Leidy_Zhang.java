import java.util.Scanner;

public class M71EX3_Leidy_Zhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 0;
		String resultado = "";
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Introduce tu primer numero");
		num1 = sc.nextInt();
		System.out.println("Introduce tu segundo numero");
		num2 = sc.nextInt();
		
		resultado = multiplo(num1, num2);
		System.out.println(resultado);
		
		sc.close();
	}
	
	
	//funcion para saber si el multiplo
	public static String multiplo (int x, int y) {
		return (x % y == 0)? "multiplo": "no es multiplo" ;
	}

}

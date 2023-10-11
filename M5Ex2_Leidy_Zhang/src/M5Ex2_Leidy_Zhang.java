
import java.util.Scanner;

public class M5Ex2_Leidy_Zhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 0;
		int num2 = 0;
		int suma = 0;
		
		
		System.out.println("Vamos hacer la suma de los valores comprendidos entre los dos numeros que nos indique.\n" 
		+ "Introduzca su primer numero");
		
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		System.out.println("Introduzca su segundo numero");
		num2 = sc.nextInt();
		sc.nextLine();
	
		for (int i = num1; i < num2 ; i++) { //comenzamos desde el primer numero y terminara el loop una vez llegue al segundo numero
			
			suma = suma + i ; //la suma inicial comenzaria con num1, pero a medida que el loop continua, a la i solo se incremento por 1
			
			System.out.println(suma);
		}
		
		System.out.println(num1 + " + " + suma + " + " + num2 + " = " + (num2+suma));//aqui no incluyo el num1 ya que este, esta dentro de la suma
		
		sc.close();

	}

}

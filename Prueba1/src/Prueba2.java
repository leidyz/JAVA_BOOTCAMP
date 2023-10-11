import java.util.ArrayList;
import java.util.Scanner;

public class Prueba2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * c. Crea un método que reciba dos números como parámetros y 
		 * devuelva un arrayList con todos los números comprendidos entre ellos. 
		 * Llama al método que acabas de crear desde el main con el 2 y el 10 e 
		 * imprime el arrayList que te devuelve.
		*Salida (con el núm 2 y 10):
		*Los números comprendidos entre 2 y 10 son: 3, 4, 5, 6, 7, 8, 9
		 */
		
		int num1 = 0;
		int num2 = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu primer numero de la lista");
		num1 = sc.nextInt();
		System.out.println("Introduce tu sengundo numero de la lista");
		num2 = sc.nextInt();
		
		
		System.out.println(metodoC(num1, num2));
		sc.close();
}
	public static ArrayList<Integer> metodoC (int num1, int num2) {
		//* devuelva un arrayList con todos los números comprendidos entre ellos. 
		ArrayList<Integer> listaC = new ArrayList<Integer>();
		for (int i = 2 ; i < num2; i++) {
			listaC.add(i);
		}
		return listaC;
	}
}


import java.util.ArrayList;
import java.util.Scanner;

public class Prueba3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * d. Crea un método que reciba un array de letras (char) y una letra a buscar. 
		 * El método deberá buscar el nombre en el array de letras y
		 *  devolver la posición (index) donde se encuentra la coincidencia, 
		 *  sino deberá devolver -1. Crea un arrayList de letras (A,B,C,D,E) y
		 *   llama dos veces al método.
		* Una vez con el array de letras y la letra C a buscar.
		*Otro con el mismo array de letras y la letra J a buscar.
		*Salida (con el array de letras y la letra C: La letra se encuentra en el índice: 2
		*Salida (con el array de letras y la letra J) La letra se encuentra en el índice: -1
		 */
		
		ArrayList<Character> palabras = new ArrayList<Character>();
		palabras.add('A');
		palabras.add('B');
		palabras.add('C');
		palabras.add('D');
		palabras.add('E');
		
		Scanner sc = new Scanner(System.in);
		char letra = ' ';
		System.out.println("Introduce que quieres buscar");
		letra = sc.next().charAt(0);
		
		String respuesta4 = "";
		respuesta4 = metodoD(palabras, letra);
		System.out.println(respuesta4);
		
		

		sc.close();

	}
	
	public static String metodoD (ArrayList<Character> palabras, char letra) {
		
		
		for (int i = 0; i < palabras.size(); i++) {
			if(palabras.get(i).equals(letra)) {
				return "La letra se encuentra en el índice: " + i;
			}
		}
	
		return "La letra se encuentra en el índice: -1";
		
	}
	

}

import java.util.ArrayList;

public class Prueba4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*metodo A:a. Crea un método que reciba un arrayList de números como parámetro, imprima el
		número mayor por consola y devuelva el índice del arrayList donde se encuentra el número más pequeño.
		Crea un arrayList de 5 números (8, 12, 5, 22, 6) en el main y utiliza el método que acabas de
		crear para imprimir el mayor y menor número.
		Salida deseada: (con estos números dentro del arrayList “8, 12, 5, 22, 6”):
		Número más grande 22 (esto lo imprime el propio método)
		Número más pequeño 5 (esto lo imprime el main)
		*/
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(8);
		numeros.add(12);
		numeros.add(5);
		numeros.add(22);
		numeros.add(6);
		
		System.out.println(metodoA(numeros));

	}
	
	public static int metodoA (ArrayList<Integer> numeros) {
		
		//como hacer un algoritmo de sort?
		
		int alto = 0;
		int bajo = 0;
	
		for (int i = 0; i < numeros.size(); i++) { 
			for (int j = 1; j<numeros.size();j++) {
				if(numeros.get(j)<numeros.get(j-1)) {
					numeros.get(j);
					bajo = (int) numeros.get(j);
					alto = (int) numeros.get(j-1);
					numeros.set(j, alto); //poner el alto en la posicion de la derecha
					numeros.set(j-1, bajo);//poner el bajo en la posicion de la izquierda
					
				}
			}		

		}
		System.out.println("El numero mas grande es " + numeros.get(numeros.size()-1));	
		return bajo;
	}
}

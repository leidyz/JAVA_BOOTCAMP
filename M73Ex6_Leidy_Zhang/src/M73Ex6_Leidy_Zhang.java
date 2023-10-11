import java.util.ArrayList;
import java.util.Scanner;

public class M73Ex6_Leidy_Zhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crea un programa que dado un arraylist de números introducidos por el usuario/a, 
		//elimine todos los números que estén duplicados, dejando sólo los números únicos. 
		//Imprime el resultado por pantalla y también que indique cuántos números ha borrado.

		ArrayList<Integer> lista = new ArrayList<Integer>();
		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		int num = 0;
		int max = 0;
		int borrados = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad de numeros que quieres en tu lista");
		max = sc.nextInt();
		
		for (int i = 0; i < max; i++) { //este loop es para saber rellenar el arraylist del usuario
			System.out.println("Introduce tu numero");
			num = sc.nextInt();
			lista.add(num);
		}
		
		System.out.println("Su lista antes de la verificacion es" + lista ); 
		//SORT
		
		//ELIMINAR
		for (int i = 1; i < lista.size(); i++) {
			for(int j = 0; j < i; j++) {
				if(lista.get(i) == lista.get(j)) {
					lista.remove(i);
					borrados++ ;
				}
			}
		}
	
	
		System.out.println("Su nueva lista es" + lista + "\n"
				+ "Se han borrado " + borrados + " duplicados");
		
		
		
		sc.close();
	}

}

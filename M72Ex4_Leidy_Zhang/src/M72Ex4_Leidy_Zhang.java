import java.util.ArrayList;


public class M72Ex4_Leidy_Zhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Escribe un programa que dado un arraylist de números enteros, 
		//genere un nuevo arraylist con los elementos en orden inverso. 
		//Al terminar, debe imprimir el nuevo arraylist.
		
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		ArrayList<Integer> reverso = new ArrayList<Integer>();
		numeros.add(8);
		numeros.add(7);
		numeros.add(14);
		numeros.add(45);
		
		
		for (int i = numeros.size()-1; i>=0; i--) {
			reverso.add(numeros.get(i));
		}
		
		
		System.out.print(reverso);
		

	}

}

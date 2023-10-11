import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		// Arrays nativos de Java
		String[] carro = {"leche","cacao","viaje a canarias","pan","choco"};
		System.out.println(carro.length);//el numero de elementos dentro del array
		carro[2] = "viaje a maldivas"; //sustituir dentro del array
		System.out.println(carro[2]);
		
		//Uso de ArrayLists
		ArrayList<Integer> notas =  new ArrayList<Integer>();
		notas.add(8);
		notas.add(2);
		notas.add(4);
		notas.add(7);
		
		System.out.println(notas);
		System.out.println(notas.get(2));
		System.out.println(notas.set(2, 10));
		System.out.println(notas);
		System.out.println(notas);
		

	}

}

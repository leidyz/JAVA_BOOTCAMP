import java.util.ArrayList;

public class Prueba5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * b. Crea un método que reciba un arrayList de nombres como parámetro y 
		 * devuelva el índice del nombre más largo. Crea un arrayList con 5 nombres 
		 * (Noa, Peter, Victoria, Dani, Sara) en el main y 
		 * utiliza el método que acabas de crear para imprimir el nombre más largo del array.
		Salida deseada: (con los nombres antes descritos)
		Nombre más largo: Victoria (eso lo imprime el main)
		 */
		
		
		ArrayList<String> nombres = new ArrayList<String>();
		nombres.add("Noa");
		nombres.add("Peter");
		nombres.add("Victoria");
		nombres.add("Dani");
		nombres.add("Sara");
		
		System.out.println(metodoB(nombres));

	}
	/*
	 * // Ordenem els noms per ordre de longitud - Ordenado burbuja
		for (int i = 0; i < b.size(); i++) {
			for (int j = 1; j < b.size() - i; j++)
				if (b.get(j).length() < b.get(j-1).length()) {
					String temp = b.get(j);
					b.set(j, b.get(j-1));
					b.set(j - 1, temp);
				}
		}
		// El nom mes llarg es el de la ultima posicio
		return b.size() - 1;
	}
	 */
	
	public static String metodoB (ArrayList<String> nombres) {
		String largo = "";
		String corto = "";
		//crear loop para ver el length de cada string dentro del array 
		//y luego hacer una comparacion de cual es el legngth mas grande entre todos
		for (int i = 0; i < nombres.size(); i++ ) {
			for(int j = 1; j < nombres.size()-1; j++) {
				if(nombres.get(j).length()<nombres.get(j-1).length()) {
					corto = nombres.get(j);
					largo =	nombres.get(j-1);
					nombres.set(j-1, corto);
					nombres.set(j, largo);
				}
			}
		}return largo ;
	
	}
		
		
}



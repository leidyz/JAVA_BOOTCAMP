import java.util.ArrayList;
import java.util.Scanner;

public class Examen_Leidy_Zhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				ArrayList<Integer> numeros = new ArrayList<Integer>();
				ArrayList<String> palabras = new ArrayList<String>();
				ArrayList<Integer> lista = new ArrayList<Integer>();
				ArrayList<Character> letras = new ArrayList<Character>();
				int indice1 = 0;
				int indice2 = 0;

				// 8,12,5,22,6
				numeros.add(8);
				numeros.add(12);
				numeros.add(5);
				numeros.add(22);
				numeros.add(6);

				indice1 = metodo1(numeros);
				System.out.println(numeros.get(indice1));

				palabras.add("Noa");
				palabras.add("Peter");
				palabras.add("Victoria");
				palabras.add("Dani");
				palabras.add("Sara");

				indice2 = metodo2(palabras);
				System.out.println(palabras.get(indice2));

				lista = metodo3(2, 10);
				System.out.println(lista);

				letras.add('a');
				letras.add('b');
				letras.add('c');
				letras.add('d');
				letras.add('e');

				System.out.println("Indice: " + metodo4(letras, 'c'));
				System.out.println("Indice: " + metodo4(letras, 'j'));
			}

			public static int metodo1(ArrayList<Integer> numeros) {
				int mayor = numeros.get(0);
				int menor = numeros.get(0);
				int indice = 0;

				for (int i = 1; i < numeros.size(); i++) {
					if (numeros.get(i) > mayor) {
						mayor = numeros.get(i);
					}
				}

				System.out.println(mayor);

				for (int i = 1; i < numeros.size(); i++) {
					if (numeros.get(i) < menor) {
						menor = numeros.get(i);
						indice = i;
					}
				}

				return indice;
			}

			public static int metodo2(ArrayList<String> palabras) {
				int mayor = palabras.get(0).length();
				int indice = 0;

				for (int i = 1; i < palabras.size(); i++) {
					if (palabras.get(i).length() > mayor) {
						mayor = palabras.get(i).length();
						indice = i;
					}
				}
				return indice;

			}

			public static ArrayList<Integer> metodo3(int num1, int num2) {
				ArrayList<Integer> listado = new ArrayList<Integer>();

				for (int i = (num1 + 1); i < num2; i++) {
					listado.add(i);
				}

				return listado;
			}

			public static int metodo4(ArrayList<Character> letras, char caracter) {
				int encontrado = -1;
				int i = 0;
				boolean fuera = false;

				while (i < letras.size() && fuera == false) {
					if (letras.get(i) == caracter) {
						encontrado = i;
						fuera = true;
					}
				}
				return encontrado;
			}
	
	}



import java.util.ArrayList;
import java.util.Scanner;

public class M5Ex1_Leidy_Zhang {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		 
		
		int num = 0;
		Scanner entrada = new Scanner(System.in);
		String palabra = "";
		ArrayList<String> lista =  new ArrayList<String>();//crear la ArrayLists
		
		
		System.out.println("Cuantas palabras quieres en tu lista?"); //El programa pide cuántas palabras quiere introducir el usuario/a.
		num = entrada.nextInt();//Éste, introduce el número 
		entrada.nextLine();
		
		for(int i = 0 ; i < num; ++i) { //i representara las veces que haga el loop hasta que sea igual que las veces que pidio es usario
			System.out.println("Introduce la palabra");
			palabra = entrada.nextLine(); //entrada de la nueva palabra
			entrada.nextLine();
			lista.add(palabra); //agregar la nueva palabra al arraylist
			
		
		}System.out.println(lista);
		
		
		 entrada.close();
	
	}
		}

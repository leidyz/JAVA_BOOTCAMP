import java.util.ArrayList;
import java.util.Scanner;

public class M71Ex2_Leidy_Zhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numNotas = 0; //el total de numero de notas que vamos a calcular
		int suma = 0; //variable para retener la suma de la cantidad de notas
		int nota = 0;
		double media = 0d;
		String texto = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero de notas");
		numNotas = sc.nextInt();
		ArrayList<Integer> listaNotas = new ArrayList<Integer>();
		
		
		//aqui uso while ya que quiero en el loop hasta que las condiciones se cumplan
		
		while(numNotas != suma) {
		System.out.println("Introduce la nota entre 0-10 ");
		nota = sc.nextInt();
		
		//el if se agrega aqui para poder detectar si la nota cumple los parametros 0-10
		if(nota>=0 && nota <= 10) {
			listaNotas.add(nota);
			suma++;	
		}else {
			System.out.println("La nota introducida no esta entre 0-10. Por favor volver a intentar.");
		}
		
		}
		//System.out.println(listaNotas);
		
		//esto es para saber la suma de los arrays
		int sumaTotal = 0;
		for(int i : listaNotas) {
			sumaTotal+= i;
		}
		//System.out.println(sumaTotal);
		
		//la calculacion de la media
		media = sumaTotal/numNotas;
		//System.out.println(media);
		
		if(media<5) {
			texto = "La nota media de la clase está suspendida. Los alumnos/as deberían preguntar sus dudas y trabajar más";	
		}else if (media<7) {
			texto = "La nota media de la clase es buena, pero los alumnos/as deberían mejorar el trabajo personal";
		}else {
			texto = "¡Enhorabuena! La nota media de la clase se corresponde con el esfuerzo realizado";
		}
		
		System.out.println(texto);
		
		sc.close();
	}

}

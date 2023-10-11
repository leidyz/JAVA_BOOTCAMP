
import java.util.Scanner;

public class M72Ex2_Leidy_Zhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tringulo invertido
		
		final char SIMBOLO = '*';
		int lineas = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el numero de lineas");
		lineas = sc.nextInt();
		
		for (int i = lineas; i > 0; i--) { //se va restando la cantidad de lineas 
			for(int j =0; j<i; j++) { //tiene que seguir imprimiendo estrellitas hasta que sea menor que i(el cual representa la linea)
				System.out.print(SIMBOLO);
			}
			System.out.println();	//este es para hacer el salto de linea
		}
		
		sc.close();
	}

}

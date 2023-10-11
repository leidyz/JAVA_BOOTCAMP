import java.util.Scanner;

public class M72Ex3_Leidy_Zhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//incrementar el triangulo
		//deps volver a restar el triangulo
		
		char simbolo = '*';
		int lineas = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el numero de lineas");
		lineas = sc.nextInt();
		
		for (int i =1; i <= lineas; i++ ) {
			for (int j= 0; j < i; j++) {
				System.out.print(simbolo);
			}
			System.out.println();
		}
		
		for (int x = lineas; x > 0; x--) { //que se reste hasta que x sea 0
			for(int y = 1; y < x; y++) {
				System.out.print(simbolo);
			}
			System.out.println();
		}
		
		sc.close();
		

	}

}

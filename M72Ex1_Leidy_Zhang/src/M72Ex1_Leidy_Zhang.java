import java.util.Scanner;

public class M72Ex1_Leidy_Zhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//trangulo de menos a mas
		final char SIMBOLO = '*';
		int lineas = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la cantidad de lineas");
		lineas = sc.nextInt();
		
		
		for (int x = 1; x <=lineas; x++) {
			
			for (int i = 0; i < x; i++) {
				System.out.print(SIMBOLO);
			}
			System.out.println();
		
		}
			

		sc.close();
	}

}

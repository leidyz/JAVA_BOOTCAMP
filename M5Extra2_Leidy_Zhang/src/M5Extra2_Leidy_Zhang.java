import java.util.Scanner;

public class M5Extra2_Leidy_Zhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hacer un programa para que escriba L
		
		int altura = 0;
		int base = 0;
		final char Simbolo = '*';
		Scanner sc = new Scanner(System.in); //commad+shift+o ayuda a importar 
		
		System.out.println("Dime una altura en numero");
		altura = sc.nextInt();
		base = (altura/2) + 1;
		
		for (int i = 1; i < altura; i++) {
			System.out.println(Simbolo);
		}
		
		for (int b =0; b < base; b++) {
			System.out.print(Simbolo);
		}
		
		sc.close();

	}

}

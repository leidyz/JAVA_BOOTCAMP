
import java.util.Scanner;

public class M4Ex_Extra3_Leidy_Zhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Aquesta línia de codi: 
		*int numRandom = (int)(Math.random() * 3) + 1;
		*Juguem a pedra, paper o tisora:
		*1. Pedra
		*2. Paper
		*3. Tisora
		*Tria (1-3):
		*«Jo paper i tu tisora. Has guanyat!»
		 */
		
		int pc = (int)(Math.random() * 3) + 1;
		int num1 = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Juguemos a piedra, papel o tijera:\n"
				+ "1. Piedra\n"
				+ "2. Papel\n"
				+ "3. Tijera\n"
				+ "Elije (1-3):");
		num1 = entrada.nextInt();
	
		
		if(num1 >= 1 && num1 <= 3 ) {
		
			switch(num1) {
				case 1:
					System.out.println("has elejido piedra");
					break;
				case 2:
					System.out.println("has elejido papel");
					break;
				case 3:
					System.out.println("has elejido tijera");
					break;
			}
			
			switch(pc) {
			case 1:
				System.out.println("pc ha elejido piedra");
				break;
			case 2:
				System.out.println("pc ha elejido papel");
				break;
			case 3:
				System.out.println("pc ha elejido tijera");
				break;
			}
			
		
			if(num1 == 1 && pc == 3 || num1 == 1 && pc == 2 || num1 == 3 && pc == 2) {
				System.out.print("PC " + pc + " y tu " + num1 + ". Tu has ganado!");
			}else if (num1 == 3 && pc == 1 || num1 == 1 && pc == 2 || num1 == 2 && pc == 3){
				System.out.print("PC " + pc + " y tu " + num1 + ". PC ha ganado!");
			}else 
				System.out.print("PC " + pc + " y tu " + num1 + ". Hemos empatado!");
			
		}else {
				System.out.println("Error");
		}
				
		
		entrada.close();
	
	

	}
}

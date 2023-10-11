import java.util.Scanner;

public class M5Extra1_Leidy_Zhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int pc = (int) Math.ceil((Math.random() * 500)); 
		System.out.println(pc);
		int usuario = 0;
		Scanner sc = new Scanner(System.in);
		
		
		while(pc != usuario) {
			System.out.println("Introduce un numero entre 1 - 500");
			usuario = sc.nextInt();
			
			if(pc != usuario) {
				int diferencia = pc- usuario;
				if(diferencia > 0 && diferencia < 15 ) {
					System.out.println("Caliente, caliente: tu numero es mas bajo");
				}else if(diferencia < 0 && diferencia > -15) {
					System.out.println("Caliente, caliente: tu numero es mas alto");
				}else if (diferencia >= 15 && diferencia <50) {
					System.out.println("Tibio, tibio: tu numero es mas bajo");
				}else if(diferencia <= -15 && diferencia > -50) {
					System.out.println("tibio, tibio: tu numero es mas alto");
				}else if (diferencia >= 50) {
					System.out.println("frio, frio: tu numero es mas bajo");
				}else if (diferencia <= -50) {
					System.out.println("frio frio: tu numero es mas alto");
				}
			
			}
		}
		System.out.println("Enhorabuena!");
		
		sc.close();
		
	}

}

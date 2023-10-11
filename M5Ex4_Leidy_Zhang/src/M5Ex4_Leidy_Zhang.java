import java.util.Scanner;

public class M5Ex4_Leidy_Zhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//max de intento 5, usar un for (intentos≤5), comprobar si ha salido porque ha salido, si es porque gano o perdio.
		//“Enhorabona, el número és X i has necessitat Y intents per encertar-lo”.
		// "Has utilitzat massa intents! El número és X ".
		
		int numPC = (int) Math.ceil(Math.random()*10);
		System.out.println(numPC);
		
		int numUsuario = 0;
		Scanner sc = new Scanner(System.in);
		
		
		for (int i = 0; i <= 5; i++) {//aqui i seria el numero de intentos
			
				System.out.println("Introduce un numero entre 1-10");
				numUsuario = sc.nextInt();
				
				
				if(numPC!=numUsuario) {
					System.out.println("Intenta de nuevo.");
				}else if (numPC == numUsuario) {
					System.out.println("Enhorabona, el número era " + numPC);
				}
			
		}
		System.out.println("Has utilizado el maximo de intentos! El numero es " + numPC );
		
		
		sc.close();
		

	}

}

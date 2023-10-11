package M7;

import java.util.Scanner;

public class M71Ex1_Leidy_Zhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota1 = 0;
		int nota2 = 0;
		int nota3 = 0;
		double media = 0d;
		String mensaje = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Vamos a calcular la media. \n"
				+ "Introduce tu primera nota");
		nota1 = sc.nextInt();
		System.out.println("Introduce tu segunda nota");
		nota2 = sc.nextInt();
		System.out.println("Introduce tu tercera nota");
		nota3 = sc.nextInt();
		
		media = (nota1 + nota2 + nota3)/3;
	
		if(media<5) {
			mensaje = "No has superado el curso. Tienes que recuperar";
		}else if (media >= 5 && media <= 7) {
			mensaje = "¡Enhorabuena! Has aprobado, pero deberías seguir practicando";
		}else {
			mensaje = "¡Enhorabuena! ¡Has superado el curso! ¡Pasa ya al siguiente nivel!";
		}
		
		System.out.println(mensaje);
		sc.close();

	}

}

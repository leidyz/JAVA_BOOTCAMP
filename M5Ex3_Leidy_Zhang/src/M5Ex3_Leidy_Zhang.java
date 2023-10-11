import java.util.Scanner;

public class M5Ex3_Leidy_Zhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// m5ex3,: cast a un integer, se usa while, tiene que ser igual al en la condicion, en el de i++ pude ser un modificador
		int numPC = (int) Math.ceil(Math.random()*10);
		System.out.println(numPC);
		int numUsuario = 0;
		Scanner sc = new Scanner(System.in);
		
		while(numPC!=numUsuario) {
			System.out.println("Introduce un numero entre 1-10");
			numUsuario = sc.nextInt();
			
			if(numPC!=numUsuario) {
				System.out.println("Intenta de nuevo.");
			}else {
				System.out.println("Enhorabona, el número era " + numPC);
			}
		}
		
		sc.close();
	}

}

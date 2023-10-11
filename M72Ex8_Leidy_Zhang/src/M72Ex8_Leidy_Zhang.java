
import java.util.Scanner;

public class M72Ex8_Leidy_Zhang {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//El usuario introduce un número por teclado y el programa llama a un método que debe mostrar la sucesión de Fibonacci.
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la cantidad de numeros que quieres en tu sequencia fibonacci");
		num = sc.nextInt();
		
		
		System.out.print(fibonacci(num));	
	
		
		sc.close();

	}

	private static long fibonacci(int num) {
		
		int a =0; //los numeros bases del  fibonacci
		int b =1; //los numeros bases del  fibonacci
		int sum =0; //se crea esta variable para ir sumando dentro del fibonacci
		
		 
		for (int i = 1; i< num; i++) { //se comienza desde 1 ya que el primero es 0
			
			 System.out.print(a + " , "); //aqui para ir acumulando el fibonacci
			 sum = a+b;	  //esto representaria 0+1
			 a = b; //la a tomara el nuevo numero 1
			 b = sum; //la b tomara la represetnacion de la suma
			 
		 }
		return a; //siempre usar la ultima respuesta como el return  
		 
		
	}
	
	
}

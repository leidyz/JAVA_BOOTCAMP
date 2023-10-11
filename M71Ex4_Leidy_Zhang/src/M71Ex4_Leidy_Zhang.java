import java.util.Scanner;

public class M71Ex4_Leidy_Zhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu primer numero");
		num1 = sc.nextInt();
		System.out.println("Introduce tu segundo numero");
		num2 = sc.nextInt();
		
		if (num1 <0 && num2 >0 || num2 <0 && num1>0) {
			System.out.println("Uno de los dos números es negativo");
		}
		sc.close();
		
	}

}

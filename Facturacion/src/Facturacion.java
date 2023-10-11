import java.util.Scanner;

public class Facturacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//un estructura sequencial
		
		int opcion = 0;
		int numFactura = 0;
		/*int numFacturaEs = 0;
		int numFacturaEu = 10;
		int numFacturaEr = 20;
		int numFacturaIn = 30;*/
		
		int[] numFacturaT = { 0, 10,20,30};
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.println("Que tipo de factura deseas?\n"
					+ "1. Espanola\n"
					+ "2. Europea sin ROI\n"
					+ "3. Europes con ROI\n"
					+ "4. Internacional\n"
					+ "0. Salir ");
			
			opcion = entrada.nextInt();
			
			System.out.println("Has escogido " + opcion );
			
			
			
			//Estructura condicional
			
			/*switch(opcion) {
			case 1:
				numFactura = ++numFacturaT[0];
				break;
			
			case 2:
				numFactura = ++numFacturaT[1];
				break;
				
			case 3:
				numFactura = ++numFacturaT[2];
				break;
				
			case 4:
				numFactura = ++numFacturaT[3];
				break;
				
			case 0:
				System.out.println("Adios");
				break;
				
			default:
				System.out.println("Tienes que escoger una opcion entre el 0-4");
				break;
				
			}*/
			
			if (opcion>=1 && opcion <=4) {
				numFactura = ++numFacturaT[(opcion -1 )];
				System.out.println("El nuevo numer de factura es " + numFactura);
			}else if(opcion==0){
				System.out.println("Adios");
			}else {
				System.out.println("Tienes que escoger una opcion entre el 0-4");
			}
	
		}while(opcion != 0);
		
		entrada.close();

	}

}

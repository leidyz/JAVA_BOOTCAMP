import java.util.Scanner;

public class M4Ex_EXTRA2_LEIDY_ZHANG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Demana a l'usuari/ària un número entre 0 i 99 i mostra'l escrit en lletres (pots fer-ho en català o castellà).
		Exemple: 56 (cinquanta-sis) o 56 (cincuenta y seis)
		 */
		
		int numeroU = 0;
		int numeroD = 0;
		String numLetrasU = "";
		String numLetrasD = "";
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Dime la unidad");
		numeroU = entrada.nextInt();
		
		System.out.println("Dime la decena");
		numeroD = entrada.nextInt();
		
		//filtro para datos erroneos
		if(numeroU > 9 || numeroU < 0 || numeroD > 9 || numeroD < 0) {
			System.out.println("debes indicar un valor entre 0 y 9.");
		}else {
			switch(numeroU) {
			case 0:
				//numLetrasU = (numeroD > 0) ? "" : "cero"; //filtro por si tiene algun valor en las decenas
				if(numeroD>0) {
					numLetrasU = "";
				}else {
					numLetrasU = "cero";
				}
				break;
			case 1:
				numLetrasU = "uno";
				break;
			case 2:
				numLetrasU = "dos";
				break;
			case 3:
				numLetrasU = "tres";
				break;
			case 4:
				numLetrasU = "cuatro";
				break;
			case 5:
				numLetrasU = "cinco";
				break;
			case 6:
				numLetrasU = "seis";
				break;
			case 7:
				numLetrasU = "siete";
				break;
			case 8:
				numLetrasU = "ocho";
				break;
			case 9:
				numLetrasU = "nueve";
				break;
				
			}
			
			switch(numeroD) {
			case 0:
				numLetrasD = "";
				break;
			case 1:
				switch(numeroU) {
				case 0:
					numLetrasD = "diez";
					break;
				case 1:
					numLetrasD = "once";
					break;
				case 2:
					numLetrasD = "doce";
					break;
				case 3:
					numLetrasD = "trece";
					break;
				case 4:
					numLetrasD = "catorce";
					break;
				case 5:
					numLetrasD = "quince";
					break;
				case 6:
					numLetrasD = "dieciseis";
					break;
				case 7:
					numLetrasD = "diecisiete";
					break;
				case 8:
					numLetrasD = "dieciocho";
					break;
				case 9:
					numLetrasD = "diecinueve";
					break;	
				}
				numLetrasU = "";
				break;
			case 2:
				numLetrasD = "veinte";
				
				break;
			case 3:
				numLetrasD = "trienta";
				break;
			case 4:
				numLetrasD = "cuarenta";
				break;
			case 5:
				numLetrasD = "cincuenta";
				break;
			case 6:
				numLetrasD = "sesenta";
				break;
			case 7:
				numLetrasD = "setenta";
				break;
			case 8:
				numLetrasD = "ochenta";
				break;
			case 9:
				numLetrasD = "noventa";
				break;
			
			}
			if( numLetrasD == "" || numLetrasU == "") {
				System.out.print(numLetrasD + " " + numLetrasU);
			}else {
				System.out.print(numLetrasD + " y " + numLetrasU);
			}
		
		}
		entrada.close();
		

	}

}

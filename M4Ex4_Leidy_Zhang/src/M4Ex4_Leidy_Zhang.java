import java.util.Scanner;

public class M4Ex4_Leidy_Zhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * El usuario/a introduce un mes por pantalla y mediante un switch con los 12 meses del año, 
		 * el programa calcula los días del mes y muestra lo siguiente:
		 *Ejemplo: Si el número introducido es 1, entonces debe aparecer por pantalla: “El mes de enero tiene 31 días”
		 */
		//feb 28, 
		// 31 enero, marzo, mayo, julio agosto octubre diciembre
		
		int mes = 0;
		String texto = "";
		Scanner entrada =new Scanner(System.in);
		System.out.println("Le calcularemos la cantidad de dias del mes que elija.\n"
				+ "Por favor seleccione un numero entre 1-12.");
		mes = entrada.nextInt();
		
		if(mes >= 1 && mes <= 12 ) {
			switch (mes) {
			case 1:
				texto = "El mes de enero tiene 31 días";
				break;
			case 2:
				texto = "El mes de febrero tiene 28 días";
				break;
			case 3:
				texto = "El mes de marzo tiene 31 días";
				break;
			case 4:
				texto = "El mes de abril tiene 30 días";
				break;
			case 5:
				texto = "El mes de mayo tiene 31 días";
				break;
			case 6:
				texto = "El mes de junio tiene 30 días";
				break;
			case 7:
				texto = "El mes de julio tiene 31 días";
				break;
			case 8:
				texto = "El mes de agosto tiene 31 días";
				break;
			case 9:
				texto = "El mes de septiembre tiene 30 días";
				break;
			case 10:
				texto = "El mes de octubre tiene 31 días";
				break;
			case 11:
				texto = "El mes de noviembre tiene 30 días";
				break;
			case 12:
				texto ="El mes de diciembre tiene 31 días";
				break;
			
			
			}System.out.println(texto);
		}else {
			System.out.println("Error, no has seleccionado un numero entre el 1-12. Volver a intentar.");
		}
		
		entrada.close();
		

	}

}

import java.util.ArrayList;
import java.util.Scanner;

public class M71Ex5_Leidy_Zhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crea una lista de tareas. Haz un menú que permita al usuario añadir, 
		//mostrar y eliminar tareas, además de salir de la aplicación.
		
		ArrayList<String> tareas = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		String tarea = "";
		
		//se usa el do while ya que necesito que siga dando las opciones del menu
		
		do {
		
			System.out.println("Menu de tareas \n"
					+ "Escoga un numero entre 1-4 \n"
					+ "1. Añadir tarea \n"
					+ "2. Mostrar lista de tareas \n"
					+ "3. Eliminar tareas \n"
					+ "4. Salir ");
			
			opcion = sc.nextInt();
		
			switch(opcion) {
			case 1:
				System.out.println("Introduzca la tarea");
				sc.nextLine();
				tarea = sc.nextLine();
				tareas.add(tarea);
				break;
			case 2:
				System.out.println(tareas);
				sc.nextLine();
				break;
			case 3:
				System.out.println("Introduza la tarea que quisiera eliminar");
				sc.nextLine();
				tarea = sc.nextLine();
				tareas.remove(tarea);
				break;
			}
			
			
		}while(opcion != 4);
		System.out.println("Has salido.");
		
		sc.close();
	}

}

import java.util.Scanner;

public class PracticeEx1_Leidy_Zhang {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Inicialmente la empresa dispone del siguiente stock, 50 unidades de chaquetas, 50 unidades de
	pantalón, 50 pares de zapatos, 50 unidades de mascarillas y 50 pares de guantes.
	Cuando registramos a un trabajador, se le tiene que asignar por defecto una chaqueta y un pantalón.
	Un empleado no podrá disponer de dos artículos iguales.
	No debe poder retirarse un artículo de uniformidad si no se disponen de existencias.
	Cuando se elimina un trabajador, se deben devolver al stock los artículos asignados al
	trabajador.
		 */
		//public Uniformes (int uniformeID, String tipoUniforme, int unidades )
		
		Uniformes chaquetas = new Uniformes("chaquetas", 50);
		Uniformes pantalones = new Uniformes("pantalones", 50);
		Uniformes zapatos = new Uniformes("zapatos", 50);
		Uniformes mascarillas = new Uniformes("mascarillas", 50);
		Uniformes guantes = new Uniformes("guantes", 50);
		
		int option = 0;
		
		do {
			
			System.out.println("0. Sortir de l'aplicació\n"
					+ "		1. Registrar treballador\n"
					+ "		2. Editar treballador\n"
					+ "		3. Eliminar treballador.\n"
					+ "		4. Retirar uniformitat.\n"
					+ "		5. Retornar uniformitat.");
			
			option = sc.nextInt();
			sc.nextLine();
			
			switch(option) {
			case 1:
				break;
			}
			
			
		}while(option != 0);
		
		
	}
	
	
	

}

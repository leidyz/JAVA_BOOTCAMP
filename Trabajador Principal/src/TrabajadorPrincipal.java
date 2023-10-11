import java.util.Arrays;

public class TrabajadorPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trabajador[] trabajadores = new Trabajador[3];
		trabajadores[0] = new Trabajador("Francesa", 2700, 2018, 12, 3);
		trabajadores[1] = new Trabajador("Ana", 4500, 2020, 7, 1);
		trabajadores[2] = new Trabajador("Lidia", 20000, 2023, 6, 28);
		
		Arrays.sort(trabajadores);
		
		for(Trabajador Trabajador: trabajadores) {
			System.out.println(trabajadores.toString());
		}
	
	}

}

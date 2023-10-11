import java.util.ArrayList;
import java.util.Scanner;

public class Factoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		ArrayList<Empleado> trabajadores = new ArrayList<Empleado>();
		
		trabajadores.add(new Empleado("Pepe","Garcia",27000, "Torero"));
		trabajadores.add(new Empleado("Lidia","Perez",45000, "Administrativa"));
		trabajadores.add(new Encargado("Anna","Benito",25000, "Junior Developer",30000));
	    trabajadores.add(new Empleado("Lola","Gramola",58000, "DevOps"));
	    
	    Encargado rrhh = (Encargado) trabajadores.get(2);
	    System.out.println(rrhh.berrear());
		
	    trabajadores.get(2).anadirPlus(3);
	    //trabajadores.get(1).cognom;
	    
		System.out.println(trabajadores.get(0).toString());
		System.out.println(trabajadores.get(1).toString());
		System.out.println(trabajadores.get(2).toString());
		System.out.println(trabajadores.get(3).toString());
		
		
	}

}

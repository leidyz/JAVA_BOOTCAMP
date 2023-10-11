import java.util.Scanner;

public class M8Ex5_Leidy_Zhang {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		int y = 0;
		double radio = 0;
		
		int x2 = 0;
		int y2 = 0;
		double radio2 = 0;
		
		//public Point(int posicionX, int posicionY)
		//public Circle(Point Center, double radius)
		System.out.println("Dime los datos de tu primer circulo \n"
				+ "Posicion x:");
		x = sc.nextInt();
		
		System.out.println("Posicion y:");
		y = sc.nextInt();
		
		System.out.println("radio");
		radio = sc.nextInt();
		
		Point punto1 = new Point(x,y);
		
		Circle primero = new Circle(punto1, radio);
		
		
		System.out.println("Dime los datos de tu segundo circulo \n"
				+ "Posicion x:");
		x2 = sc.nextInt();
		
		System.out.println("Posicion y:");
		y2 = sc.nextInt();
		
		System.out.println("radio");
		radio2 = sc.nextInt();
		
		Point punto2 = new Point(x2,y2);
		
		Circle segundo = new Circle(punto2, radio2);
		
		System.out.println("Aqui estan tus comparaciones de circulos");
		System.out.println(primero.toString()+ "\n"
				+ "\n La distancia entre los circulos: " + primero.distanceCenter(segundo) 
				+ "\n Son concentric: " + primero.areConcentric(segundo)
				+ "\n Son iguales: " + primero.equals(segundo)
				+ "\n Tienen radios iguales: " + primero.haveEqualRadius(segundo)
				+ "\n Son secantes: " + primero.sonSecants(segundo)
				+ "\n Son tangentes: " + primero.sonTangents(segundo)
				);
		
	

	}

}

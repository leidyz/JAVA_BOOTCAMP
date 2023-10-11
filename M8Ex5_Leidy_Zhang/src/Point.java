
public class Point {
	
	/*
	 * The Point class will have the positionX and positionY attributes. 
	 * In addition, it will have the constructor parameterized with all the attributes of the class.
	 */
	
	//atributos
	
	private double posicionX;
	private double posicionY;
	
	//constructor
	public Point(double posicionX, double posicionY) {
		this.posicionX = posicionX;
		this.posicionY = posicionY;
	}
	
	//getter
	
	public double getPosicionX() {
		return this.posicionX;
	}
	
	public double getPosicionY() {
		return this.posicionY;
	}
	//settter
	
	public void setPosicionX(double posicionX) {
		this.posicionX = posicionX;
	}
	
	public void setPosicionY(double posicionY) {
		this.posicionY = posicionY;
	}
	
	//metodos generales
	
	//metodos propios
	

}


public class Circle {
	 
	
	//atributos
	private Point Center;
	private double radius;
	
	//constructor
	public Circle(Point Center, double radius) {
		this.Center = Center;
		this.radius = radius;
	}
	
	//getter
	public Point getCenter() {
		return this.Center;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	//setter
	public void setCenter(Point Center) {
		this.Center = Center;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//metodos generales
	
	//distanceCenters(otherCircle): Returns the distance between the center of the current circle and the received one as a parameter.
	public double distanceCenter(Circle circulo2) {
		return Math.sqrt(
		       (Math.pow((circulo2.getCenter().getPosicionX() - this.Center.getPosicionX()),2)) -
		    	(Math.pow((circulo2.getCenter().getPosicionY() - this.Center.getPosicionY()),2)) );
	}

	// equals(otherCircle): Returns true if two circles are equal (if they have the same center and the same radius).
	public boolean equals(Circle circulo2) {
		boolean respuesta = false;
		
		if(this.Center == circulo2.getCenter() && this.radius == circulo2.getRadius()) {
			respuesta = true;
		}else {
			respuesta = false;
		}
		
		return respuesta; 
	}

	//areConcentric(otherCircle): Returns true if two circles are concentric (have the same center).
	
	public boolean areConcentric(Circle circulo2) {
		boolean respuesta = false;
		
		if(this.Center == circulo2.getCenter()) {
			respuesta = true;
		}else {
			respuesta = false;
		}
		
		return respuesta; 
	}

	//haveEqualRadius(otherCircle): Returns true if two circles have the same radius.
	
	public boolean haveEqualRadius(Circle circulo2) {
		boolean respuesta = false;
		
		if(this.radius == circulo2.getRadius()) {
			respuesta = true;
		}else {
			respuesta = false;
		}
		
		return respuesta; 
	}

	//sonTangents(otherCircle): Returns true if two circles are tangent.
	
	public boolean sonTangents(Circle circulo2) {
		boolean respuesta = false;
		
		if(this.distanceCenter(circulo2) == this.radius + circulo2.getRadius() ) {
			respuesta = true;
		}else {
			respuesta = false;
		}
		
		return respuesta; 
	}
	

	//sonSecants(otherCircle): Returns true if two circles are secants.
	
	public boolean sonSecants(Circle circulo2) {
		boolean respuesta = false;
		
		if(this.distanceCenter(circulo2) == this.radius + circulo2.getRadius() ) {
			respuesta = true;
		}else {
			respuesta = false;
		}
		
		return respuesta; 
	}

	// notTouch(otherCircle): Returns true if two circles do not touch.
	
	
	//metodos propios
	public String toString() {
		return "Este circulo con la radio de " + this.radius + ", en la posicion ( " +this.getCenter().getPosicionX() +
				" , " + this.getCenter().getPosicionY() + " ) ";
				
		
	}
}

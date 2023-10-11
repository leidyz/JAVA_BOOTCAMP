
public class Car {
	//atributos
	int power;
	int speed;
	String color;
	int price;

	
	//constructor
	public Car(int power, int speed, String color, int price) {
		this.power = power;
		this.speed = speed;
		this.color = color;
		this.price = price;
		
	}
	
	//getter
	public int getPower() {
		return this.power; 
	}
	public int getSpeed() {
		return this.speed; 
	}
	public String getColor() {
		return this.color; 
	}
	public int getPrice() {
		return this.price; 
	}
	
	//setter
	
	public void setPower(int power) {
		this.power= power; 
	}
	public void setSpeed(int speed) {
		this.speed = speed; 
	}
	public void setColor(String color) {
		this.color = color; 
	}
	public void setPrice(int price) {
		this.price = price; 
	}
	
	//metodos propios
	
	public String toString() {
		return "The car has the followind details: " +
				"\n Power: " + this.power  +
				"\n Top speed: " + this.speed  +
				"\n Color: " + this.color  +
				"\n Market price: " + this.price  + "\n" ;
	}

}

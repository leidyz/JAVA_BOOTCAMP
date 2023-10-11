
public class Cinema extends Edificio{

	//atributos
	private int attendees;
	private int price;
	private int capacity;
	
	//constructor
	public Cinema(String name, int numFloors, double area, int attendees, int price, int capacity) {
		super(name, numFloors, area);
		this.attendees = attendees;
		this.price = price;
		this.capacity = capacity;
		super.setBuildingID(2);
	}
	
	//getter
	public int getAttendees() {
		return this.attendees;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public int getCapacity() {
		return this.capacity;
	}
	
	//setter
	public void setAttendees(int attendees) {
		this.attendees = attendees;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	//metodos generales
	
	/*
	 * In the cinema, the projectarSession() function will be created, 
	 * which will display the message "xxx euros have been collected" ,
	 *  bearing in mind that, to calculate the collection, 
	 *  the price of a ticket must be multiplied by the number of attendees the session, 
	 *  which cannot exceed the maximum capacity. 
	 *  Therefore, the projectarSession() function must receive as parameters the number of attendees 
	 *  and the price of the ticket for that session. 
	 *  The number of attendees at the session cannot be greater than the total capacity of the room. 
	 */
	
	public String projectarSession(int attendees, int price) {
		
		double costo = 0d;
		String mensaje = "";
		
		if(this.attendees <= this.capacity) {
			costo = this.price * this.attendees;
			
			mensaje = costo + " euros have been collected. ";
		}else {
			mensaje = "Error, the cinema room has reached maximum capacity. ";
		}
		
		return mensaje;
	}
	
	public String calculateCostVigilance() {
		//hotel or hospital
		double guards = 0d;
		double cost = 0d;
		double actualArea = 3000;
		double payment = 1300;
		
		guards = super.getArea()/actualArea;
		cost = guards * payment;
		
		return " The cost of vigilance is " + cost + " euros. ";
		
	}
	
	//metodos propios
	
	public String toString() {
		return "The cinema " + super.getName() + " has " + super.getNumFloors() + " floors, with an area of " + super.getArea() + 
				" m2. Currently, it has " + this.attendees + " attendees. " + projectarSession(this.attendees,this.price) +  super.calculateCostVigilance() + super.clean(); 
	}
	
}

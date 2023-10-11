public class Hotel extends Edificio {
	
	//atributos
	private int rooms;
	
	//construtor
	public Hotel(String name, int numFloors, double area, int rooms) {
		super(name, numFloors, area);
		this.rooms = rooms;
		super.setBuildingID(3);
	}
	//getter
	
	public int getRooms() {
		return this.rooms;
	}
	//setter
	
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	//metodos generales
	/*
	 * In hotels, room service happens every day. It is estimated that each member of the service can attend to 20 rooms.
	 *  A method will be created that calculates and displays on the screen: 
	 *  a) How many people are needed to attend to the hotel's room service. 
	 *  b) What is the total required for the salaries of these people, 
	 *  taking into account that each person receives 1,000 euros per month. 
	 */
	
	public String calculateRoomServices() {

		int personnel = 0;
		int salary = 0;
		
		personnel = this.rooms / 20;
		salary = personnel * 1000;
		
		return "We would need " + personnel + " personnel to attend our hotel's room service, and their total salary per month is " + salary + ".";
	}
	
	public String calculateCostVigilance() {
		//hotel or hospital
		double guards = 0d;
		double cost = 0d;
		double actualArea = 1000;
		double payment = 1800;
		
		guards = super.getArea()/actualArea;
		cost = guards * payment;
		
		return " The cost of vigilance is " + cost + " euros. ";
		
	
	}
	
	//metodos propios
	
	public String toString() {
		return "The hotel " + super.getName() + " has " + super.getNumFloors() + " floor with an area of " + super.getArea() +
				"m2. It includes " + this.rooms + " rooms." + calculateRoomServices() + super.calculateCostVigilance() + super.clean();
	}
}

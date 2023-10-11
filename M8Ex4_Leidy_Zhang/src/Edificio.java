
public class Edificio {
	
	/*
	 * All buildings will have certain common data (name, number of floors, surface area (m²)) 
	 * that will be given when the building is created and will not be modified,
	 *  but it must be possible to access them to read them.
	 */
	
	//atributos
	private String name = "";
	private int numFloors = 0;
	private double area = 0d;
	private int buildingID;
	
	//constructor
	
	public Edificio(String name, int numFloors, double area){
		this.name = name;
		this.numFloors = numFloors;
		this.area = area;
	
		
	}
	
	//getter
	public int getBuildingID() {
		return this.buildingID;
	}
	public String getName() {
		return this.name;
	}
	
	public int getNumFloors() {
		return this.numFloors;
	}
	
	public double getArea() {
		return this.area;
	}
	
	//setter
	public void setBuildingID(int buildingID) {
		this.buildingID = buildingID;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNumFloors(int numFloors) {
		this.numFloors = numFloors;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	//metodos propios
	
	/*
	 * A clean() method will be created in the appropriate class, which will display on the screen the time it took to clean the building, 
	 * taking into account that it takes one minute to clean for every 5 m².
	 *  Also, if a building has more than one floor, it takes half a minute to go up from one floor to another. 
	 *  Therefore, we will add half a minute for each additional floor. One euro per day will be paid for each minute of work. 
	 *  Also, since it is cleaned every day, to get the monthly cost, 
	 *  we will have to multiply by 30 (this monthly cost will also be displayed on the screen) 
	 */
	
	public String clean() {
		double minutos = 0d;
		double extraMins = 0d;
		double totalTime = 0d;
		double monthlyCost = 0d;
		
		extraMins = this.numFloors * 0.5;
		minutos = this.area / 5;
		totalTime = minutos + extraMins;
		
		monthlyCost = totalTime * 30;
		
		return " The time it took to clean the building was " + totalTime + " mins. \n"
				+ "Its monthly cost is " + monthlyCost + " euros. ";
		
	}
	
	/*
	 * In addition, a method called calculateCostVigilance() will be implemented that will show how much it costs per month to hire security guards 
	 * in each building. It is considered that each hotel or hospital guard can guard 1000 m². 
	 * Therefore, if a building has an area of ​​5500 m², we will need 6 watchmen. 
	 * On the other hand, cinema security guards can monitor 3000 m². 
	 * Hiring each security guard costs the building owners 1,300 euros per month, 
	 * but hotel security guards charge a dangerousness bonus of 500 euros per month. 
	 */
	
	public String calculateCostVigilance() {
		//hotel or hospital
		double guards = 0d;
		double cost = 0d;
		double actualArea = 1000;
		double payment = 1300;
		
		guards = this.area/actualArea;
		cost = guards * payment;
		
		return " The cost of vigilance is " + cost + " euros. ";
		
	}
	
	//metodos generales
	
	public String toString() {
		return "The building " + this.name + " has " + this.numFloors + " with an area of " + this.area + " m2.";
	}
	

}

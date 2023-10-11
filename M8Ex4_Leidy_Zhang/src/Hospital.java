
public class Hospital extends Edificio{
	
	//atributos
	private int patients;
	
	
	
	//constructor
	
	public Hospital(String name, int numFloors, double area, int patients){
		super(name, numFloors, area);
		this.patients = patients;
		super.setBuildingID(1);

	}
	//getter
	
	public int getPatients() {
		return this.patients;
	}
	
	//setter
	
	public void setPatients(int patients) {
		this.patients = patients;
	}
	
	//metodos generales
	
	/*
	 * In the hospital, lunch is distributed to the sick three times a day. 
	 * There will be a distributeLunch() method in the appropriate place that will display,
	 *  when called, the message “xxx rations are being distributed” .
	 *   To get the number of rations, the number of patients must be multiplied by 3. 
	 *   The number of patients admitted to/from the hospital may vary over time, 
	 *   therefore access must be allowed to the corresponding attribute, 
	 *   both to read it and to modify it, even if not done directly. 
	 */
	
	public String distributeLunch() {
		int rations = 0;
		
		rations = this.patients * 3;
		
		return rations + " rations are being distributed. ";
	}
	
	//metodos propios
	
	public String toString() {
		return "The hospital has " + super.getName() + " has " + super.getNumFloors()+ " with an area of " + super.getArea() + " m2. With "
				+ this.patients + " patients. " + distributeLunch()  + super.calculateCostVigilance() + super.clean();
	}
}

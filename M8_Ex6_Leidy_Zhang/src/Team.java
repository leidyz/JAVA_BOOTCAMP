import java.util.ArrayList;

public class Team {

	//atributos
	String nameTeam;
	double budget;
	String country;
	ArrayList<Car> cars;
	ArrayList<Workers> workers;
	
	//constructor
	public Team(String nameTeam, double budget, String country) {
		this.nameTeam = nameTeam;
		this.budget = budget;
		this.country = country;
		cars = new ArrayList<Car>();
		workers = new ArrayList<Workers>();
		
	}
	//arraylist
	public ArrayList<Car> getCars() {
		return cars; 
	}
	
	public ArrayList<Workers> getWorkers() {
		return workers; 
	}
	
	public void setCars(ArrayList<Car> cars) {
		this.cars = cars ; 
	}
	
	public void setWorkers(ArrayList<Workers> workers) {
		this.workers = workers; 
	}
	//adding to arraylists
	
	public void addCars(Car car) {
		cars.add(car);
	}
	
	public void addWorkers(Workers worker) {
		workers.add(worker);
	}
	
	//getter
	
	public String getNameTeam() {
		return this.nameTeam; 
	}
	
	public double getBudget() {
		return this.budget; 
	}
	public String getCountry() {
		return this.country; 
	}
	
	
	//setter
	
	public void setNameTeam(String nameTeam) {
		this.nameTeam = nameTeam; 
	}
	
	public void setBudget(double budget) {
		this.budget = budget; 
	}
	public void setCountry(String country) {
		this.country = country; 
	}
	
	//metodos propios
	
	public String toString() {
		return "The team: " + this.nameTeam +
				"\n Budget: " + this.budget +
				"\n Country of origin: " + this.budget + 
				"\n The cars: " + this.getCars() +
				"\n The workers: " + this.getWorkers();
	}

	
}

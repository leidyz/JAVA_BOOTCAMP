
public class Pilots extends Workers{
	
	int height;
	int weight;
	

	public Pilots(String name, String last, int age, int time, int height, int weight) {
		super(name, last, age, time);
		this.height = height;
		this.weight = weight;
		addSalary();
		super.setType(1);
	
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public int getWeight() {
		return this.height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	//metodos generales
	public void addSalary() {
		super.salary = super.getSalary() + (10000 * super.getTime()) + 50000;
		
	}
	
	//metodos propios
	
	public String toString() {
		return "The pilot have the followind details: " +
				"\n Name: " + super.getName() +
				"\n Last name: " + super.getLast()  +
				"\n Age: " + super.getAge()  +
				"\n Seniority years: " + super.getTime() +
				"\n Salary: " + super.getSalary() +
				"\n Height: " + this.height +
				"\n Weight: " + this.weight + "\n";
	}


}

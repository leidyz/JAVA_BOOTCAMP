
public class Mechanics extends Workers {
	
	boolean degree;

	
	public Mechanics(String name, String last, int age, int time, boolean degree) {
		super(name, last, age, time);
		this.degree = degree; 
		super.setType(2);
		addSalary();
	}
	
	public boolean getDegree() {
		return this.degree;
	}
	
	
	public void setDegree(boolean degree) {
		this.degree = degree;
	}
	
	
	//metodos generales
	public void addSalary() {
			super.salary = super.getSalary() + (super.getTime() * 10000);		
	}
	
	//metodos propios
	public String toString() {
		return "The mechanics have the followind details: " +
				"\n Name: " + super.getName() +
				"\n Last name: " + super.getLast()  +
				"\n Age: " + super.getAge()  +
				"\n Seniority years: " + super.getTime() +
				"\n Salary: " + super.getSalary() +
				"\n Mechanics degree: " + this.degree + "\n" ;
	}
}

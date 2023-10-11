
public class Workers {
	String name;
	String last;
	int age;
	int time;
	int salary;
	int type;
	


	
	public Workers(String name, String last, int age, int time) {
		this.name = name;
		this.last = last;
		this.age = age;
		this.time = time;
		this.salary = 50000;
	
	}
	
	//getter
	public int getType() {
		return this.type;
	}

	public String getName() {
		return this.name ;
	}
	public String getLast() {
		return this.last ;
	}
	public int getAge() {
		return this.age;
	}
	public int getTime() {
		return this.time ;
	}
	public int getSalary() {
		return this.salary ;
	}
	
	//setter
	public void setType(int type) {
		this.type = type;
	}
	
	public void setName(String name ) {
		this.name = name;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public void setSalary(int salary) {
		this.salary = salary ;
	}
	
	//metodos propios

	public String toString() {
		return "The worker have the followind details: " +
				"\n Name: " + this.name  +
				"\n Last name: " + this.last  +
				"\n Age: " + this.age  +
				"\n Seniority years: " + this.time +
				"\n Salary: " + this.salary + 
				"\n " ;
	}

}

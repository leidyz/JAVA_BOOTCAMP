import java.util.ArrayList;
import java.util.Scanner;

public class Championship {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Team> teams = new ArrayList<Team>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int option = 0;
		
		do {
		System.out.println("Choose an option: \n"
				+ "1. Register a team \n"
				+ "2. De-register a team \n"
				+ "3. View drivers and mechanics \n"
				+ "4. View teams and cars \n"
				+ "5. Auto create teams \n"
				+ "0. Exit");
		
		option = sc.nextInt();
		sc.nextLine();
		
		switch(option) {
			case 1:
				register();
				break;
			case 2:
				deregister();
				break;
			case 3:
				viewWorkers();
				break;
			case 4:
				viewTeams();
				break;
			case 5:
				autoCreate();
		}
		
		}while(option != 0);
		
		System.out.println("Exit");

	}
	
	public static void autoCreate() {
		
		Team rex = new Team( "rex", 3500, "Mexico");
		Team dino = new Team( "dino", 2600, "Colombia");
		Team pez = new Team( "pez", 4100, "Ecuador");
		
		Car car1 = new Car(341, 26, "red", 56);
		Car car2 = new Car(342, 34, "blue", 78);
		Car car3 = new Car(343, 56, "silver", 98);
		Car car4 = new Car(344, 67, "black", 37);
		
		Pilots Joseline = new Pilots ("Joseline", "Franco", 27, 3, 170, 60);
		Pilots Eduardo = new Pilots ("Eduardo", "Sanchez", 33, 2, 178,70);
		Pilots Carlos = new Pilots ("Carlos", "Rodriguez", 30, 1, 180, 67);
		
		Mechanics Carla = new Mechanics ("Carla", "Sanchez", 30, 2, true);
		Mechanics Jesus = new Mechanics ("Jesus", "Ho", 33, 4, true);
		Mechanics James = new Mechanics ("James", "Oliver", 48, 6, false);
		
		rex.addCars(car1);
		rex.addCars(car2);
		rex.addWorkers(Joseline);
		rex.addWorkers(Carla);
		
		dino.addCars(car3);
		dino.addWorkers(Eduardo);
		dino.addWorkers(Jesus);
		
		pez.addCars(car4);
		pez.addWorkers(Carlos);
		pez.addWorkers(James);
		
		teams.add(pez);
		teams.add(rex);
		teams.add(dino);
		
	
		for(int i = 0; i < teams.size(); i++) {
			System.out.println(teams.get(i).toString());
			System.out.println();
		}
			
	}
	
	public static void register() {
		String team = "";
		double budget = 0d;
		String country = "";
		int optionCreate = 0;
		int power = 0;
		int speed = 0;
		String color = ""; 
		int price = 0;
		String name = "";
		String last = "";
		int age = 0;
		int time = 0;
		int height = 0;
		int weight = 0;
		int optionWorker = 0;
		boolean degree = false;
		
		System.out.println("Enter the following details to register a team: \n"
				+ "Name: ");
		team = sc.nextLine();
		
		System.out.println("Budget: ");
		budget = sc.nextDouble();
		
		System.out.println("Country of origin: ");
		country = sc.nextLine();
		sc.nextLine();
		
		Team newTeam = new Team(team, budget, country);
		teams.add(newTeam);
		
		do {
		
		System.out.println("What would you like to include? \n"
				+ "1. Cars \n"
				+ "2. Workers \n"
				+ "0. Back to main menu" );
		
		optionCreate = sc.nextInt();
		sc.nextLine();
		
		switch(optionCreate) {
		case 1:
			
			System.out.println("Introduce the power: ");
			power = sc.nextInt();
			
			System.out.println("Introduce the speed: ");
			speed = sc.nextInt();
			
			System.out.println("Introduce the color: ");
			color = sc.nextLine();
			sc.next();
			
			System.out.println("Introduce the market price: ");
			price = sc.nextInt();
			
			Car newCar = new Car(power, speed, color, price);
			newTeam.addCars(newCar);
			
			break;
		case 2:
			System.out.println("Introduce the details of the worker: ");
			
			System.out.println("Introduce the name: ");
			name = sc.nextLine();
			
			System.out.println("Introduce the last name: ");
			last = sc.nextLine();
			
			System.out.println("Introduce the age: ");
			age = sc.nextInt();
			
			System.out.println("Introduce the years of work experience: ");
			time = sc.nextInt();
			
			
			System.out.println("Which type of worker? \n"
					+ "1. Pilot \n"
					+ "2. Mechanic" );
			
			if(optionWorker == 1) {
			
				System.out.println("Introduce the height: ");
				height = sc.nextInt();
				
				System.out.println("Introduce the weight: ");
				weight = sc.nextInt();
				
				Pilots newPilot = new Pilots(name,last, age ,time , height, weight);
				newTeam.addWorkers(newPilot);
				System.out.println("Pilot worker created. ");
				
			}else if(optionWorker == 2) {
				
				System.out.println("Do the mechanic have a degree true/false: ");
				degree = sc.nextBoolean();
				Mechanics newMechanic = new Mechanics(name,last, age ,time , degree);
				newTeam.addWorkers(newMechanic);
				
				System.out.println("Mechanic worker created. ");
				
			}else {
			
				Workers newWorker = new Workers(name,last, age ,time);
				newTeam.addWorkers(newWorker);
				System.out.println("Normal worker created. ");
			}
			
		
			break;
			
			}
		}while(optionCreate != 0);
		
		
	}
	
	public static void deregister() {
		String name = "";
		int deletePosition = 0;
		
	
		System.out.println("Enter the following details to de-register a team: \n"
				+ "Name: ");
		name = sc.nextLine();
		
		deletePosition = findTeamPosition(name);
		
		if(deletePosition != -1) {
			teams.remove(deletePosition);
		}else {
			System.out.println("The team is not in our system.");
		}	
		
	}
	
	public static void viewWorkers() {
		String name = "";
		int viewPosition = 0;
		int optionView =0;
		int typePosition =0;
	
		System.out.println("Enter the following details to view the workers: \n"
				+ "Name of the team: ");
		name = sc.nextLine();
		
		viewPosition = findTeamPosition(name);
		
		
		if(viewPosition != -1) {
		
			System.out.println("Which type of workers would you like to see? \n"
					+ "1. View Pilots \n"
					+ "2. View Mechanics \n"
					+ "3. All workers \n"
					+ "0. Back to main menu");
			
			optionView = sc.nextInt();
			
			switch(optionView) {
			case 1:
				System.out.println("Pilots workers:");	
				typePosition = findWorkerPosition(viewPosition, 1);				
				System.out.println(teams.get(optionView).getWorkers().get(typePosition).toString());
				
				break;
			case 2:
				System.out.println("Mechanics workers:");
				typePosition = findWorkerPosition(viewPosition, 2);		
				System.out.println(teams.get(optionView).getWorkers().get(typePosition).toString());
				
				break;
			case 3:	
				System.out.println("All workers:");
				System.out.println(teams.get(optionView).getWorkers().toString());
				
				break;
			default:
				System.out.println("Error, please enter between 1 - 3");
			}
		
		}else {
			System.out.println("The team is not in our system.");
		}
		
	}

	public static void viewTeams() {
		String name = "";
		int viewPosition = 0;
	
		System.out.println("Enter the name of the team: ");
		name = sc.nextLine();
		
		viewPosition = findTeamPosition(name);
		
		if(viewPosition != -1) {
			System.out.println(teams.get(viewPosition).toString());
		}else {
			System.out.println("The team is not in our system");
		}
		
		
	}
	
	public static int findTeamPosition(String team) {
		int i = 0;
		int position = -1;
		boolean found = false;
		
		while(i < teams.size() && found == false) {
			if(teams.get(i).getNameTeam().equalsIgnoreCase(team)) {
				position = i;
				found = true;
			}
			i++;
		}
		return position;
	}
	
	public static int findWorkerPosition(int teamPosition, int type) {
		int i = 0;
		int position = -1;
		boolean found = false;
		
		while(i < teams.get(teamPosition).getWorkers().size() && found == false) {
			if(teams.get(teamPosition).getWorkers().get(i).getType() == type) {
				position = i;
				found = true;
			}
			i++;
		}
		return position;
	}

}

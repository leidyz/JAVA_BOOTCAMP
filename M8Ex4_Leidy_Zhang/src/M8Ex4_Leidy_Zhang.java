import java.util.ArrayList;
import java.util.Scanner;

public class M8Ex4_Leidy_Zhang {
	
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Edificio> buildings = new ArrayList<Edificio>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int building = 0;
		
		do {
		System.out.println("Choose the building you would like to see \n"
				+ "1. Hospital \n"
				+ "2. Cinema \n"
				+ "3. Hotel");
		
		building = sc.nextInt();
		
		
		switch(building) {
			case 1:
				verHospital();
				break;
			case 2:
				verCinema();
				break;
			case 3:
				verHotel();
				break;
			default:
				System.out.println("Error");
			}
		}while(building != 0);
		
	}
	
	public static void verHospital() {

		int optionHospital = 0;
		String nameHospital = "";
		int positionHospital = 0;
		int modifyPatients = 0;
		
		do {
		System.out.println("What would you like do with the hospitals: \n"
				+ "1. View the hospitals info \n"
				+ "2. Add a new hospital \n"
				+ "3. Delete a hospital "
				+ "4. Modify number of patients\n"
				+ "0. Go back to the main menu" );
		
		
		optionHospital = sc.nextInt();
		sc.nextLine();
		
		
		switch(optionHospital) {
		case 1:
			System.out.println("Introduce the name of hospital you would like to view");
			nameHospital = sc.nextLine();
			
			positionHospital = obtenerPosicion(nameHospital, 1);
			
			
			if(positionHospital != -1) {
				
				System.out.println(((Hospital) buildings.get(positionHospital)).toString());
				
			}else {
				System.out.println("Building not found.");
			}
			break;
		case 2:
			System.out.println("Introduce the details of the hospital you would like to add: \n"
					+ "Name: ");
			String name = sc.nextLine();
			sc.nextLine();
			
			System.out.println("Introduce how many floors it has");
			int floors = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Introduce the surface area");
			double area = sc.nextDouble();
			sc.nextLine();
			
			System.out.println("Introduce the number of patients");
			int patients = sc.nextInt();
			sc.nextLine();
			
			Hospital hospitals = new Hospital( name, floors, area, patients);
			buildings.add(hospitals);
			
					
			break;
		case 3:
			System.out.println("Introduce the name of the hospital you would like to delete: \n"
					+ "Name: ");
			name = sc.nextLine();
			
			positionHospital = obtenerPosicion(name, 1);
			
			if(positionHospital != -1) {
				System.out.println(buildings.remove(positionHospital));
			}else {
				System.out.println("Building not found.");
			}
			
			break;
		case 4:
			System.out.println("Introduce the name of the hospital you would like to modify: \n"
					+ "Name: ");
			name = sc.nextLine();
			
			positionHospital = obtenerPosicion(name, 1);
			
			if(positionHospital != -1) {
				System.out.println(((Hospital)buildings.get(positionHospital)).getPatients());
				System.out.println("Introduce the new numbers of patientes");
				modifyPatients = sc.nextInt();
				
				//(((Hospital) buildings.get(positionHospital)).toString());
				((Hospital) buildings.get(positionHospital)).setPatients(modifyPatients);
				System.out.println(((Hospital) buildings.get(positionHospital)).toString());
				
			}else {
				System.out.println("Building not found.");
			}
			
			break;
			
		default:
			System.out.println("Introduce a number between 1-4");
		}
		
		}while(optionHospital != 0);
		
	}
	
	public static void verCinema() {

		int optionCinema = 0;
		String nameCinema = "";
		int positionCinema = 0;
		
		do {
		System.out.println("What would you like do with the cinemas: \n"
				+ "1. View the cinemas info \n"
				+ "2. Add a new cinemas \n"
				+ "3. Delete a cinema \n"
				+ "0. Go back to the main menu" );
		
		optionCinema = sc.nextInt();
		sc.nextLine();
		
		switch(optionCinema) {
		case 1:
			System.out.println("Introduce the name of hospital you would like to view");
			nameCinema = sc.nextLine();
			
			positionCinema = obtenerPosicion(nameCinema, 2);
			
			if(positionCinema != -1) {
				System.out.println(((Cinema)buildings.get(positionCinema)).toString());
			}else {
				System.out.println("Building not found.");
			}
			break;
		case 2:
			System.out.println("Introduce the details of the cinema you would like to add: \n"
					+ "Name: ");
			String name = sc.nextLine();
			sc.nextLine();
			
			System.out.println("Introduce how many floors it has");
			int floors = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Introduce the surface area");
			double area = sc.nextDouble();
			sc.nextLine();
			
			System.out.println("Introduce the number of attendees");
			int attendees = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Introduce the number of attendees");
			int price = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Introduce the number of attendees");
			int capacity = sc.nextInt();
			sc.nextLine();
			
		
			Cinema cinemas = new Cinema(name, floors, area, attendees, price, capacity);
			buildings.add(cinemas);
					
			break;
		case 3:
			System.out.println("Introduce the name of the hospital you would like to delete: \n"
					+ "Name: ");
			name = sc.nextLine();
			
			positionCinema = obtenerPosicion(name, 2);
			
			if(positionCinema != -1) {
				System.out.println(buildings.remove(positionCinema));
			}else {
				System.out.println("Building not found.");
			}
			
			break;
			
		default:
			System.out.println("Introduce a number between 1-4");
		}
		
		}while(optionCinema != 0);
		
	}
	
	public static void verHotel() {

		int optionHotel = 0;
		String nameHotel = "";
		int positionHotel = 0;
		
		do {
		System.out.println("What would you like do with the cinemas: \n"
				+ "1. View the cinemas info \n"
				+ "2. Add a new cinemas \n"
				+ "3. Delete a cinema \n"
				+ "0. Go back to the main menu" );
		
		optionHotel = sc.nextInt();
		
		switch(optionHotel) {
		case 1:
			System.out.println("Introduce the name of hospital you would like to view");
			nameHotel = sc.nextLine();
			
			positionHotel = obtenerPosicion(nameHotel, 3);
			
			if(positionHotel != -1) {
				System.out.println(((Hotel)buildings.get(positionHotel)).toString());
			}else {
				System.out.println("Building not found.");
			}
			break;
		case 2:
			System.out.println("Introduce the details of the hotel you would like to add: \n"
					+ "Name: ");
			String name = sc.nextLine();
			sc.nextLine();
			
			System.out.println("Introduce how many floors it has");
			int floors = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Introduce the surface area");
			double area = sc.nextDouble();
			sc.nextLine();
			
			System.out.println("Introduce the number of rooms");
			int rooms = sc.nextInt();
			sc.nextLine();
			
			
			Hotel hotels = new Hotel(name, floors, area, rooms);
			buildings.add(hotels);
					
			break;
		case 3:
			System.out.println("Introduce the name of the hotel you would like to delete: \n"
					+ "Name: ");
			name = sc.nextLine();
			
			positionHotel = obtenerPosicion(name, 3);
			
			if(positionHotel != -1) {
				System.out.println(buildings.remove(positionHotel));
			}else {
				System.out.println("Building not found.");
			}
			
			break;
			
		default:
			System.out.println("Introduce a number between 1-4");
		}
		
		}while(optionHotel != 0);
	}
	
	public static int obtenerPosicion(String buildingName, int buildingType) {
		int posicion = -1;
		int i = 0;
		boolean encontrado = false;
		
		while(i < buildings.size() && encontrado == false) {

			if(buildings.get(i).getName().equalsIgnoreCase(buildingName) && buildings.get(i).getBuildingID() == buildingType ) {
				encontrado = true;
				posicion = i;
				
			}
			i++;
		}return posicion;
	}
	

}

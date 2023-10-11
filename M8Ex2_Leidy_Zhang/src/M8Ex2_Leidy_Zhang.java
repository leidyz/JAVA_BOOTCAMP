import java.util.ArrayList;
import java.util.Scanner;

public class M8Ex2_Leidy_Zhang {


		private static ArrayList<Hotel> hoteles = new ArrayList<Hotel>();
		
		private static Scanner entrada = new Scanner(System.in); //para no volver a reperirlo

		public static void main(String[] args) {
			menu();
		}	
		
		public static void menu() {
			
		// Creamos el --Menu-- para el usuario (con do while & switch):	
			int opcion = 0;
			
			do {
				System.out.println("-----Menu----- \n"
						+ "1. crearHotel \n"
						+ "2. verHotel \n"
						+ "3. modificarHotel \n"
						+ "4. darDeBaixaHotel \n"
						+ "0. Salir \n"
						+ "Seleccione la opcion que prefieres ejecutar:" );
				
							
				opcion = entrada.nextInt();
				
				switch(opcion) {
				case 1:
					crearHotel();
					break;
					
				case 2:
					verHotel();
					break;
					
				case 3:
					modificarHotel();
					break;
					
				case 4:
					darDeBajaHotel();
					break;
					
				default:
					System.out.println("Error");
						
				}
			}while (opcion != 0);
			System.out.println("Fin");
			
		}
		
		/* Ejecutamos el Menu, dependiendo de que opcion eleje el usuario.
		1. Creamos el Hotel con sus atributos y lo añadimos en ArrayList:*/
		
		public static void crearHotel() {
			
			String nombre = "";
			int numeroHabitaciones = 0;
			int numeroPlantas = 0;
			double superficieTotal = 0.0f;
			

			System.out.println("Ingrese el nombre del hotel: ");
			nombre = entrada.nextLine();
			entrada.nextLine();

			System.out.println("Ingrese el número de habitaciones: ");
			numeroHabitaciones = entrada.nextInt();

			System.out.println("Ingrese el número de plantas: ");
			numeroPlantas = entrada.nextInt();

			System.out.println("Ingrese la superficie total del hotel: ");
			superficieTotal = entrada.nextDouble();
			
			//Constructor con parametros:
			Hotel hotel = new Hotel(nombre, numeroHabitaciones, numeroPlantas, superficieTotal);
			
			//ArrayList:
			hoteles.add(hotel);
			entrada.nextLine();
		}	
		
		/*2. Menu verHotel: veamos el hotel creado con sus atributos asignados
		previamente & ejecutamos los calculos de su mantenimiento (datos del mantenimiento vienen del Clase Hotel)*/
		
		public static void verHotel() {
			
			String nombre = "";
			int posicionHotel = 0;
			
			
			System.out.println("Introduce el nombre del hotel");
			entrada.next();
			nombre =entrada.nextLine();
			
			posicionHotel = obtenerPosicion(nombre);
			if(posicionHotel != -1) {
				System.out.println("Los datos del hotel son los siguientes:");
				System.out.println(hoteles.get(posicionHotel).toString());
				hoteles.get(posicionHotel).calcularMantenimiento();
			}else {
				System.out.println("El hotel no existe");
			}
			
		}
		/*3. Menu modificarHotel: con el hotel creado ofrecemos los 3 atributos a modificar. 
		 * Condicional (for & Switch)*/	
		
		public static void modificarHotel() {
	    
	        String modificarNombre = "";
	        int opcionModificar = 0; 
	        int nuevoNumeroHabitaciones = 0;
	        int nuevoNumeroPlantas = 0;
	        double nuevaSuperficieTotal = 0.0f;
	        int posicionModificar = 0;
	        
	        System.out.println("Introduce el nombre del hotel que quieres modificar");
	        modificarNombre = entrada.nextLine();
	        
	        posicionModificar = obtenerPosicion(modificarNombre);
	        
	        if(posicionModificar != -1) {
	        	System.out.println("¿Qué atributo desea modificar? \n"
	        			+ "1. Número de habitaciones \n"
	        			+ "2. Número de plantas \n"
	        			+ "3. Superficie total");
                opcionModificar = entrada.nextInt();
                
                switch (opcionModificar) {
                case 1:
                    System.out.println("Ingrese el nuevo número de habitaciones: ");
                    nuevoNumeroHabitaciones = entrada.nextInt();
                    hoteles.get(posicionModificar).setHabitaciones(nuevoNumeroHabitaciones);
                    break;
                    
                case 2:
                    System.out.println("Ingrese el nuevo número de plantas: ");
                    nuevoNumeroPlantas = entrada.nextInt();
                    hoteles.get(posicionModificar).setPisos(nuevoNumeroPlantas);
                    break;
                    
                case 3:
                    System.out.println("Ingrese la nueva superficie total: ");
                    nuevaSuperficieTotal = entrada.nextDouble();
                    hoteles.get(posicionModificar).setSuperficie(nuevaSuperficieTotal);
                    break;
                    
                default:
                    System.out.println("Opción inválida.");
                    break;
                }
                
            System.out.println("Hotel modificado exitosamente.");
	        	
	        }else {
	        	System.out.println("El hotel introducido no existe");
	        }
	      
	    }
		/*4. Menu darDeBajaHotel: damos de baja el hotel creado. 
		 * Condicional & for, if */
		public static void darDeBajaHotel() {
		
			String bajaHotel = "";
			int posicionBaja = 0;
			
			System.out.println("Introduce el hotel que quieres dar de baja");
			entrada.next();
			bajaHotel = entrada.nextLine();
			
			posicionBaja = obtenerPosicion(bajaHotel);
			
			if(posicionBaja != -1) {
				hoteles.remove(posicionBaja);
				System.out.println("Hotel dado de baja exitosamente.");
			}else {
				System.out.println("El hotel introducido no existe");
			}

		}
		
		public static int obtenerPosicion(String nombre) {
			int i = 0;
			boolean encontrado = false;
			int posicion = -1;
			
			while(i < hoteles.size() && encontrado == false) {
				if(hoteles.get(i).getNombre().equalsIgnoreCase(nombre)) {
					encontrado = true;
					posicion = i;
				}
				i++;
			}
			return posicion;
		}
	}




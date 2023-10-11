
public class Hotel {
/*
 * 
La clase hotel deberá tener los siguientes atributos: nombre, número de habitaciones, número de plantas y superficie total del hotel. 
Como métodos sólo tendrá que tener los getters y setters propios de la clase y un método llamado calcularMantenimiento(). 
Este método debe tener en cuenta que cada persona del servicio puede atender a 20 habitaciones y 
deberá mostrar cuántas personas son necesarias para atender el servicio de habitaciones del hotel y 
cuál es el coste total destinado al servicio sabiendo que estas personas cobran 1.500. € al mes.
 */
	private String nombre = "";
	private int habitaciones = 0;
	private int pisos = 0;
	private double superficie = 0;
	
	//constructor
	
	public Hotel(String nombre, int habitaciones, int pisos, double superficie) {
		this.nombre = nombre;
		this.habitaciones = habitaciones;
		this.pisos = pisos;
		this.superficie = superficie;
	}
	
	//getter
	
	public String getNombre() {
		return this.nombre;
		}
		
	public int getHabitaciones() {
		return this.habitaciones;
		}
		
	public int getPisos() {
		return this.pisos;
		}
		
	public double getSuperficie() {
		return this.superficie;
		}
	
	//setter
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	}
	
	public void setPisos(int pisos) {
		this.pisos = pisos;
	}
	
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	
	
	
	//metodo
	/*
	 *  un método llamado calcularMantenimiento(). 
Este método debe tener en cuenta que cada persona del servicio puede atender a 20 habitaciones y 
deberá mostrar cuántas personas son necesarias para atender el servicio de habitaciones del hotel y 
cuál es el coste total destinado al servicio sabiendo que estas personas cobran 1.500. € al mes.
	 */

	
	public void calcularMantenimiento() {

		int numeroPersonas = this.habitaciones / 20; 
        double costoTotal = numeroPersonas * 1500; 

        System.out.println("Número de personas necesarias para el mantenimiento: " + numeroPersonas);
        System.out.println("Costo total mantenimiento: " + costoTotal + "€");
	}
	
	
	 public String toString() {
	     return "Nombre: " + this.nombre +
	               "\nNúmero de habitaciones: " + this.habitaciones +
	               "\nNúmero de plantas: " + this.pisos +
	               "\nSuperficie total: " + this.superficie;    
	    }
	
	
}

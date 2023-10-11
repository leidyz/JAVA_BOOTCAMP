import java.util.Date;
import java.util.GregorianCalendar;

public class Trabajador {
	String nombre;
	int sueldo;
	Date alta;
	
	public Trabajador(String nombre, int sueldo, int any, int mes, int dia) {
		this.nombre= nombre;
		this.sueldo = sueldo;
		GregorianCalendar calendario = new GregorianCalendar(any, (mes -1), dia);
		this.alta = calendario.getTime();
		
	}
	
	//getter
	public String getNom() {
		return this.nombre;
	}
	public int getSueldo() {
		return this.sueldo;
	}
	public Date getAlta() {
		return this.alta;
	}
	
	//setter
	public void setNom(String nombre) {
		this.nombre = nombre;
	}
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	public void setAlta(int any, int mes, int dia) {
		GregorianCalendar calendario = new GregorianCalendar(any, (mes -1), dia);
		this.alta = calendario.getTime();
	}
	
	//metodo general
	
	public int compareTo(Object miObjeto) {
		Trabajador otroTrabajador = (Trabajador) miObjeto;
		
		if (this.sueldo < otroTrabajador.sueldo) {
			return -1;
		}else if (this.sueldo > otroTrabajador.sueldo) {
			return 1;	
		}else {
		return 0;
		}
	}
	
	//metodo propio
	
	public String toString() {
		return "El trbajador, " + this.nombre + "tiene un sueldo de " + this.sueldo + "si se dio de alta: " + this.getAlta();
	}
}

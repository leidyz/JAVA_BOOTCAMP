import java.util.ArrayList;

public class Cliente{
	
	//atributos
	String nombre;
	String apellido;
	private ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();
	
	public Cliente (String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		cuentas = new ArrayList<Cuenta>();
	}
	
	//getter
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public ArrayList<Cuenta> getCuentas(){
		return cuentas;
	}
	
	//setter
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void setCuentas(ArrayList<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}
	
	
	//metodos generales

	public void agregarCuenta(Cuenta cuenta) {
		cuentas.add(cuenta);
	}
	
	public void eliminarCuenta (Cuenta cuenta) {
		cuentas.remove(cuenta);
	}
	
	
	//metodo propio
	
	public String toString() {
		return "El cliente se llama " + this.nombre + " " + this.apellido + " y sus cuentas son " + cuentas;
	}

}

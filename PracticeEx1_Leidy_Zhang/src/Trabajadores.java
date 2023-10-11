import java.util.ArrayList;

public class Trabajadores {
	/*
	 * Una llamada Trabajadores, que poseerá de los atributos id, nombre, apellido y
uniformidad. Este último debe almacenar los diferentes artículos que posee
mediante strings. Ejemplo: zapatos, chaquetas, etc…
También aparte de los métodos propios getter y setter, debe disponer de un método
llamado “informar” que devolverá toda la información del trabajador, incluyendo el
listado de artículos. Ejemplo: Mi nombre es Joan Ventura, soy un trabajador y tengo:
chaqueta, pantalón.
	 */
	
	//atributes
	
	private int id;
	static private int siguienteID = 1;
	private String nombre;
	private String apellido;
	private ArrayList<Uniformes> uniforme;
	
	//constructor
	public Trabajadores(String nombre, String apellido, ArrayList<String> uniforme) {
		this.id = this.siguienteID;
		this.siguienteID = (++this.id);
		this.nombre = nombre;
		this.apellido = apellido;
		this.uniforme = new ArrayList<Uniformes>();
		
	}
	//getter
	public int getID() {
		return this.id;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public ArrayList<Uniformes> getUniforme() {
		return this.uniforme;
	}
	//setter
	
	public void setID(int id) {
		this.id = id;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void setUniforme(ArrayList<Uniformes> uniforme) {
		this.uniforme = uniforme;
	}
	
	//metodo propio
	
	public String informar() {
		return "Mi nombre es " + this.nombre + " " + this.apellido + " con el id " + this.id + ". Soy un trabajador y tengo:\n"
				+ this.uniforme;
	}
	

}

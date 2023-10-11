
public class Cliente {
/*
 * La clase Cliente dispondrá de los siguientes atributos: id, nombre, 1er apellido, 2º apellido (opcional),
dirección, teléfono, e-mail y comentarios. También los métodos Getters y Setters correspondientes.
 */
	//atributos
	private int id;
	static private int idSiguiente = 1;
	private String nombre;
	private String apellido;
	private String direccion;
	private String email;
	private String comentarios;
	
	//constructor
	public Cliente(String nombre, String apellido, String direccion, String email, String comentarios) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.email = email;
		this.comentarios = comentarios;
		this.id = this.idSiguiente;
		this.idSiguiente = (++this.id);
				
	}
	//getter
	public int getId() {
		return this.id;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getApellido() {
		return this.apellido;
	}
	public String getDireccion() {
		return this.direccion;
	}
	public String getEmail() {
		return this.email;
	}
	public String getComentarios() {
		return this.comentarios;
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
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = email;
	}
	
	//metodos propios
	public String toString() {
		return "Soy un cliente con el id " + this.id + " me llamo " + this.nombre + " " + this.apellido +
				" con en el domicilio en " + this.direccion + ". Mi correo es:  " + this.email +
						 " y mis comentarios son: " + this.comentarios + ".";
	}
}

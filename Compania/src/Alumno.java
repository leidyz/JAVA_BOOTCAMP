
public class Alumno extends Usuario {

	private String nom = "";
	private String cognom = "";
	String asignatura;
	
	public Alumno(String nom, String cognom,String asignatura) {
		this.nom = nom;
		this.cognom = cognom;
		this.asignatura = asignatura;
	}
	
	//getter
	public String getNom() {
		return this.nom;
	}
	public String getCognom() {
		return this.cognom;
	}
	public String getAsignatura() {
		return this.asignatura;
	}
	
	//setter
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setCognom(String cognom) {
		this.cognom = cognom;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	
	//Metodos generales
	public boolean login(String user,String clau) {
		final String USUARIO = "alumno";
		final String CLAVE = "123456";
		boolean respuesta = false;
		if(user.equalsIgnoreCase(USUARIO) && clau.equalsIgnoreCase(CLAVE)) {
			respuesta = true;
		} else {
			respuesta = false;
		}
		return respuesta;
	}
}

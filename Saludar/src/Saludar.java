
public class Saludar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lamaremos la funcion
		String nom = "leidy";
		String respuesta = saludar("leidy");
		System.out.println("el pc ha dicho: " + respuesta);
		
		saludar("pepe");
		saludar("karla");
		
		System.out.println(nom);

	}

	public static String saludar(String nom) { //nunca poner metodos de salida ni de entrada, a menos que lo pidan explicitamente
		//System.out.println("hola clase!! mi nombre es " + nom);
		//nom = "maria";
		return "hola clase! mi nombre es " + nom;
	}
}

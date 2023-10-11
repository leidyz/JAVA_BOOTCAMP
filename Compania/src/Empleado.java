
public class Empleado {
	//Atributs
		private int id = 0;
		static private int idSiguiente = 0;
		private String nom = "";
		private String cognom = "";
		private int sou = 0;
		private String categoriaLaboral = "";
		
		//Constructor
		public Empleado(String nom, String cognom,int sou, String categoriaLaboral) {
			this.id = this.idSiguiente;
			this.idSiguiente = ++this.id;
			this.nom = nom;
			this.cognom = cognom;
			this.sou = sou;
			this.categoriaLaboral = categoriaLaboral;
		}
		
		//getter
		public int getId() {
			return this.id;
		}
		public String getNom() {
			return this.nom;
		}
		public String getCognom() {
			return this.cognom;
		}
		public int getSou() {
			return this.sou;
		}
		public String getCategoriaLaboral() {
			return this.categoriaLaboral;
		}
		
		//setter
		public void setNom(String nom) {
			this.nom = nom;
		}
		public void setCognom(String cognom) {
			this.cognom = cognom;
		}
		public void setSou(int sou) {
			this.sou = sou;
		}
		public void setCategoriaLaboral(String categoriaLaboral) {
			this.categoriaLaboral = categoriaLaboral;				
		}
		
		//Metodo general
		public void anadirPlus(int porcentage) {
			this.sou += ((this.sou * porcentage) / 100);
		}
		
		final public String berrear() {
			return"Arggggsfagsgsf";
		}
		
		public boolean login(String user,String clau) {
			System.out.println("Soy un empleado y me estoy identificando con " +
		user + " y " + clau);
			return true;
		}
		
		//Metodo propio
		public String toString() {
			return "Soy un empleado con el id " + this.id + " me llamo " + this.nom + " " + this.cognom +
					" con un sueldo de " + this.sou + " euros anuales y desarrollo"
							+ " mi trabajo como " + this.categoriaLaboral;
		}

}
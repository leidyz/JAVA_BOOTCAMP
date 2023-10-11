
public class Encargado extends Empleado {
	
	//Atributos
		int plus;
		
		//Constructor
		public Encargado(String nom, String cognom,int sou, String categoriaLaboral, int plus) {
			super(nom, cognom,sou, categoriaLaboral);
			this.plus = plus;
		}
		
		//getter
		public int getPlus() {
			return this.plus;
		}
		//setter
		public void setPlus(int plus) {
			this.plus = plus;
		}
		
		//Metodo general
			public void anadirPlus() {
				super.setSou((super.getSou() + this.plus));
			}
			
			/*public String berrear() {
				return "Zzzzzzzzzzz";
			}*/
			
	    //Metodo propio
			public String toString() {
				return "Soy un encargado/a con el id " + super.getId() + " me llamo " +
			super.getNom() + " " + super.getCognom() + " con un sueldo de " + 
						super.getSou() + " euros anuales y desarrollo"
								+ " mi trabajo como " + super.getCategoriaLaboral();
			}
}

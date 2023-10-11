
public class Vehiculo implements Vehiculos {
	//atributos
		String color;
		String marca;
		String model;
		int velocidad;
		
		public Vehiculo(String color, String marca, String model) {
			this.color = color;
			this.marca = marca;
			this.model = model;
			
			
		}
		
		//getter
		
		public String getColor() {
			return this.color;
		}
		
		public String getMarca() {
			return this.marca;
		}
		
		public String getModel() {
			return this.model;
		}
		
		public int getVelocidad() {
			return this.velocidad;
		}
		//setter
		
		public void setColor(String color) {
			this.color = color;
		}
		
		public void setMarca(String marca) {
			this.marca = marca;
		}
		
		public void setModel(String model) {
			this.model = model;
		}
		
		public void setVelocidad(int velocidad) {
			this.velocidad = velocidad;
		}
		
		//metodos generales
		
		public void arrancar() {
			this.velocidad += 10;
		}
		
		public void parar() {
			this.velocidad = 0;
		}
		
		public String claxon() {
			return "Mooooc";
		}
		
		//metodos propios
		
		public String toString() {
			return "El vehiculo tiene" + this.color + " de la marca " + this.marca + " con el modelo " + this.model + ". \n"
					+ " Con una velocidad de " + this.velocidad + " km/h.";
		}
}

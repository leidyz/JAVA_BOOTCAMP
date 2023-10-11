
public class Moto extends Vehiculo implements Vehiculos, Electric {
	
	//atributos
	int maletas;
	
	//constructor
	public Moto(String color, String marca, String model, int maletas) {
		super (color, marca, model);
		this.maletas = maletas;
	}
	
	//getter
	
	public int getMaletas() {
		return this.maletas;
	}
	//setter
	
	public void setMaletas(int maletas) {
		this.maletas = maletas;
	}
	
	//metodos generales
	
	public void arrancar() {
		this.velocidad += 6;
	}
	
	public void parar() {
		this.velocidad = 0;
	}
	
	public String claxon() {
		return "Mac mac";
	}
	
	public String electric() {
		return  "Estoy cargando la moto";
	}
	
	//metodos propios
	public String toString() {
		return "La moto tiene" + super.getColor() + " de la marca " + super.getMarca() + " con el modelo " + super.getModel() + ". \n"
				+ " Con una velocidad de " + super.getVelocidad() + " km/h. Con " + this.maletas  + " maletas." ;
	}

}


public class Camion extends Vehiculo implements Vehiculos{

	//atributos
	int carga;
	
	//constructor
	public Camion(String color, String marca, String model, int carga) {
		super (color, marca, model);
		this.carga = carga;
		
	}
	
	//getter
	public int getCarga() {
		return this.carga;
	}
	
	//setter
	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	
	//metodos generales
	public void arrancar() {
		this.velocidad += 13;
	}
	
	public void parar() {
		this.velocidad = 0;
	}
	
	public String claxon() {
		return "Tuuu tuuu";
	}
	
	//metodos propios
	public String toString() {
		return "El camion tiene" + super.getColor() + " de la marca " + super.getMarca() + " con el modelo " + super.getModel() + ". \n"
				+ " Con una velocidad de " + super.getVelocidad() + " km/h. Con " + this.carga  + " de carga." ;
	}

	
}

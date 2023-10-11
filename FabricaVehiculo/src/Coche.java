
public class Coche extends Vehiculo implements Vehiculos, Electric  {

	//atributos
	boolean ac;
	
	//constructor
	public Coche(String color, String marca, String model, boolean ac) {
		super (color, marca, model);
		this.ac = ac;
	}
	
	//getter
	public boolean getAc() {
		return this.ac;
	}
	
	//setter
	
	public void setAc(boolean ac) {
		this.ac = ac;
	}
	
	//metodos generales
	
	public void arrancar() {
		this.velocidad += 15;
	}
	
	public void parar() {
		this.velocidad = 0;
	}
	
	public String claxon() {
		return "Mic mic";
	}
	
	public String electric() {
		return  "Estoy cargando el vehiculo";
	}
	
	//metodos propios
	
	public String toString() {
		return "El vehiculo tiene" + super.getColor() + " de la marca " + super.getMarca() + " con el modelo " + super.getModel() + ". \n"
				+ " Con una velocidad de " + super.getVelocidad() + " km/h. Aire condicionado: " + this.ac  ;
	}
	
}

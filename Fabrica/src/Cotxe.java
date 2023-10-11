
public class Cotxe {
	//variable vacias; que representen los atributos de un coche
	//atributos
	String modelo = "";
	String color = "";
	String marca = "";
	boolean descapotable = false;
	int cilindrada = 0;
	int velocidad = 0;
	
			
	
	//metodo constructor
	//normas del constructor, sera publico, pero nunca devolvera nada
	//siempre se llamara iguala la clase;
	//menos a mas en constructor
	public Cotxe(String color, String modelo, String marca, int cilindrada) {
		//sintaxis para que los parametros se asignen a cada uno de los atributos
		this.color = color;
		this.modelo = modelo;
		this.marca = marca;
		this.descapotable = false;
		this.cilindrada = cilindrada;
	}
	public Cotxe(String color, String modelo, String marca, boolean descapotable, int cilindrada) {
		//sintaxis para que los parametros se asignen a cada uno de los atributos
		this.color = color;
		this.modelo = modelo;
		this.marca = marca;
		this.descapotable = descapotable;
		this.cilindrada = cilindrada;
	}
	
	//intermediarios
	//getter: para acceder a los valores
	public String getColor() {
		return this.color;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public boolean getDescapotable() {
		return this.descapotable;
	}
	
	public int getCilindrada() {
		return this.cilindrada;
	}
	
	protected int getVelocidad() {
		return this.velocidad;
	}
	
	//setter: para dar, entonces son void
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setDescapotable(boolean descapotable) {
		this.descapotable = descapotable;
	}
	
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	
	//Metodos generales


	public void acelerar() {
		this.velocidad += 10;
		}


	public void frenar() {
		this.velocidad -= 5;	
		}
	
	
		
	//metodos propios

	public String presentarse() {
		
		return "Soy un coche de color " + this.color + " de la marca " + this.marca + " y  del modelo " + this.modelo +"\n"
				+ "con una cilindrado de " + this.cilindrada + " c.c., y soy descabotable " + this.descapotable + "\n"
						+ "y circulando a " + this.velocidad + "km/h.";
	}

}
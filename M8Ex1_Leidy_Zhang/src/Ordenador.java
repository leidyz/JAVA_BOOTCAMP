
public class Ordenador {
	/*
	 * Crea un nuevo proyecto Java con una clase llamada "Ordenador", además de la clase que contiene el main.
	Esta clase tendrá como atributos la marca, modelo, procesador, cantidad de memoria RAM y capacidad del disco duro.
	La aplicación debe poder generar ordenadores de diferentes formas:
	Solo a partir de la marca y el modelo.
	Indicando todos los atributos.
	La clase Ordenador debe disponer de los siguientes métodos:
	
	Métodos que permitan consultar cada uno de los atributos.
	Métodos que permitan modificar el procesador, la cantidad de memoria ramo y la capacidad del disco duro.
	Un método que recibirá un string por parámetro y devolverá un string que diga: 
	"En estos momentos se está ejecutando: 'X'" (X es el parámetro recibido por el método y 
	que normalmente será el nombre de un programa) Ejemplo: " En estos momentos se está ejecutando: Eclipse"
	Un método que devolverá una descripción completa del ordenador (toString()).
	En el main del proyecto crea ordenadores de las 2 formas posibles y comprueba que los métodos creados funcionan correctamente.
	 */
	 String marca;
     String modelo;
     String procesador;
     int memoriaRAM;
     int discoDuro;
   
     
     //contructor pequeno
     public Ordenador(String marca, String modelo) {
    	 this.marca = marca;
    	 this.modelo = modelo;
    	 this.procesador = "";
    	 this.memoriaRAM = 0;
         this.discoDuro = 0;
     }
    //constructor: Indicando todos los atributos.	
     public Ordenador(String marca, String modelo, String procesador, int memoriaRAM, int discoDuro){
         this.marca = marca;
         this.modelo = modelo;
         this.procesador = procesador;
         this.memoriaRAM = memoriaRAM;
         this.discoDuro = discoDuro;
     
     }
    
     
     //getter :Métodos que permitan consultar cada uno de los atributos.
     public String getMarca() {
    	 return this.marca;
     }
     
     public String getModelo() {
    	 return this.modelo;
     }
     
     public String getProcesador() {
    	 return this.procesador;
     }
     
     public int getMemoriaRAM() {
    	 return this.memoriaRAM;
     }
     
     public int getDiscoDuro() {
    	 return this.discoDuro;
     }
     
     //setter: Métodos que permitan modificar el procesador, la cantidad de memoria ramo y la capacidad del disco duro.
     
     public void setProcesador(String procesador) {
    	 this.procesador = procesador;
     }
     
     public void setMemoriaRAM(int memoriaRAM) {
    	 this.memoriaRAM = memoriaRAM;
     }
     
     public void setDiscoDuro(int discoDuro) {
    	 this.discoDuro = discoDuro;
     }
     
     //metodos propios
     //Un método que recibirá un string por parámetro y devolverá un string que diga:
     //"En estos momentos se está ejecutando: 'X'" (X es el parámetro recibido por el método y 
 	//que normalmente será el nombre de un programa) Ejemplo: " En estos momentos se está ejecutando: Eclipse"
   
     
     public String programa(String programa) { 
    	 return "En estos momentos se está ejecutando: " + programa; 
     }
     
    // Un método que devolverá una descripción completa del ordenador (toString()).
     
     public String toString() {
    	 return "El ordenador de modelo, " + this.modelo + ", es de la marca " + this.marca + ". Tiene un procesador " + this.procesador +"\n"
    	 		+ "con una memoria RAM de " + this.memoriaRAM + "GB y una capacidad de disco duro de " + this.discoDuro + "TB.";
     
     }
	
}

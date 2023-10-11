
public class Presupuesto {
 /*
  *La clase Presupuesto dispondrá de los siguientes atributos: id, concepto, valor e iva. También los
	métodos Getters y Setters correspondientes.
	Como métodos, deberemos elaborar los correspondientes Getters y Setters propios de la clase y
  */
	
	//atributos
	private String concepto;
	private double valor;
	private int iva;
	private int numFactura;
	private int numFacturaSiguiente =100;
	
	//constructor
	public Presupuesto(String concepto, double valor, int iva ) {
		this.numFactura = this.numFacturaSiguiente;
		this.numFacturaSiguiente = (++this.numFactura);
		this.concepto = concepto;
		this.valor = valor;
		this.iva = iva;
	}
	//getter
	public int getNumFactura() {
		return this.numFactura;
	}
	
	public String getConcepto() {
		return this.concepto;
	}
	public double getValor() {
		return this.valor;
	}
	public int getIVA() {
		return this.iva;
	}
	
	//setter
	public void setNumFactura(int numFactura) {
		this.numFactura = numFactura;
	}
	
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public void setIVA(int iva) {
		this.iva = iva;
	}
	//metodos generales
	/*
	 * un método particular llamado generarPresupuesto(). Este método debe recibir el concepto,
	valor e IVA, para poder devolver un presupuesto como el ejemplo:
	20 h. de desarrollo web -> 1000 Euros
	Subtotal = 1000 Euros
	Iva(21%) = 210 Euros
	Total = 1210 Euros 
	 */
	public static String generarPresupuesto(double valor, int iva) {
		double masIva = 0d;
		double total = 0d;
		
		masIva = valor * iva;
		total = valor + masIva;
		
		return "Detalles de presupuesto: \n"
				+ "Precio del producto " + valor 
				+ "\n Subtotal: "+ valor 
				+ "\n Iva( "+ iva + " ) :  " + masIva + "\n"
				+ "\n Total:  "+ total ;
	}
	//metodos propios
	public String toString() {
		return "La facturca numero " + this.numFactura + "con el concepto de " + this.concepto + "tiene un precio de " +
	            this.valor + " con un iva de " + this.iva + ". \n"+  generarPresupuesto(this.valor, this.iva);
	}
}

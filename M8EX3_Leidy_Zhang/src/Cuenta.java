
public class Cuenta{
	private int numCuenta;
	static private int numCuentaSiguiente;
	private double saldo;
	
	
	//constructor
	public Cuenta() {
		this.numCuenta = this.numCuentaSiguiente;
		this.numCuentaSiguiente = (++this.numCuenta);
		this.saldo = 0;
	}
	//getter
	public int getNumCuenta() {
		return this.numCuenta;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	//setter
	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	//metodos generales
	public double depositar(double cantidad) {
		return saldo = saldo + cantidad;
	}
	
	public double retirar(double cantidad) {
		return saldo = saldo - cantidad;
	}
	
	//metodos propios
	
	public String toString() {
		return "La cuenta " + this.numCuenta + " tiene un saldo de " + this.saldo + " euros.";
	}
	

}

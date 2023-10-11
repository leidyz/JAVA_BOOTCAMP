import java.util.ArrayList;
import java.util.Scanner;

public class M8EX3_Leidy_Zhang {

	static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int opcion = 0;
		
		do {
			System.out.println("Menu \n"
					+ "0. Salir de la aplicacion \n"
					+ "1. Crear cliente \n"
					+ "2. Eliminar cliente \n"
					+ "3. Crear cuente de cliente \n"
					+ "4. Depositar euros en una cuenta de un cliente \n"
					+ "5. Retirar euros en una cuenta de un cliente");
			
			opcion = sc.nextInt();
			sc.nextLine();
			
		switch(opcion) {
		
			case 1:
				crearCliente();
				break;	
			case 2:
				eliminarCliente();
				break;
			case 3:
				crearCuenta();
				break;
			case 4:
				depositar();
				break;
			case 5:
				retirar();
				break;	
			default:
				System.out.println("Error. Introduce una opcion entre 1-5");
		}

		}while(opcion !=0);
	}
	
	public static void crearCliente() {
		String nombre1 = "";
		String apellido1 = "";
		
		System.out.println("Introduzca su nombre");
		nombre1 = sc.nextLine();
		
		
		System.out.println("Introduzca su apellido");
		apellido1 = sc.nextLine();
		
		Cliente nuevoCliente = new Cliente(nombre1, apellido1);
		clientes.add(nuevoCliente);
		
	}
	
	public static void eliminarCliente() {
		String eliminarNombre = "";
		String eliminarApellido = "";
		int posicionEliminar = 0;

		System.out.println("Ingrese el nombre del cliente que quiere eliminar");
		eliminarNombre = sc.nextLine();
		

		System.out.println("Ingrese el apellido del cliente que quiere eliminar");
		eliminarApellido = sc.nextLine();
		
		
		posicionEliminar = obtenerPosicionCliente(eliminarNombre,eliminarApellido);
		
		if(posicionEliminar != -1) {
			clientes.remove(posicionEliminar);
			System.out.println("El cliente se ha eliminado exitosamente");
			
		}else {
			System.out.println("El cliente no existe");
			}
		
	}
	
	public static void crearCuenta() {
		String nombreCuenta = "";
		String apellidoCuenta = "";
		int posicionCliente = 0;
		
		System.out.println("Introduzca su nombre de cliente");
		nombreCuenta = sc.nextLine();
		
		System.out.println("Introduzca el apellido de cliente");
		apellidoCuenta = sc.nextLine();
		
		posicionCliente = obtenerPosicionCliente(nombreCuenta, apellidoCuenta);
		
		if(posicionCliente != -1) {
			Cuenta nuevaCuenta = new Cuenta();
			clientes.get(posicionCliente).agregarCuenta(nuevaCuenta);
			System.out.println(clientes.get(posicionCliente).toString());
		}else {
			System.out.println("El nombre de cliente no existe");
		
	
		}
	}
	
	public static void depositar() {
		String nombreCuenta = "";
		String apellidoCuenta = "";
		int numeroCuenta = 0;
		int ingresar = 0;
		int posicionCuenta = 0;
		int posicionCliente = 0;
		
		System.out.println("Introduzca su nombre de cliente");
		nombreCuenta = sc.nextLine();
	
		
		System.out.println("Introduzca el apellido de cliente");
		apellidoCuenta = sc.nextLine();

		
		posicionCliente = obtenerPosicionCliente(nombreCuenta, apellidoCuenta);
		
		if(posicionCliente != 1) {
			System.out.println(clientes.get(posicionCliente).toString());
			System.out.println("Elija el numero de cuenta al cual le quiera depositar dinero");
			numeroCuenta = sc.nextInt();
		
			
			posicionCuenta = obtenerPosicionCuenta(numeroCuenta, posicionCliente);
			if (posicionCuenta != 1) {
				System.out.println("Introduzca la cantidad que quiere depositar");
				ingresar = sc.nextInt();
				clientes.get(posicionCliente).getCuentas().get(posicionCuenta).depositar(ingresar);
				System.out.println(clientes.get(posicionCliente).toString());
			}else {
				System.out.println("La cuenta no existe");
			}
			
		}else {
			System.out.println("El cliente no existe");
		}
		
		
	}
	public static void retirar() {
		String nombreCuenta = "";
		String apellidoCuenta = "";
		int numeroCuenta = 0;
		int retirar = 0;
		int posicionCuenta = 0;
		int posicionCliente = 0;
		
		System.out.println("Introduzca su nombre de cliente");
		nombreCuenta = sc.nextLine();
		
		System.out.println("Introduzca el apellido de cliente");
		apellidoCuenta = sc.nextLine();
		
		posicionCliente = obtenerPosicionCliente(nombreCuenta, apellidoCuenta);
		
		if(posicionCliente != 1) {
			System.out.println(clientes.get(posicionCliente).toString());
			System.out.println("Elija el numero de cuenta al cual le quiera retirar dinero");
			numeroCuenta = sc.nextInt();

			
			posicionCuenta = obtenerPosicionCuenta(numeroCuenta, posicionCliente);
			if (posicionCuenta != 1) {
				System.out.println("Introduzca la cantidad que quiere retirar");
				retirar = sc.nextInt();
			
				
				if(retirar < clientes.get(posicionCliente).getCuentas().get(posicionCuenta).getSaldo()) {
				clientes.get(posicionCliente).getCuentas().get(posicionCuenta).retirar(retirar);
				System.out.println(clientes.get(posicionCliente).toString());
				}else {
					System.out.println("Fondos insuficientes");
				}
			}else {
				System.out.println("La cuenta no existe");
			}
			
		}else {
			System.out.println("El cliente no existe");
		}
		
	}
	
	public static int obtenerPosicionCliente(String nombre, String apellido) {
		int i = 0;
		int posicion = -1;
		boolean encontrado = false;
		
		while(i < clientes.size() && encontrado == false) {
			if (clientes.get(i).getNombre().equalsIgnoreCase(nombre) && clientes.get(i).getApellido().equalsIgnoreCase(apellido)) {
				encontrado = true;
				posicion = i;
			}
			i++;
			}
		
		return posicion;	
	}
	
	public static int obtenerPosicionCuenta(int numCuenta, int posicionCliente) {
		int i =0;
		int posicion1 = -1;
		boolean encontrado = false;
		
		while(i< clientes.get(posicionCliente).getCuentas().size() && encontrado == false) {
			if(clientes.get(posicionCliente).getCuentas().get(i).getNumCuenta() == numCuenta) {
				encontrado = true;
				posicion1 = i;
			}
			i++;
		}
		return posicion1;
	}
}

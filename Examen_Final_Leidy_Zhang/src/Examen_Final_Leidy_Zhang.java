import java.util.ArrayList;
import java.util.Scanner;

public class Examen_Final_Leidy_Zhang {
	/*
	 * Nos piden elaborar un CRM de gestión de clientes y que tendrá que gestionar a través de un
	menú de opciones las altas de un cliente, consulta de un cliente o todos los clientes, generar presupuesto,
	modificación de un cliente y eliminación de un cliente.
	*/
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	static Cliente nuevo = new Cliente("Juan", "Ho", "Barcelona", "juan@gmail.com", "Me gustan el pan.");
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. Se debe definir un cliente predefinido con los diferentes datos aportados estáticamente y
correspondientes a cada uno de los atributos.
2. Defina un nuevo e-mail por el usuario creado.
3. Genere un presupuesto con el concepto “170h. Elaboración de una API”, precio 2410 € y
con un iva 21%.
4. Genere un presupuesto con el concepto “250h. Diseño imagen corporativa”, precio
3110€ y con un iva 21%.
5. Muestre la info del cliente que ha creado mediante el método consulta de un cliente.
6. Debe definirse otro cliente con los diferentes datos aportados por el usuario y
correspondientes a cada uno de los atributos.
7. Muestre la información de todos los clientes existentes.
8. Elimine el último cliente creado.
		 */
		
		clientes.add(nuevo);
		nuevo.setEmail("it@gmail.com");
		Presupuesto uno = new Presupuesto("170h. Elaboración de una API", 2410,0.21 );
		Presupuesto dos = new Presupuesto("250h. Diseño imagen corporativa", 3110, 0.21);
		
		nuevo.agregarPresupuesto(uno);
		nuevo.agregarPresupuesto(dos);
		
		System.out.println(nuevo.toString());
		
		System.out.println(clientes);
		

		int opcion = 0;
		int optionVer = 0;
		
		do {
			System.out.println("Menu \n"
					+ "0. Salir de la aplicacion \n"
					+ "1. Dar de alta un cliente \n"
					+ "2. Eliminar cliente \n"
					+ "3. Modificar un cliente \n"
					+ "4. Consultar datos de un cliente o todos \n"
					+ "5. Generar presupuesto");
			
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
				modificarCliente();
				break;
			case 4:
				System.out.println("Quiere ver: \n"
						+ "1. Un solo cliente \n"
						+ "2. Todos los clientes");
				
				optionVer = sc.nextInt();
				sc.nextLine();
				verClientes(optionVer);
				
				break;
			case 5:
				crearPresupuesto();
				break;	
			default:
				System.out.println("Error. Introduce una opcion entre 1-5");
		}

		}while(opcion !=0);
		
		System.out.println("Has salido de la aplicacion");
	}

	public static void crearCliente() {
		
		/*
		 * La opción alta de un cliente debe nombrar el método altaClient(), y éste a la vez deberá
	pedir al usuario que introduzca por pantalla los datos mencionados anteriormente (o deberá
	de recibir estos datos por parámetro), exceptuando el id que se tendrá que autogenerar utilizando
	Math. Una vez que haya pedido todos estos datos, debe instanciarse el objeto de la clase y
	añadirlo a un array de clientes.
		 */
		String nombre = "";
		String apellido = "";
		String direccion = "";
		String email = "";
		String comentarios = "";
		
	
		System.out.println("Introduce los datos del nuevo cliente: \n"
				+ "Nombre: ");
		nombre = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Apellido: ");
		apellido = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Direccion: ");
		direccion = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Email: ");
		email = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Comentarios: ");
		comentarios = sc.nextLine();
		sc.nextLine();
		
		Cliente nuevoCliente = new Cliente(nombre, apellido, direccion, email, comentarios);
		clientes.add(nuevoCliente);
		
		
	}
	
	public static void eliminarCliente() {
		/*
		 * La opción de eliminar un cliente debe nombrar el método darDeBaixaClient(), y éste deberá
		pedir al usuario el nombre o el id del cliente que quiere darse de baja y si el cliente está dentro de
		el array, lo eliminaremos y mostraremos un mensaje por pantalla informando al usuario que hemos eliminado
		el cliente. Si no hemos encontrado al cliente dentro del array, avisaremos al usuario diciendo que el cliente no
		estaba dentro de nuestra aplicación.
		 */
		
		String eliminarNombre = "";
		String eliminarApellido = "";
		int eliminarId = 0;
		int posicionEliminar = 0;
		
	
		System.out.println("Introduce el nombre del cliente que quieres eliminar: \n"
				+ "Nombre: ");
		eliminarNombre = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Introduce el apellido: ");
		eliminarApellido = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Introduce el id: ");
		eliminarId = sc.nextInt();
		sc.nextLine();
		
		
		posicionEliminar = obtenerPosicion(eliminarNombre, eliminarApellido, eliminarId);
		
		if(posicionEliminar != -1) {
			clientes.remove(posicionEliminar);
			System.out.println("El cliente se ha eliminado exitosamente");
		}else {
			System.out.println("El cliente no esta dentro de la aplicacion");
		}
		
	}
	
	public static void modificarCliente() {
		/*
		 * La opción de modificar de un cliente, debe nombrar el método modificarClient(), y éste deberá
	pedir al usuario el nombre o el id del cliente que queremos modificar. Si lo tenemos en la aplicación, le
	preguntaremos si desea modificar cualquiera de los atributos, exceptuando el id. Haremos la modificación
	pertinente y avisaremos al usuario de que la modificación se ha realizado. En caso contrario, indicaremos en
	el usuario que no existe el cliente dentro de la aplicación.
		 */
		String modificarNombre = "";
		String modificarApellido = "";
		int modificarId = 0;
		int posicionModificar = 0;
		int opcionModificar = 0;
		
		String nuevoNombre = "";
		String nuevoApellido = "";
		String nuevoDireccion = "";
		String nuevoEmail = "";
		String nuevoComentarios = "";
		
	
		System.out.println("Introduce el cliente que quieres modificar: \n"
				+ "Nombre: ");
		modificarNombre = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Apellido: ");
		modificarApellido = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Introduce el id: ");
		modificarId = sc.nextInt();
		sc.nextLine();
		
		posicionModificar  = obtenerPosicion(modificarNombre, modificarApellido, modificarId);
		
		if(posicionModificar != -1) {
			//(String nombre, String apellido, String direccion, String email, String comentarios) 
			do {
				System.out.println("Que atributo quieres modificar? \n"
						+ "1. Nombre \n"
						+ "2. Apellido \n"
						+ "3. Direccion \n"
						+ "4. Email \n"
						+ "5. Comentarios \n"
						+ "0. Ninguno");
				opcionModificar = sc.nextInt();
				
				switch(opcionModificar) {
					case 1:
						System.out.println("Introduce el cliente que quieres modificar: \n"
								+ "Nombre: ");
						nuevoNombre = sc.nextLine();
						sc.nextLine();
						clientes.get(posicionModificar).setNombre(nuevoNombre);
						System.out.println("Se ha modificado correctamente");
						
						break;
						
					case 2:
						System.out.println("Apellido: ");
						nuevoApellido = sc.nextLine();
						sc.nextLine();
						clientes.get(posicionModificar).setApellido(nuevoApellido);
						System.out.println("Se ha modificado correctamente");
						
						break;
						
					case 3:
						System.out.println("Direccion: ");
						nuevoDireccion = sc.nextLine();
						sc.nextLine();
						clientes.get(posicionModificar).setDireccion(nuevoDireccion);
						System.out.println("Se ha modificado correctamente");
						
						break;
						
					case 4:
						System.out.println("Email: ");
						nuevoEmail = sc.nextLine();
						sc.nextLine();
						clientes.get(posicionModificar).setEmail(nuevoEmail);
						System.out.println("Se ha modificado correctamente");
						
						break;
						
					case 5:
						System.out.println("Comentarios: ");
						nuevoComentarios = sc.nextLine();
						sc.nextLine();
						clientes.get(posicionModificar).setComentarios(nuevoComentarios);
						System.out.println("Se ha modificado correctamente");
						
						break;
						
					default: 
						System.out.println("Error, elija entre 1-5");
				
				}
				
			}while(opcionModificar != 0);
			
		}else {
			System.out.println("El cliente no esta dentro de la aplicacion");
		}
		
	
		
		
		
	}
	
	public static void verClientes(int optionVer) {
		/*
		 * La opción de consulta de un cliente o de todos los clientes, debe nombrar el método
	verClientes(param1) donde se indicará un parámetro que permitirá mostrar un cliente o todos.
	
	En caso de desear visualizar un único cliente,
	 deberá pedir al usuario el nombre o id del cliente
	que quiere que mostramos por pantalla, si el cliente está en nuestra aplicación, 
	le mostraremos toda la
	información incluyendo los presupuestos vinculados, 
	
	si no está, informaremos al usuario diciendo que el
	cliente que nos ha pedido no está dentro de nuestra aplicación.
	En caso de desear visualizar todos los clientes, muestre todos los atributos de cada cliente.
		 */
		
		String verNombre = "";
		String verApellido = "";
		int verId = 0;
		int verPosicion = 0;
		
		switch(optionVer) {
		case 1:

			System.out.println("Introduce el nombre del cliente que quieres ver: \n"
					+ "Nombre: ");
			verNombre = sc.nextLine();
			sc.nextLine();
			
			System.out.println("Introduce el apellido: ");
			verApellido = sc.nextLine();
			sc.nextLine();
			
			System.out.println("Introduce el id: ");
			verId = sc.nextInt();
			sc.nextLine();
			

			verPosicion = obtenerPosicion(verNombre, verApellido, verId);
			
			if(verPosicion != -1) {
				System.out.println(clientes.get(verPosicion).toString());
				
			}else {
				System.out.println("El cliente no esta dentro de la aplicacion");
			}
			
			break;
			
		case 2:
			System.out.println(clientes);
			break;
			
		default:
			System.out.println("Erorr, no has elejido entre 1-2");
		}
		
			
	}
	
	public static void crearPresupuesto() {
		/*
		 * La opción de generar presupuesto, debe nombrar el método crearPresupuesto(), y éste deberá
	pedir al usuario el nombre o el id del cliente para poder comprobar si el cliente está dentro de
	el array. Si el cliente está en nuestra aplicación, 
	obtendremos todos los atributos del cliente, 
	se pedirá al usuario que indique el concepto, 
	valor e iva, por nombrar el método generarPresupuesto() de
	la clase Clientes, almacenar el objeto correspondientemente vinculado al cliente y obtener una
	respuesta como el ejemplo indicado anteriormente. Si no está, informaremos al usuario diciendo que el
	cliente que nos ha pedido no está dentro de nuestra aplicación.
		 */
		String presupuestoNombre = "";
		String presupuestoApellido = "";
		int presupuestoId = 0;
		int posicionPresupuesto = 0;
		
	
		System.out.println("Introduce el nombre del cliente para crear presupuesto: \n"
				+ "Nombre: ");
		presupuestoNombre = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Introduce el apellido: ");
		presupuestoApellido = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Introduce el id: ");
		presupuestoId = sc.nextInt();
		sc.nextLine();
		
		
		posicionPresupuesto = obtenerPosicion(presupuestoNombre, presupuestoApellido, presupuestoId);
		
		if(posicionPresupuesto != -1) {
			/*Si el cliente está en nuestra aplicación, 
	obtendremos todos los atributos del cliente, 
	se pedirá al usuario que indique el concepto, 
	valor e iva, por nombrar el método generarPresupuesto() de
	la clase Clientes,
	obtener una
	respuesta como el ejemplo indicado anteriormente. Si no está, informaremos al usuario diciendo que el
	cliente que nos ha pedido no está dentro de nuestra aplicación.
	*/
			String concepto = "";
			double valor =0d;
			int iva = 0;
			
			System.out.println("Antes: " + clientes.get(posicionPresupuesto).toString());
			
			System.out.println("Introduce los datos para generar el presupuesto: \n"
					+ "Concepto: ");
			concepto = sc.nextLine();
			sc.nextLine();
			
			System.out.println("Apellido: ");
			valor = sc.nextDouble();
			sc.nextLine();
			
			System.out.println("Direccion: ");
			iva = sc.nextInt();
			sc.nextLine();
			
			Presupuesto nuevoPresupuesto = new Presupuesto(concepto, valor, iva);
			
			clientes.get(posicionPresupuesto).agregarPresupuesto(nuevoPresupuesto);
			
			System.out.println("Despues: " + clientes.get(posicionPresupuesto).toString());
			
		}else {
			System.out.println("El cliente no esta dentro de la aplicacion");
		}
		
		
	}
	
	public static int obtenerPosicion(String nombre, String apellido, int identificador) {
		int i =0;
		int posicion = -1;
		boolean encontrado = false;
		
		while(i< clientes.size() && encontrado == false) {
			
			if(clientes.get(i).getNombre().equalsIgnoreCase(nombre) && clientes.get(i).getApellido().equalsIgnoreCase(apellido) || 
					clientes.get(i).getId() == identificador) {
				encontrado = true;
				posicion = i;
			}
			i++;
		}
		return posicion;
	}
	
	
}

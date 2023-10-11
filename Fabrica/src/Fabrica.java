
public class Fabrica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cotxe vehiculo1 = new Cotxe("rojo ardiente", "Ferrari F2004", "Ferrari", true, 6200); //la clase tiene que tener el mismo nombre que el tipo
		Cotxe vehiculo2 = new Cotxe("rojo vino", "Maserati 250F", "Maserati", true, 2490);
		Cotxe vehiculo3 = new Cotxe("celeste y azul royal", "McLaren F1 GTR", "BMW", 6064);
		Cotxe vehiculo4 = new Cotxe("plateado", "Mercedes-Benz W196", "Mercedes-Benz", true, 1493);
		
		//vehiculo1.color = "negro"; //Esto hace un overwrite del valor
		
		//ejecutando getter y setter de los colores
		
		vehiculo1.setColor("ROSADO");
		vehiculo1.setCilindrada(3000);
		
		System.out.println(vehiculo1.getColor()+vehiculo1.getCilindrada());
		
		/*vehiculo1.marca = "Ferrari";
		vehiculo1.cilindrada = (float) 6.2;
		vehiculo1.descapotable = true;
		vehiculo1.modelo = "Ferrari 250 GTO";
		vehiculo1.velocidad = 0;
		*/
		
		
		
		//frenar y acelerar aleatoriamente
	
		
		vehiculo1.acelerar();
		vehiculo1.acelerar();
		vehiculo1.frenar();	
		vehiculo1.acelerar();
		vehiculo1.acelerar();
		
		vehiculo2.acelerar();
		vehiculo2.acelerar();
		vehiculo2.frenar();
		vehiculo2.acelerar();
		vehiculo2.acelerar();
		
		vehiculo3.acelerar();
		vehiculo3.acelerar();
		vehiculo3.frenar();
		vehiculo3.acelerar();
		vehiculo3.acelerar();
		vehiculo3.frenar();
		
		vehiculo4.acelerar();
		vehiculo4.acelerar();
		vehiculo4.frenar();
		vehiculo4.acelerar();
		vehiculo4.acelerar();
		vehiculo4.acelerar();
		vehiculo4.frenar();
		
		
		System.out.println(vehiculo1.presentarse());
		System.out.println(vehiculo2.presentarse());
		System.out.println(vehiculo3.presentarse());
		System.out.println(vehiculo4.presentarse());
		
		
	

	}

}

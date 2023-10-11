

public class M8Ex1_Leidy_Zhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//En el main del proyecto crea ordenadores de las 2 formas posibles y comprueba que los métodos creados funcionan correctamente.
		
		Ordenador ordenador1 = new Ordenador("HP","Envy 16");
		ordenador1.setDiscoDuro(2);
		ordenador1.setMemoriaRAM(16);
		ordenador1.setProcesador("Intel Core i7");
		Ordenador ordenador2 = new Ordenador("Apple", "MacBook Air 14", "Intel Core i7", 16, 1);
		
		
		System.out.println(ordenador1.toString());
		System.out.println(ordenador2.toString());
		
		System.out.println("el ordenador 2 tiene " + ordenador2.getDiscoDuro() +"TB y "+ordenador2.getMemoriaRAM() + "GB.");
		
		
	
		
		System.out.println(ordenador1.programa("eclipse"));
		
		
	}

}

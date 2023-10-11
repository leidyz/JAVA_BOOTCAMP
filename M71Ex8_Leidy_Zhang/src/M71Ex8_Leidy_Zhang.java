import java.util.Scanner;

public class M71Ex8_Leidy_Zhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crea un programa on l’usuari/ària introdueixi una temperatura en °C 
		//i es mostri per pantalla la conversió en ºFahrenheit
		//Fórmula(0 °C × 9 / 5) + K = 32 °F
		
		int celsius = 0;
		int farenheit = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la temperatura en Celcius");
		celsius = sc.nextInt();
		
		farenheit = (celsius * 9/5 ) + 32;
		System.out.println("(" + celsius + "°C * 9/5 ) + 32 = " + farenheit + "°F");

		sc.close();
	}

}

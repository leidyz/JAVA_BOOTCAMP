import java.util.Scanner;

public class M4Ex6_Leidy_Zhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Fer un programa que demani a l’usuari/ària quin dia i quin mes va néixer, 
		 * amb aquesta informació el programa mostra per pantalla, de quin signe del zodíac és.
			Àries-Aries (21.03 — 19.04)
			Taure-Tauro (20.04 — 20.05)
			Bessons-Géminis (21.05 — 20.06)
			Cranc-Cáncer (21.06 — 22.07)
			Lleó-Leo (23.07 — 22.08)
			Verge-Virgo (23.08 — 22.09)
			Balança-Libra (23.09 — 22.10)
			Escorpí-Escorpión (23.10 — 21.11)
			Sagitari-Sagitario (22.11 — 21.12)
			Capricorn-Capricornio (22.12 — 19.01)
			Aquari-Acuario (20.01 — 18.02)
			Peixos-Piscis (19.02 — 20.03)
		 */
		
		//ingredientes
		//dispersar el problema, estructuras, es una combinacion de estructuras
		//un unico resultado final del zodiaco
		int mes = 0;
		int dia = 0;
		String signo = "";
		Scanner entrada = new Scanner(System.in);
		System.out.println("Bienvenido a los signos del zodiaco. \n"
				+ "Si quieres saber tu signo, responde las siguientes preguntas:\n"
				+ "1. Indica tu mes de nacimiento. Por favor escribe un numero entre 1-12");
		mes = entrada.nextInt();
		System.out.println("2. Indica tu dia de nacimiento.");
		dia = entrada.nextInt();
		
		
		switch(mes) {
		case 1:
			if(dia <= 19) {
				signo ="Capricornio";//Capricorn-Capricornio (22.12 — 19.01)
			}else {
				signo = "Acuario"; //Aquari-Acuario (20.01 — 18.02)
			}
			break;
		case 2:
			if (dia <= 18) {
				signo = "Acuario";//Aquari-Acuario (20.01 — 18.02)
			}else {
				signo = "Piscis";//Peixos-Piscis (19.02 — 20.03)
			}
			break;
		case 3:
			if(dia <=20) {
				signo = "Piscis";//Peixos-Piscis (19.02 — 20.03)
			}else {
				signo = "Aries";//Àries-Aries (21.03 — 19.04)
			}
			break;
		case 4:
			if(dia <= 19) {
				signo = "Aries";//Àries-Aries (21.03 — 19.04)
			}else {
				signo = "Tauro"; //Taure-Tauro (20.04 — 20.05)
			}
			break;
		case 5:
			if(dia <= 20) {
				signo = "Tauro"; //Taure-Tauro (20.04 — 20.05)
			}else {
				signo = "Geminis"; //Bessons-Géminis (21.05 — 20.06)
			}
			break;
		case 6:
			if(dia <= 20) {
				signo = "Geminis";// Bessons-Géminis (21.05 — 20.06)
			}else {
				signo = "Cancer"; //Cranc-Cáncer (21.06 — 22.07)
			}
			break;
		case 7:
			if(dia <= 22) {
				signo = "Cancer"; //Cranc-Cáncer (21.06 — 22.07)
			}else {
				signo = "Leo"; //Lleó-Leo (23.07 — 22.08)
			}
			break;
		case 8:
			if(dia <= 22) {
				signo = "Leo"; //Lleó-Leo (23.07 — 22.08)
			}else {
				signo = "Virgo";//Verge-Virgo (23.08 — 22.09)
			}
			break;
		case 9:
			if(dia <= 22) {
				signo = "Virgo";//Verge-Virgo (23.08 — 22.09)
			}else {
				signo = "Libra";//Libra (23.09 — 22.10)
			}
			break;
		case 10:
			if(dia <= 22) {
				signo = "Libra";//Libra (23.09 — 22.10)
			}else {
				signo = "Escorpio";//Escorpí-Escorpión (23.10 — 21.11)
			}
			break;
		case 11:
			if(dia <= 21) {
				signo = "Escorpio";//Escorpí-Escorpión (23.10 — 21.11)
			}else {
				signo = "Sagitario";//Sagitari-Sagitario (22.11 — 21.12)
			}
			break;
		case 12:
			if(dia <= 21) {
				signo = "Sagitario";//Sagitari-Sagitario (22.11 — 21.12)
			}else {
				signo = "Capricornio";//Capricorn-Capricornio (22.12 — 19.01)
			}
			break;
		default:
			signo = "Error";
		}System.out.println(signo);

		
		entrada.close();
	}

}

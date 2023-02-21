package main;

import java.util.Scanner;

public class ActividadSeisDiez {
	
static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Escriba una frase");
		String frase=entrada.nextLine();
	
		frase= frase.replaceAll(" ", "");
		if (fraseInvertida(frase).equalsIgnoreCase(frase)== true) {
			System.out.println("Es una frase palíndroma");
		}else {
			System.out.println("No es una frase palíndroma");
	}
	}
	
	static String fraseInvertida(String frase) {
	String fraseAlReves ="";
	
	for (int i = (frase.length()-1); i>=0; i--){
	//guardo el orden alreves de la frase en una nueva variable
	fraseAlReves= fraseAlReves+frase.charAt(i) ;	
	}	
	System.out.println(fraseAlReves);
	return fraseAlReves;
	}



}

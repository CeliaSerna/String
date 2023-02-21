package main;

import java.util.Scanner;

public class ActividadSeisSeis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//imprimir un nombre sin vocales
	Scanner entrada = new Scanner(System.in);	
		System.out.println("Escriba un nombre");
		String nombre= entrada.nextLine();
		String nombreSinVocales="";
		
		for (int i= 0; i <nombre.length(); i++) {
			char c=nombre.charAt(i);
		if (!esVocal(c)) {
			nombreSinVocales = nombreSinVocales +c;
		}
		}
		System.out.println(nombreSinVocales);
		
}
	
	static boolean esVocal (char c) {
		boolean resultado;
		String prohibida= "aeiouáéíóúAEIOU";
		c=Character.toLowerCase(c);
		if (prohibida.indexOf(c)== -1) {
			resultado = false;
		}else {
			resultado = true;
		}
		return resultado;
	}
}
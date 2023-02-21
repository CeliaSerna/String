package main;

import java.util.Scanner;

public class ActividadSeisSiete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner entrada = new Scanner(System.in);
		System.out.println("Escriba una frase");
		String frase= entrada.nextLine();
		System.out.println("Escriba la palabra que quiere contar");
		String palabra= entrada.nextLine();
		int contadorPalabra =0;
        int lugar = frase.indexOf(palabra);
		
	        while (lugar != -1) {
		
			contadorPalabra++;
			
			lugar = frase.indexOf(palabra, lugar+1);
		}
	
		System.out.println("El número de veces que se repite la palabra '" + palabra +"' es " + contadorPalabra);
	
	
	

		
}
}

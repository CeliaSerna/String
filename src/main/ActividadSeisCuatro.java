package main;

import java.util.Scanner;

public class ActividadSeisCuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada = new Scanner(System.in);

//contar espacios en blanco
System.out.println("Escriba una frase");
String frase= entrada.nextLine();
int contadorEspacios= 0;
for (int i = 0; i < frase.length(); i++) {
	if (Character.isSpaceChar(frase.charAt(i))) {
		contadorEspacios ++;
		
	}
}
System.out.println("Hay " + contadorEspacios + " espacios");	
		
		
		
	}

}

package main;

import java.util.Scanner;

public class ActividadSeisOcho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada = new Scanner(System.in);

String coletilla="Javalín,javalón		";
String coletilla2="		javalén,len,len";
int longitud = coletilla.length();
int longitud2 = coletilla2.length();
System.out.println("Escribe tu saludo");
String frase=entrada.nextLine();
		
		if ( (frase.startsWith(coletilla) ) && (frase.endsWith(coletilla2) ) ==true ) {
			System.out.println("Idioma de Javalandia -->");
			System.out.println(frase.substring(longitud, (frase.length()-longitud2)));

		}
		else if (frase.startsWith(coletilla)==true) {
			System.out.println("Idioma de Javalandia -->");
			System.out.println(frase.substring(longitud, frase.length()));
		}
		else if (frase.endsWith(coletilla2)==true) {
			System.out.println("Idioma de Javalandia -->");
			System.out.println(frase.substring(0, (frase.length()-longitud2)  ));
		}
		else {
			System.out.println("No es idioma de Javalandia");
		}
		

entrada.close();		
}
}
/*  SI CUMPLE CON EL PREFIJO Y EL SUFIJO NO QUITA LOS DOS*/
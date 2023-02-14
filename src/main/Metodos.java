package main;

import java.util.Arrays;

public class Metodos {
	
	static String cambio(String palabra) {
		String conversion = "Adios";
		return conversion;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

String cadena1= "hola mundo";
String cadena2= "HOLA MUNDO";
String cadena3= " Qué bien, es viernes";

	System.out.println("Metodo equals                      ->\t" +cadena1.equals(cadena2));
	System.out.println("Metodo equals ignorando mayusculas ->\t" +cadena1.equalsIgnoreCase(cadena2));
	System.out.println("String Metodo                      ->\t" +cambio(cadena1));
	
	char letra= cadena1.charAt(5);
	System.out.println("Metodo charAt                      ->\t" +letra);			
	System.out.println("Metodo concat                      ->\t"+ cadena2.concat(cadena3) );
	System.out.println("Metodo startswith                  ->\t"+ cadena2.startsWith("HOL") );
	System.out.println("Metodo endswith                    ->\t"+ cadena2.endsWith("NDO") );
	
	String cadena4="Es una prueba";
	System.out.println("Metodo strip                       ->\t" + cadena4.strip());
	System.out.println("Metodo stripLeading                ->\t" + cadena4.stripLeading());
	System.out.println("Metodo stripTrailling              ->\t" + cadena4.stripTrailing());
	System.out.println("Metodo length                      ->\t" + cadena2.length());
	System.out.println("Metodo subStringn                  ->\t" + cadena2.substring(3));
	System.out.println("Metodo subStringn con final        ->\t" + cadena2.substring(5,9));
	
	String cadena6=" ";
	System.out.println("Metodo isEmpty                     ->\t" + cadena6.isEmpty());//solo si length es 0 : TRUE
	System.out.println("Metodo isBlank                     ->\t" + cadena6.isBlank());//la diferencia con isEmpty es que este tiene encuenta los espacios 
	
	String cadena7="salsa";
	String cadena8="Salsa de tomate";
	//comparar alfabeticamente dos cadenas resultando 0 si son iguales
	//negativo si cadena1 es menor que cadena2
	//positivo si cadena2 es mayor que cadena1

	System.out.println("Metodo compareTO                     ->\t" + cadena7.compareTo(cadena8)); 
	System.out.println("Metodo compareTO ignorando mayusculas->\t" + cadena7.compareToIgnoreCase(cadena8)); 

	// para invertir el orden de una cadena
	String cadena9="Hola Mundo";
	String nueva="";
	for(int i=0; i<cadena9.length(); i++) {
		nueva=cadena9.charAt(i)+nueva;
	}
	System.out.println(nueva);
	//split
	String cadena10="Prueba-para dividir una cadena segun el caracter";
	String[] arrayCadena10=cadena10.split("a");
	System.out.println(arrayCadena10[2]);


	
	
	
	}

}

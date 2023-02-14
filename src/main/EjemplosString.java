package main;

public class EjemplosString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String cadena1= "hola mundo";
String cadena2= "HOLA MUNDO";
System.out.println(cadena1.equals(cadena2));
System.out.println(cadena1.equalsIgnoreCase(cadena2));
System.out.println(cambio(cadena1));

char letra= cadena1.charAt(5);
System.out.println(letra);			
	}

	
	static String cambio(String palabra) {
		String conversion = "Adios";
		return conversion;
	}

	
}

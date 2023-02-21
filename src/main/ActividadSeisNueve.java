package main;
import java.util.Scanner;
public class ActividadSeisNueve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner entrada = new Scanner(System.in);
String palabra =""; 

String frase="";

while (!palabra.toLowerCase().equals("fin")) {
	    frase += palabra + " ";	
	    System.out.println("Escriba una palabra");
        palabra=entrada.next();
		
		}
		
		System.out.println(frase);
		
		
	}

}

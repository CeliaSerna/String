package main;

import java.util.Scanner;

public class ActividadApliSeisTrece {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//eliminar comentarios en lenguaje C /* ... */ 
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe la sentencia en C ");
		String sentencia=entrada.nextLine();
		int inicio, fin;
		inicio = sentencia.indexOf("/*");
		while (inicio!=-1) {
			fin = sentencia.indexOf("*/", inicio);
			sentencia=sentencia.substring(0,inicio)+sentencia.substring(fin+2);
			inicio = sentencia.indexOf("/*");
			
		}
		System.out.println(sentencia);
	entrada.close();
	}

}

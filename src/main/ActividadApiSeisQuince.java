package main;
import java.util.Scanner;
public class ActividadApiSeisQuince {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//practica donde se concatena caracteres de escape
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Indique el titulo de la pagina web");
		String titulo=entrada.nextLine();
		System.out.println("Indique el contenido de la pagina web");
		String contenido=entrada.nextLine();
		
		System.out.println("<!DOCTYPE html>");
		System.out.println("<html>");
		System.out.println("<head>");
		System.out.println("<title=\"Creando con Java\">");
		System.out.println("</head>");
		System.out.println("<body>");
		System.out.println("<h1>" + titulo + "</h1>");
		System.out.println("<p>" + contenido + "</p>");
		
		System.out.println("</body>");
		System.out.println("</html>");
	
		
		
		
		
		
		
	}

}

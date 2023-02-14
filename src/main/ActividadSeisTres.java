package main;

import java.util.Scanner;

public class ActividadSeisTres {

static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//juego acierta la contraseña
	
		System.out.println("Escriba la contraseña a adivinar");
		String contrasena= entrada.nextLine();
		adivinaContrasena(contrasena);
	
	}		
	
static boolean adivinaContrasena(String contrasena) {
	    boolean contrasenaAcertada;
		
		System.out.println("Adivina la contraseña -->");
		String intento=entrada.nextLine();

		if (intento.equalsIgnoreCase(contrasena) == false) {
			contrasenaAcertada = false;
			System.err.println("Has fallado");
			
			if (intento.length()>= contrasena.length()) {
		    for (int i =0 ; i < contrasena.length(); i++) {
		    	if (contrasena.charAt(i) != intento.charAt(i)) {
		    		if (Character.isSpaceChar(contrasena.charAt(i))) {
		    			System.out.print(" ");
		    		}else {
		    			System.out.print("*");
		    		}
		    		
		    	}else {
		    		System.out.print(contrasena.charAt(i));
		    	}
		    }
		    }else {
		    	System.out.println("La longitud de la contraseña secreta es "+ contrasena.length());
		    
		    }
		    System.out.println(" ");
		adivinaContrasena(contrasena);
		}else {
			contrasenaAcertada = true;
			System.out.println("¡¡¡Has acertado!!!");
		}
	
		return contrasenaAcertada;
	}

	}
	
	


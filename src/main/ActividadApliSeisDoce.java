package main;

import java.util.Scanner;

public class ActividadApliSeisDoce {

static Scanner entrada = new Scanner(System.in);

public static void main(String[] args) {
			// TODO Auto-generated method stub

			
	//juego del ahorcado
	        int intentos=0;
			System.out.println("--------- Jugador A ------------>");
			System.out.println("Escribe la palabra para adivinar");
			String contrasena= entrada.nextLine();
			
			System.out.println("                                ");
			System.out.println("********************************");
			System.out.println("********************************");
			System.out.println("********************************");
			System.out.println("********************************");
			System.out.println("********************************");
			System.out.println("********************************");
			System.out.println("********************************");
			System.out.println("********************************");
			System.out.println("********************************");
			System.out.println("********************************");
			System.out.println("********************************");
			System.out.println("********************************");
			System.out.println("********************************");
			System.out.println("********************************");
			System.out.println("********************************");
			System.out.println("********************************");
			System.out.println("********************************");
			System.out.println("********************************");
			System.out.println("********************************");
			System.out.println(" ");
			System.out.println("--------- Jugador B ------------>");
			for (int i=0; i<contrasena.length(); i++) {
		    	System.out.print("-");
		    }
		    
		    System.out.println("");
		   
			adivinaContrasena(contrasena,intentos);
		    
		}		
		
	static boolean adivinaContrasena(String contrasena, int intentos) {
		    boolean contrasenaAcertada;
		 
		
			System.out.println("Adivina la palabra -->");
			String intento=entrada.nextLine();

			if ( intentos<6) {
				
			
			if (intento.equalsIgnoreCase(contrasena) == false) {
				contrasenaAcertada = false;
				System.out.println(" ");
				System.err.println("\u2718 Has fallado");
				
				intentos++;
				System.out.println("Te quedan "+ (7-intentos) + " intentos");
				
				if (intento.length()>= contrasena.length()) {
			    for (int i =0 ; i < contrasena.length(); i++) {
			    	if (contrasena.charAt(i) != intento.charAt(i)) {
			    		if (Character.isSpaceChar(contrasena.charAt(i))) {
			    			System.out.print(" ");
			    		}else {
			    			System.out.print("-");
			    		}
			    	}else {
			    		System.out.print(contrasena.charAt(i));
			    	}
			    }
			    }else {
			    	//System.out.println("La longitud de la palabra secreta es "+ contrasena.length());
			    	
			    	for (int i=0; i<contrasena.length(); i++) {
				    	System.out.print("-");
				    }
			    	System.out.println(" ");
			    }
			    System.out.println(" ");
			    
			    adivinaContrasena(contrasena,intentos);
			    
			
			}else {
				contrasenaAcertada = true;
				System.out.println("\u2714 Has acertado");
			}
			}else {
				System.err.println("\u2718 Has agotado los intentos");
				contrasenaAcertada=false;
			}
			return contrasenaAcertada;
		}
	
	
	
	
	
		}
package main;

import java.util.Scanner;

public class ComparacionCadenas {
	
static Scanner entrada = new Scanner(System.in);
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	nombreValido();
	passwordValido();
	




}
//funcion para comprobar contraseñas
	static boolean passwordValido() {
		boolean passwordOk;
		
		System.out.println("Escriba la contraseña");
		String password1= entrada.nextLine();
		System.out.println("Vuelva a escribir la contraseña");
		String password2= entrada.nextLine();
		
		if (password1.equals(password2)== true) {
			System.out.println("Contraseña correcta");
			passwordOk = true;
				  
		}else {
			System.err.println("Las contraseñas no coinciden");	
			passwordOk = false;
			passwordValido();
			
		}
	return passwordOk;
}
	//funcion para comprobar cadenas de texto ignorando mayusculas
		static boolean nombreValido() {
			boolean nombreOk;
			
			System.out.println("Escriba su nombre");
			String nombre1= entrada.nextLine();
			System.out.println("Vuelva a escribir su nombre");
			String nombre2= entrada.nextLine();
			
			if (nombre1.equalsIgnoreCase(nombre2)== true) {
				System.out.println("Nombre correcta");
				nombreOk = true;
					  
			}else {
				System.err.println("Los nombres no coinciden");	
				nombreOk = false;
				nombreValido();
				
			}
		return nombreOk;
	}
		
	
}

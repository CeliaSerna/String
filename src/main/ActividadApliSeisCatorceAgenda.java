package main;

import java.util.Arrays;
import java.util.Scanner;

public class ActividadApliSeisCatorceAgenda {

static String []agenda=new String[0];
	
public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		menuPrincipal();
		
		
	}

	static void menuPrincipal() {
		System.out.println("******* AGENDA *********");
		System.out.println("1- Añadir nuevo contacto");
		System.out.println("2- Buscar contacto");
		System.out.println("3- Editar contacto");
		System.out.println("4- Mostrar todos los contactos");
		System.out.println("5- Salir");
		int opcion = new Scanner(System.in).nextInt();
	switch(opcion) {
	case 1 -> anadirContacto();
	case 2 -> buscarModificar(2);
	case 3 -> buscarModificar(3);
	case 4 -> mostrarContactos();
	case 5 -> System.out.println("Hasta luego");
	default -> {
		System.out.println("Opción no válida");
		System.out.println("----------------------------");
		
		menuPrincipal();
	
	}
	}
	}
static void anadirContacto() {
	agenda=Arrays.copyOf(agenda, agenda.length+1);
	String nombre;
	do {
		System.out.println("Escriba el nombre del contacto");
		nombre=new Scanner(System.in).nextLine();
	}while(nombre.isEmpty());
	
	nombre=pasarMayus(nombre);
	String telefono;
	do {
	
	System.out.println("Escriba el teléfono del contacto");
	telefono=new Scanner(System.in).nextLine();
	}
	while(validarTelefono(telefono));
	
	agenda[agenda.length-1]=nombre+":"+ telefono;
	menuPrincipal();
}

static void buscarModificar(int opcion) {
	
	String nombre;
	boolean encontrado = false;
	do {
		System.out.println("Escriba el nombre que quiera buscar");
	    nombre= new Scanner(System.in).nextLine();
	}while(nombre.isEmpty());
	nombre = pasarMayus(nombre);
	for (int i =0; i <agenda.length; i++) {
		String aux[]= agenda[i].split(":");
		if (aux[0].startsWith(nombre)&&opcion==2) {
			System.out.println(aux[0] + "\u27A1 " + aux[1]);
			encontrado=true;
		}
		if(aux[0].startsWith(nombre)&&opcion==3) {
		String telefono;
		do {
			System.out.println(" \nEscriba el telefóno de " + aux[0]+ " \u27A1");
			telefono=new Scanner(System.in).nextLine();
		}while(validarTelefono(telefono));
		agenda[i]=aux[0]+ ":" +telefono;
		System.out.println("Modificado correctamente");
		encontrado=true;
		}
	}
	
	if (!encontrado)System.out.println("El contacto no existe en la Agenda");
	System.out.println(" ");
	menuPrincipal();
}

static void mostrarContactos() {
	for (String dato:agenda) {
		String[] auxString=dato.split(":");
		System.out.println(auxString[0] + "\u27A1 " +auxString[1]);
		System.out.println(" ");
	}
	menuPrincipal();
	
}
static String pasarMayus(String cadena) {
	String[] arrayCadeStrings=cadena.split(" ");
	String temp="";
	for (int i=0; i < arrayCadeStrings.length;i++) {
		arrayCadeStrings[i]=arrayCadeStrings[i].substring(0,1).toUpperCase()+
				arrayCadeStrings[i].substring(1).toLowerCase();
		temp+=arrayCadeStrings[i]+ " ";
	}
	return temp;

}

static boolean validarTelefono(String telefono) {
	boolean correcto=false;
	if ( (!telefono.startsWith("9")&& !telefono.startsWith("6")&& !telefono.startsWith("7") )
			|| telefono.length()!=9 ) {
		correcto=true;
	}
return correcto;
}




}

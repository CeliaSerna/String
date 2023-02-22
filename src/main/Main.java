package main;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//director
int datos[] = {15,55,8,9,10};
int datos2[] = mostrar(datos);
System.out.println("Array despues de funcion datos2 " + Arrays.toString(datos2));
		
	//segunda funcion , el array se llama numero
	}
static int[] mostrar(int numero[]) {
	System.out.println("Array sin ordenar "  + Arrays.toString(numero));
	Arrays.sort(numero);//ordena de mayor a menor los numeros del array
	System.out.println("array ordenado " + Arrays.toString(numero));
	return numero;
}
		
		
	

}

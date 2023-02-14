package main;
import java.util.Scanner;
public class ActividadSeisCinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada = new Scanner(System.in);

//ESCRIBIR UNA FRASE ALREVES

		System.out.println("Escriba una frase para verla invertida");
		String frase=entrada.nextLine();
	
		for (int i = (frase.length()-1); i>=0; i--){
			System.out.print(frase.charAt(i));		
		}
		
}
}

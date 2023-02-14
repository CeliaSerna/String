package main;
import java.util.Scanner;
public class ActividadSeisDos {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada = new Scanner(System.in);
//adivinar que frase es mayor
System.out.println("Escriba una frase");
String frase1 = entrada.nextLine();
System.out.println("Escriba una frase");
String frase2 = entrada.nextLine();		
	
if (frase1.length()   > frase2.length() ) {
	System.out.println("La frase '" +frase1 +" es mayor que la frase '" + frase2);
}else if(frase1.length() == frase2.length() ) {
	System.out.println("La frase '"+  frase1 +" tiene la misma longitud que la frase '" + frase2 );

}else {
	System.out.println("La frase '"+ frase2 +" es mayor que la frase " + frase1  );

}
		
	}

}

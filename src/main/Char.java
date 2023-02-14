package main;

public class Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char c, a, b;
	
		c = '\u2661';
		b = '\u03C0';//NUMERO PI
		a = '\u221E';// INFINITO 
		System.out.println(c + " "+ b+ " \'123 "+a);
		
		//bucle que muestra codigos desde 0x1111 a 0xFFFFF
		for (int codePoint=0x0000; codePoint<=0xFFFFF; codePoint++) {
			String codigo = Integer.toHexString(codePoint);
			System.out.println("\\u" + codigo + ": " + (char)codePoint);
		}
	
	}

}

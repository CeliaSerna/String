package main;

public class ClaseCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char a = '8';
		char b= 'c';
		char c = ' ';
		char d= '&';
		char e= '\n';
		System.out.println(Character.isDigit(b));//false
		System.out.println(Character.isLetterOrDigit(b));//true
		System.out.println(Character.isLetter(a));//false
		System.out.println(Character.isLowerCase(b));//true
		System.out.println(Character.isUpperCase(b));//false
		System.out.println(Character.isWhitespace(e));//true
		
	}

}

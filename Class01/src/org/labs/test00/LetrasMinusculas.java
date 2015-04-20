package org.labs.test00;

import java.util.Scanner;

public class LetrasMinusculas {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("digite qualquer coisa: ");
		String texto = scan.nextLine();
		System.out.println(texto.toLowerCase());
	}
	
}

package org.labs.test04;

import java.util.Scanner;

/*
 
 Using the Java language, have the function LetterChanges(str) 
 take the str parameter being passed and modify it using the following algorithm. 
 
 Replace every letter in the string with the letter following it in the alphabet 
 (ie. c becomes d, z becomes a). Then capitalize every vowel in this new string (a, e, i, o, u) 
 and finally return this modified string. 
 
 */

public class MudandoLetras {

	
	String mudarLetras(String str) {
		
		String[] alfabeto = { "a", "b", "c", "d", "e", "f", "g", "h", "i","j", "k", "l", 
				"m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
		CharSequence seqChar = (CharSequence) str;
		String aux = "";
		
		for (int i = 0; i < str.length(); i++) {
			
			for (int j = 0; j < alfabeto.length; j++) {
				if( String.valueOf( seqChar.charAt(i) ).equalsIgnoreCase( alfabeto[j] ) ) {
					
					if( alfabeto[j+1].equalsIgnoreCase("a") ||
						alfabeto[j+1].equalsIgnoreCase("e") ||
						alfabeto[j+1].equalsIgnoreCase("i") ||
						alfabeto[j+1].equalsIgnoreCase("o") ||
						alfabeto[j+1].equalsIgnoreCase("u") ) {
						
						aux += alfabeto[j+1].toUpperCase();
						continue;
					}
					
					aux += alfabeto[j+1];
				}
			}
		}
			return aux;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println( new MudandoLetras().mudarLetras( scan.nextLine() ) );
	}

}
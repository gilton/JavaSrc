package org.labs.test03;

import java.util.Scanner;

import org.labs.test02.Fatorial;

public class MaiorPalavra {

	String retornarAMaiorPalavra(String palavra) {
		
		String [] aux = null;
		int maior = 0;
		
		for (int i = 0; i < palavra.length(); i++) {
			aux = palavra.split(" ");
		}
		for (int i = 0; i < aux.length; i++) {
			if( aux[i].length() > maior ) {
				maior = aux[i].length();
				palavra = aux[i];
			}
		}
		
		return palavra;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		MaiorPalavra mp = new MaiorPalavra();
		System.out.print(mp.retornarAMaiorPalavra(s.nextLine()));
	}
}

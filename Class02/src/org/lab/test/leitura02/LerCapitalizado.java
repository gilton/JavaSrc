package org.lab.test.leitura02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerCapitalizado {

	public static void main(String[] args) {
		try {
			FileReader arq = new FileReader("src/english.txt");
			BufferedReader lerArq = new BufferedReader(arq);

			String linha = "";
			String[] strs = null;
			StringBuffer sb = new StringBuffer();
			
			while (linha != null) {
				linha = lerArq.readLine();
				if( linha != null ) {
					strs = linha.split(" ");
					
					for (int i = 0; i < strs.length; i++) {
						strs[i] = strs[i].replace(strs[i].charAt(0), Character.toUpperCase(strs[i].charAt(0)));
						
						if( i % 2 == 0 && i >= 0 ) {
							sb.append( strs[i] ).append(" ");
						} else {
							sb.append( strs[i] ).append("\n");
						}
					}
				
				}
	
			}
			System.out.println(sb);
			arq.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n",
					e.getMessage());
		}
	}

}
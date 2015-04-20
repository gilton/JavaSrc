package org.lab.test.leitura01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerEmMinusculo {

	public static void main(String[] args) {
		try {
			FileReader arq = new FileReader("src/maiusculo.txt");
			BufferedReader lerArq = new BufferedReader(arq);

			String linha = "";
			
			while (linha != null) {
				System.out.printf("%s\n", linha.toLowerCase());
				linha = lerArq.readLine();
			}

			arq.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n",
					e.getMessage());
		}

		System.out.println();
	}

}

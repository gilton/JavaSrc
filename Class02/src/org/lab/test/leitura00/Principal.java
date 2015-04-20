/*
 * Arquivo exemplo para aplicações dos desafios
 * do site CodeEval, sendo este o primeiro deles feito.
 * 
 * por Gilton Assunção Inocencio do Nascimento.
 * */

package org.lab.test.leitura00;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {

		File file = new File(args[0]);
		BufferedReader in;
		try {
			in = new BufferedReader(new FileReader(file));
			String line;
			while ((line = in.readLine()) != null) {
				String[] lineArray = line.split("\\s");
				if (lineArray.length > 0) {
					System.out.println(line.toLowerCase());
				}
			}
		} catch (FileNotFoundException e) {
			System.err.printf("Arquivo não encontrado: %s.\n", e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
			e.printStackTrace();
		}
	}
}
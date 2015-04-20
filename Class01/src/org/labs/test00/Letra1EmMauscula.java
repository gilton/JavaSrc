package org.labs.test00;

public class Letra1EmMauscula {

	public static void main(String[] args) {
		String texto = "Hello world\n javaScript language\n a letter\n 1st thing";
		
		String[] list = texto.split(" ");
		texto = "";
		for (int i = 0; i < list.length; i++) {
			
			list[i] = list[i].replace(list[i].charAt(0), Character.toUpperCase(list[i].charAt(0)));
			
			if( i % 2 == 0 && i >= 0 ) {
				texto += list[i] + " ";
			} else {
				texto += list[i];
			}
			
		}
		System.out.println(texto);
	}

}

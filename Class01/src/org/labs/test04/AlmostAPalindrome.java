package org.labs.test04;

public class AlmostAPalindrome {

	private static String aux1 = "";
	private static String aux = "";
	private static boolean valido;

	public static void main(String[] args) {

		String str = "MALAYALAM".toLowerCase();
		System.out.print("'" + str + "' é quase um Palindromo?  ");
		System.out.println(isAlmostPalindrome(str));

	}

	public static double pontos(int x, int y) {
		double result = 0.0;
		return result;
	}

	public static boolean isAlmostPalindrome(String str) {

		int nValid = 0;
		int qtd = str.length() / 2;

		for (int i = 0; i < str.length() / 2; i++) {
			aux += str.charAt(i);
		}

		for (int i = 1; i <= str.length() / 2; i++) {
			aux1 += str.charAt(str.length() - i);
		}

		for (int i = 0; i < qtd; i++) {
			// System.out.println(aux.charAt(i) + " - " + aux1.charAt(i));

			if (aux.charAt(i) == aux1.charAt(i))
				valido = true;
			else
				nValid++;

			if (nValid > 1) {
				valido = false;
				break;
			} else {
				valido = true;
			}
		}

		return valido;
	}

}

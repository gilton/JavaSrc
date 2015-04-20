package org.labs.test00;

public class CapitalizeWords {

	public static void main(String[] args) {
		String texto = "Hello world javaScript language a letter 1st thing";

		String[] strs = texto.split(" ");
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < strs.length; i++) {
			strs[i] = strs[i].replace(strs[i].charAt(0), Character.toUpperCase(strs[i].charAt(0)));
			sb.append(strs[i]).append(" ");
		}
		
		 System.out.println(sb);
	}

	/**
	 * @author Gilton Nascimento.
	 * @method capitalizeString
	 * @since 11/06/2014 - 18:10:21
	 * @param string
	 * @return String
	 */
	public static String capitalizeString(String string) {
		char[] chars = string.toLowerCase().toCharArray();
		boolean found = false;
		for (int i = 0; i < chars.length; i++) {
			if (!found && Character.isLetter(chars[i])) {
				chars[i] = Character.toUpperCase(chars[i]);
				found = true;
			} else if (Character.isWhitespace(chars[i]) || chars[i] == '.'
					|| chars[i] == '\'') { // You can add other chars here
				found = false;
			}
		}
		return String.valueOf(chars);
	}

	/**
	 * @author Gilton Nascimento.
	 * @method toTitleCase
	 * @since 11/06/2014 - 18:40:04
	 * @param givenString
	 * @return String
	 */
	public static String toTitleCase(String givenString) {
		String[] arr = givenString.split(" ");
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < arr.length; i++) {
			sb.append(Character.toUpperCase(arr[i].charAt(0)))
					.append(arr[i].substring(1)).append(" ");
		}
		return sb.toString().trim();
	}

}

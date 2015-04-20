package org.labs.test01;

import java.util.Scanner;

public class FuncaoReversa {

	String FirstReverse(String str) { 
	  
	    // code goes here   
	    /* Note: In Java the return type of a function and the 
	       parameter types being passed are defined, so this return 
	       call must match the return type of the function.
	       You are free to modify the return type. */
	    String aux = "";
	    for(int i = 1; i <= str.length(); i++) {
	    	aux += str.charAt(str.length() - i);
	    }
	    return aux;
	  }
	
	public static void main(String[] args) {
		// keep this function call here
		Scanner s = new Scanner(System.in);
		FuncaoReversa c = new FuncaoReversa();
		System.out.print(c.FirstReverse(s.nextLine()));
	}

}
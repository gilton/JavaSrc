package org.labs.test02;

import java.util.Scanner;

public class Fatorial {

	int NFatorial(int num) {
		int res = 1;
		for (int i = 1; i <= num; i++) {
			res *= i;
		}
		return res;
	}

	public static void main(String[] args) {
		// keep this function call here
		Scanner s = new Scanner(System.in);
		Fatorial f = new Fatorial();
		System.out.print(f.NFatorial(s.nextInt()));
	}

}
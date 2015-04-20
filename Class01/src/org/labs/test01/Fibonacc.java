package org.labs.test01;

public class Fibonacc {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		for (int i = 0; i < 10; i++) {
			b = b + a;
			a = b - a;
			System.out.println("a: " + a + ", " + "b: " + b);
//			 System.out.print(a+" ");
			// }
		}
	}
}

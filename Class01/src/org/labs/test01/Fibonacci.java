package org.labs.test01;

public class Fibonacci {
	
	
	public static void main(String[] args) {
		for (int i = 0; i < 12; i++) {
			System.out.print(new Fibonacci().calcularFibonacci(i)+" ");
		}
	}
	
	public long calcularFibonacci( int x ){
		if( x < 2 ) return x;
		return calcularFibonacci(x-1) + calcularFibonacci(x-2);
	}
	
}

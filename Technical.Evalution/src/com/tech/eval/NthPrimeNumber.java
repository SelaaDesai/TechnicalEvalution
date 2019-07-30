package com.tech.eval;

import java.util.Scanner;

public class NthPrimeNumber {

	public static void main(String[] args) {
			Singleton tmp = Singleton.getInstance( );
		    //Scanner sc = new Scanner(System.in); //We can take user input to check any number of prime Number.
		    System.out.print("Enter n to compute the Nth prime number: ");
		    //int nth = sc.nextInt(); 
		    //Below are the Unit tests to check nth Prime number.
		    int nth=5;		     
		    System.out.println("Value of "+nth+"th prime number: " + tmp.findNthPrime(nth));
		    nth=4;		    
		    System.out.println("Value of "+nth+"th prime number: " + tmp.findNthPrime(nth));
		    nth=11;		    
		    System.out.println("Value of "+nth+"th prime number: " + tmp.findNthPrime(nth));
		    nth=15;		    
		    System.out.println("Value of "+nth+"th prime number: " + tmp.findNthPrime(nth));
	  }		
}

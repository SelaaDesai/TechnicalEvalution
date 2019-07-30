package com.tech.eval;

public class Singleton {

	private static Singleton singleton = new Singleton( );

	   /* A private Constructor prevents any other
	    * class from instantiating.
	    */
	   private Singleton() { }

	   /* Static 'instance' method */
	   public static Singleton getInstance( ) {
	      return singleton;
	   }

	   /* Other methods protected by singleton-ness */
	   protected static int findNthPrime(int nth ) {
		   int num, count, i;
		    num=1;
		    count=0;
		 
		    while (count < nth){
		      num=num+1;
		      for (i = 2; i <= num; i++){ //Here we will loop from 2 to num
		        if (num % i == 0) {
		          break;
		        }
		      }
		      if ( i == num){//if it is a prime number
		        count = count+1;
		      }
		    }
		    return num;//returning Nth prime number
	   }
}

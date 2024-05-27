// Whitney Martin

import java.util.*;
		
public class code{
	
		// this is the static method which returns the nth fibonacci number
  public static int fib(int n){
    if( n<=1)
      return n;
    
    
    	//this method is a recursive step to add the last 2 
    return fib(n-1) + fib(n-2);
  }
  
  public static void main(String args[]){
    int n =10;
    
    	//this method calls the variable with n
    int y = fib(n);
    
    
    	// this command will print the results of the sequence
    System.out.println("The "+n+"th term of the Fibonacci sequence is "+y);
  }
}


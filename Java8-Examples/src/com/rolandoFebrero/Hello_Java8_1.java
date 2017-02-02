package com.rolandoFebrero;

public class Hello_Java8_1 {
	
	/**
	  	Implementing Runnable using Lambda expression
	  	
		One of the first thing, I did with Java 8 was 
		trying to replace anonymous class with lambda expressions, 
		and what could have been best example of anonymous class then 
		implementing Runnable interface. Look at the code of implementing 
		runnable prior to Java 8, it's taking four lines, but with lambda 
		expressions, it's just taking one line. What we did here? 
		the whole anonymous class is replaced by () -> {} code block.	 
	 */

	public static void main(String[] args) {
		
		//Old way
		new Thread(new Runnable() 
		{ @Override public void run() 
			{ 
				System.out.println("Before Java8, too much code for too little to do"); 
			} 
		}).start();

		
		//Java 8 way: 
		new Thread( () -> System.out.println("In Java8, Lambda expression rocks !!") ).start();
		

	}

}

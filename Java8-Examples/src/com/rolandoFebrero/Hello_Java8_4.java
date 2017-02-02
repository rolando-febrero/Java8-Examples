package com.rolandoFebrero;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Hello_Java8_4 {
	
	/**
	  	Using Lambda expression and Functional interface Predicate
		Apart from providing support for functional programming idioms 
		at language level, Java 8 has also added a new package called java.util.function, 
		which contains lot of classes to enable functional programming in Java. 
		One of them is Predicate, By using java.util.function.
		Predicate functional interface and lambda expressions, you can 
		provide logic to API methods to add lot of dynamic behaviour 
		in less code. Following examples of Predicate in Java 8 shows 
		lot of common ways to filter Collection data in Java code. 
		Predicate interface is great for filtering.

	 */

	public static void main(String[] args) {
		List languages = Arrays.asList("Jamaica", "Peru", "Argentina", "France", "United States");

		
		System.out.println("Countries which starts with J :");
		filter(languages, (str)->((String) str).startsWith("J"));
		
		System.out.println("-----------------------------------");
		
		System.out.println("Countries which ends with a "); 
		filter(languages, (str)->((String) str).endsWith("a")); 
		
		System.out.println("-----------------------------------");
		
		System.out.println("Print all Countries :"); 
		filter(languages, (str)->true); 
		
		System.out.println("-----------------------------------");
		
		System.out.println("Print no Countries : "); 
		filter(languages, (str)->false); 
		
		System.out.println("-----------------------------------");
		
		System.out.println("Print Countries whose length greater than 4:"); 
		filter(languages, (str)->((String) str).length() > 4);
				

	}
	@SuppressWarnings("unchecked")
	public static void filter(List names, Predicate condition) { 
		names.stream().filter((name) -> (condition.test(name))).forEach((name) -> { 
			System.out.println(name + " "); 
			}); 
	}
	
	/**
	  	You can see that filter method from Stream API also accept a Predicate, 
	  	which means you can actually replace our custom filter() method with the 
	  	in-line code written inside it, that's the power of lambda expression. 
	  	By the way, Predicate interface also allows you test for multiple 
	  	condition, which we will see in our next example.

	 */
	

}

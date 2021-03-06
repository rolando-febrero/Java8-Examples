package com.rolandoFebrero;

import java.util.Arrays;
import java.util.List;

public class Hello_Java8_3 {
	
	/**
	  	Iterating over List using Lambda expressions
	  	
		If you are doing Java for few years, you know that most common 
		operation with Collection classes are iterating over them and 
		applying business logic on each elements, for example processing a 
		list of orders, trades and events. Since Java is an imperative 
		language, all code looping code written prior to Java 8 was sequential i.e. 
		their is on simple way to do parallel processing of list items. 
		If you want to do parallel filtering, you need to write your own code, 
		which is not as easy as it looks. Introduction of lambda expression and 
		default methods has separated what to do from how to do, which means now 
		Java Collection knows how to iterate, and they can now provide parallel 
		processing of Collection elements at API level. In below example, 
		I have shown you how to iterate over List using with and without 
		lambda expressions, you can see that now List has a forEach() method, 
		which can iterate through all objects and can apply whatever you ask 
		using lambda code.
	 */

	public static void main(String[] args) {
		
		List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
		
		//Old way, Prior Java 8 : 
		for (String feature : features) 
		{ 
			System.out.println(feature); 
		} 
		
		System.out.println("------------------");
		
		//In Java 8:		 
		features.forEach(n -> System.out.println(n)); 
		
		System.out.println("------------------");
		
		// Even better use Method reference feature of Java 8 
		// method reference is denoted by :: (double colon) operator 
		// looks similar to score resolution operator of C++ 
		features.forEach(System.out::println); 

		

	}

}

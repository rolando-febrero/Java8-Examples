package com.rolandoFebrero;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Hello_Java8_5 {

	/**
	  	How to combine Predicate in Lambda Expressions
	  	
		As I said in previous example, java.util.function.
		Predicate allows you to combine two or more Predicate 
		into one. It provides methods similar to logical operator 
		AND and OR named as and(), or() and xor(), which can be used 
		to combine the condition you are passing to filter() method. 
		For example, In order to get all languages, which starts 
		with J and are four character long, you can define two 
		separate Predicate instance covering each condition and 
		then combine them using Predicate.and() method, as shown 
		in below example :

	 */
	
	public static void main(String[] args) {
		
//		List languages = Arrays.asList("Jamaica", "Peru", "Argentina", "France", "United States");
//		
//		// We can even combine Predicate using and(), or() And xor() logical functions 
//		// for example to find names, which starts with J and four letters long, you 
//		// can pass combination of two Predicate
//
//		
//		Predicate<String> startsWithJ = (n) -> n.startsWith("J"); 
//		Predicate<String> fourLetterLong = (n) -> n.length() == 4; 
//		
//		names.stream() 
//			.filter(startsWithJ.and(fourLetterLong)) 
//			.forEach((n) -> System.out.print("\nName, which starts with 'J' and four letter long is : " + n));
				

	}

}

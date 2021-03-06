package com.rolandoFebrero;

import java.util.Arrays;
import java.util.List;

public class Hello_Java8_6 {

	/**	 
	 * Map Reduce example using Lambda Expressions in Java 8
 
	 * Function called reduce() can combine all values into one. 
	 * Map and Reduce operations are core of functional programming, 
	 * reduce is also known as fold operation because of its folding nature. 
	 * By the way reduce is not a new operation,  you might have been already using it. 
	 * If you can recall SQL aggregate functions like sum(), avg() or count(), 
	 * they are actually reduce operation because they accept multiple values 
	 * and return a single value. Stream API defines reduce() function 
	 * which can accept a lambda expression, and combine all values. 
	 * Stream classes like IntStream has built-in methods like average(), count(), 
	 * sum() to perform reduce operations and mapToLong(), mapToDouble() methods 
	 * for transformations. It doesn't limit you, you can either use built-in 
	 * reduce function or can define yours. In this Java 8 Map Reduce example, 
	 * we are first applying 0.06% TAX on all prices and then calculating total of 
	 * that by using reduce() method.
	 */
	
	public static void main(String[] args) {
		
		List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
		
		// Applying 0.06% TAX on each purchase 
		
		// Old way:	
		double total = 0; 
		for (Integer cost : costBeforeTax) 
		{ 
			double price = cost + .06*cost; 
			total = total + price; 
		} 
		System.out.println("Total : " + total);
		
		
		// New way:		
		double bill = costBeforeTax.stream().map((cost) -> cost + .06*cost)
				.reduce((sum, cost) -> sum + cost)
				.get(); 
		System.out.println("Total : " + bill); 

		
	}

}

package com.rolandoFebrero;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Hello_Java8_8 {

	/**
	 * 	Applying function on Each element of List
	 * 
		We often need to apply certain function to each element of 
		List e.g. multiplying each element by certain number or dividing it, 
		or doing anything with that. Those operations are perfectly suited 
		for map() method, you can supply your transformation logic to map() method 
		as lambda expression and it will transform each element of that 
		collection, as shown in below example.
	 */
	
	public static void main(String[] args) {
		// Convert String to Uppercase and join them using coma 
		List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada"); 
		String G7Countries = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", ")); 
		System.out.println(G7Countries);

		

	}

}

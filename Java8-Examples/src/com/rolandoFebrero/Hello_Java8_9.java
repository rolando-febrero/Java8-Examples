package com.rolandoFebrero;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Hello_Java8_9 {
	
	/**
	  	Creating a Sub List by Copying distinct values 
	  	
		This example shows how you can take advantage of distinct() method 
		of Stream class to filter duplicates in Collection.
	 */

	public static void main(String[] args) {

		// Create List of square of all distinct numbers 
		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4); 
		List<Integer> distinct = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList()); 
		System.out.printf("Original List : %s, \n Square Without duplicates : %s %n", numbers, distinct);

		

	}

}

package com.rolandoFebrero;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Hello_Java8_10 {
	
	/**
	 * 	Calculating Maximum, Minimum, Sum and Average of List elements
	 * 
		There is a very useful method called summaryStattics() in stream classes 
		like IntStream, LongStream and DoubleStream. Which returns returns an 
		IntSummaryStatistics, LongSummaryStatistics or DoubleSummaryStatistics 
		describing various summary data about the elements of this stream. 
		In following example, we have used this method to calculate maximum 
		and minimum number in a List. It also has getSum() and getAverage() 
		which can give sum and average of all numbers from List.
	 */

	public static void main(String[] args) {

		//Get count, min, max, sum, and average for numbers 
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29); 
		IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics(); 
		
		System.out.println("Highest prime number in List : " + stats.getMax()); 
		System.out.println("Lowest prime number in List : " + stats.getMin()); 
		System.out.println("Sum of all prime numbers : " + stats.getSum()); 
		System.out.println("Average of all prime numbers : " + stats.getAverage());

		

	}

}

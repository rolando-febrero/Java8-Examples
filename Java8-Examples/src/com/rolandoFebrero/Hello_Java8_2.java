package com.rolandoFebrero;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Hello_Java8_2 {	
	/**
	  	Event handling using Java 8 Lambda expressions
	  	
		If you have ever done coding in Swing API, 
		you will never forget writing event listener code. 
		This is another classic use case of plain old Anonymous class, 
		but no more. You can write better event listener code using 
		lambda expressions as shown below.
	 */
	
	public static void main(String[] args) {
		//----> It needs GUI to compile
		
		// Before Java 8: 
		JButton show = new JButton("Show"); 
		show.addActionListener(new ActionListener() { 
			@Override public void actionPerformed(ActionEvent e) { 
				System.out.println("Event handling without lambda expression is boring"); 
				} 
			}); 
		
		// Java 8 way: 
		show.addActionListener((e) -> { System.out.println("Light, Camera, Action !! Lambda expressions Rocks"); });

		
	}

}

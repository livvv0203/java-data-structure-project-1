package com.jieqing;
/**
 * Test program for the progression hierarchy
 */
public class TestProgression 
{
	public static void main(String[] args)
	{
		Progression Prog; 
		// Test with default constructor
		System.out.print("Hw1Progression with default constructor: ");
		Prog = new Progression_1(); //Declare and initialize
		Prog.printProgression(10); // Print the first 10 values on the screen
		
		// Test with 5 as the start value
		System.out.print("Hw1Progression with 5 as the start value: ");
		Prog = new Progression_1(5);
		Prog.printProgression(10); //Print the first 10 values on the screen
	}
	
}

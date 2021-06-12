package com.jieqing;

public class Progression
{
	protected long current; // instance variable

	public Progression() { this(0);} // Constructs a progression starting at 0

	public Progression(long start) { current = start; } //Constructs a progression with given start value

	//Returns the next value of the progression
	public long nextValue()
	{
		long answer = current;
		advance();  //The protected call is for advancing the current value
		return answer;
	}

	protected void advance() //Advance the value to the next value of the progression
	{
		current ++;
	}

	public void printProgression(int n)
	{
		System.out.print(nextValue()); // print first value without leading space
		for (int j=1; j < n; j++)
			System.out.print(" " + nextValue( )); // print leading space before others
		System.out.println();
	}
}

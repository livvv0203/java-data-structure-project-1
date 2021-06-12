package com.jieqing;
/**
 * Generates a progression with natural numbers (Progression: By default:0, 1, 2, ...)
 * with required conditions.
 */
public class Progression_1 extends Progression {

    public Progression_1()
    {
        this(1); // Starting at 1 with base of 2
    }

    // Constructs Hw1Progression with base 2 and start
    public Progression_1(long start)
    {
        super(start); //invoke the super class constructor

    }

    // Override the protected advance method
    // Multiple the current value by the base and then minus the increment 1

    protected void advance()
    {
        if ( current % 6 == 0) // Current value is evenly divisible by both 2 and 3
        {
            current = 2 * current -1;
        }

        else if (current % 2 == 0 )	// Current value is evenly divisible by 2
        {
            current = 2 * current - 1;
        }
        else if (current % 3 == 0) // Current value is evenly divisible by 3
        {
            current = 3 * current - 2;
        }
        else
        {
            current ++; // Current value is not evenly divisible by either 2 or 3
        }
    }
}








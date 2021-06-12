package com.jieqing;

public class Project_1 {

    public int sumOfSquaresOfOdds (int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                sum += i * i; // Sum of Squares of Odds
            }
        }
        return sum;
    }
    /**
     * shuffle an incoming array of int by reverse the elements' order.
     *
     * @param a incoming array of int to be shuffled
     * @return the array after shuffle operation
     */
    public int[] shuffle (int[] a)
    {
        int arraySize = a.length; // Declare the length of the array
        int[] resultArray = new int[arraySize]; // Declare and initialized the array

        // get array's size and divide by 2, this floors the result to integer.
        int halfOfArraySize = a.length / 2 ;

        if (arraySize % 2 == 0)  //check if array size is even.
        {
            // When array is Even

            // loop the second half of the original array and assign each element into the resulting array's first half
            for (int i = 0; i < halfOfArraySize; i++) // loop for swapping first half of the array
            {
                resultArray[i] = a[i + halfOfArraySize];	// i + halfOfArraySize points to the corresponding second half's index.
            }
            // loop the first half of the original array and assign each element into the resulting array's second half
            for (int i = halfOfArraySize; i < arraySize; i++) // loop for swapping the rest half of the array
            {
                resultArray[i] = a[i - halfOfArraySize];// i - halfOfArraySize points to the corresponding first half's index.
            }
        }
        else // if (arraySize % 2 == 1)  //otherwise this is odd.
        {
            // When array is Odd

            // First half
            for (int i = 0; i < halfOfArraySize; i++)
            {
                resultArray[i] = a[i + halfOfArraySize + 1]; //add extra 1 to skip the middle item.
            }
            // Second half
            for (int i = halfOfArraySize + 1; i < arraySize; i++)
            {
                resultArray[i] = a[i - halfOfArraySize -1]; //minus 1 to skip the middle item.
            }
            // Middle One
            resultArray[halfOfArraySize] = a[halfOfArraySize]; //middle item stays the same.
        }

        return resultArray;

    }

    public double[] statistics (double[] a)
    {
        double max = a[0];
        double min = a[0];
        double average = 0.0d;
        double sum = 0.0d;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] > max) //Calculates the largest number
            {
                max = a[i];
            }
            if (a[i] < min) //Calculates the smallest number
            {
                min = a[i];
            }

            sum += a[i];
            average = sum / a.length; //Get the average of all numbers in array
        }

        double[] arr = {max, min, average};
        return arr;
    }

    // Write a main method to test above three methods:
    public static void main (String[] args)
    {

        Project_1 p = new Project_1();
        System.out.print("The Sum (n = 10) is: ");  //print the string
        System.out.print(p.sumOfSquaresOfOdds(10)); //invoke the method and print out the result

        System.out.print("\nThe Sum (n = 20) is: ");
        System.out.print(p.sumOfSquaresOfOdds(20));

        //Create an array with 20 integers
        System.out.print("\nThe result(20 integers) is: ");
        int[] testData = {5, -3, 7, 8, 1, 24, 10, 3, 32, 48, 2, 6, 9, 18, 15, 16, 4, 7, 8, 25};
        int[] r;
        r = p.shuffle(testData); //invoked the method


        for (int i = 0; i < r.length; i++) //loop for printing the numbers in array
        {
            System.out.print(r[i] + " ");
        }

        // Create an array with 21 integers
        System.out.print("\nThe result(21 integers) is: ");
        int[] testData21 = {5, -3, 7, 8, 1, 24, 10, 3, 32, 48, 2, 6, 9, 18, 15, 16, 4, 7, 8, 25, 88};

        r = p.shuffle(testData21);
        for (int i = 0; i < r.length; i++) //loop for printing the numbers in array
        {
            System.out.print(r[i] + " ");
        }

        //Create an array with 10 double numbers
        System.out.print("\nThe result(max, min, average)is: ");
        double[] array1 = {1.0d, 2.0d, 3.0d, 4.0d, 5.0d, 6.0d, 7.0d, 8.0d, 9.0d, 10.0d};
        double[] outputArray;
        outputArray = p.statistics(array1); //invoke the method
        for (int i = 0; i < 3; i++)  //loop for printing the required array
        {
            System.out.print(outputArray[i] + " ");
        }
        // Repeat with different set of 10 double numbers.
        System.out.print("\nThe result(max, min, average)is: "); //print line
        double[] array2 = {1.5d, 2.5d, 6.8d, 4.0d, 7.2d, 9.1d, 5.2d, 1.8d, 4.0d, 1.0d};
        outputArray = p.statistics(array2); //invoke the method

        for (int i = 0; i < 3; i++)  //loop for printing the required array
        {
            System.out.print(outputArray[i] + " ");

        }
    }

} // end of class



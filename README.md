# Boston University MSCS Data Structure 
 
- Write a Java method named sumOfSquaresOfOdds that receives an integer n and returns
the sum of squares of all positive odd integers less than or equal to n.

- Write a Java method named shuffle that receives an array of integers and exchanges the
first half of the array with the second half of the array.

- Write a Java method named statistics that receives an array of double numbers, calculates the largest number, the smallest number, and the average of all numbers. The method, then, stores these three statistics, in that order, in an array of size 3 and returns the array.

- Write a main method to test above three methods:
o Invoke sumOfSquaresOfOdds twice once with n =10 and then with n = 20, and print each result on the screen.
o Create an array with 20 integers, invoke shuffle and pass this array as an argument, and print the result on the screen. Repeat this with 21 integers.
o Create an array with 10 double numbers, and invoke statistics and pass this array as an argument, and print the result (max, min, average) on the screen. Repeat this with different set of 10 double numbers.

- progression generates a sequence of natural numbers and the next value is determined as follows:
• If the current value x is evenly divisible by 2, the next value is 2x – 1.
• If the current value x is evenly divisible by 3, the next value is 3x – 2.
• Otherwise, the next value is x + 1.
• Note that if the current value is evenly divisible by both 2 and 3 (such as 6 or 12), then the
next value should be 2x – 1.
• For example,
If the first value of the sequence is 1 (default value), the following sequence is created:
             1 2 3 7 8 15 43 44 87 259
If the first value of the sequence is 4, the following sequence is created:
4 7 8 15 43 44 87 259 260 519


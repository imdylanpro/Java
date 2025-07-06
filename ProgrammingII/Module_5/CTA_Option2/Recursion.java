// Dylan Nelson
// February 11, 2025
// Recursion.java

/* This program will perform a recursive action; providing the summation of numbers supplied 
 * by a user (default = 5). The amount can be edited by changing the numbers that are defined 
 * in the main() method. 
*/

import java.util.Scanner;

public class Recursion {
    public static int ProductRecursion(int resultN, int iterationCount, Scanner myScan) {
        if (iterationCount == 0) {
            // Print out the final result for the user one last time now that the base case was met.
            System.out.println("The final result is " + resultN);
        }
        else {
            // Tell the user to enter a number. Use the scanner that was passed in to scan the users input
            //  then tell the user what they just entered.
            System.out.print("Please enter a number: ");
            Integer myNumber = myScan.nextInt();
            System.out.println("You just entered: " + myNumber);
            
            // Print a few lines to the console to let the user know what is happening. This is where the
            //  value is calculated for the next recursive call.
            System.out.print("Iterations left = " + (iterationCount - 1));
            System.out.print(" | Operation Performed = " + resultN + " + " + myNumber);
            resultN = resultN + myNumber;
            System.out.println(" | Result = " + resultN);

            // Call the method again and decrement the iterationCount variable.
            ProductRecursion(resultN, iterationCount-1, myScan);
        }
        return 0;
    }
    public static void main(String[] args) {
        
        // Here we define the variables that will be passed into the recursive program.
        //  We want the initial value to be 0 and we want 5 iterations of the recursive method.
        int startValue = 0;
        int iterations = 5;
        Scanner myScan = new Scanner(System.in);

        // This is the first call to the recursive method.
        ProductRecursion(startValue, iterations, myScan);

        // Close the scanner so there is no memory leakage or waste.
        myScan.close();
    }
}

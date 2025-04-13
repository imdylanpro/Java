// Dylan Nelson
// April 06, 2025
// numberFinder.java

/* This java script finds the missing number in an array that contains
 * elements that are from n to n + 1 of the size of the array.
 */

public class numberFinder {

    public static void main(String[] args) {

        // Create the array
        int myArray[] = {3, 6, 5, 1, 4};
        
        // Create the variables for the loop.
        int lengthTest = myArray.length;
        int totalNumber = 0;
        int summationNumber = 0;

        // Create the for loop to iterate through the array.
        for (int i = 0; i <= lengthTest; i++) {
            // State what loop we are in.
            System.out.println("Loop " + (i+1) + ": ");

            // Test if the length of the array has been iterated through.
            if (i < lengthTest) {
                // Add to the summationNumber and the totalNumber.
                summationNumber += myArray[i];
                totalNumber += i+1;
            } else {
                // Adds the number to the totalNumber count even after going 
                //  through the full range of the array.
                totalNumber += i+1;
            }

            // Declare what the summation and total count is.
            System.out.println("SummationNumber = " + summationNumber);
            System.out.println("totalNumber = " + totalNumber);
        }

        // Subtract the two values, and that is the number that was omitted.
        System.out.println("The missing number is: " + (totalNumber - summationNumber));
    }
}

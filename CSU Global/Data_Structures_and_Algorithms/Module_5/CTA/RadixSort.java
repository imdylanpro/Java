// Dylan Nelson
// April 20, 2025
// RadixSort.java

/* This java program implements a radix sort algorithm to an integer array. */

import java.util.Arrays;

public class RadixSort {

    public static int maxNum(int[] array) {
        int maxNum = array[0];
        int length = array.length;

        // Iterate through the array grabbing the maximum value.
        for (int i = 1; i < length; i++) {
            if (maxNum < array[i]) {
                maxNum = array[i];
            }
        }
        
        return maxNum;
    }

    public static void countSort(int[] array, int base) {
        // Get the length of the original array.
        int length = array.length;
        
        // Create the array to hold the buckets for sorting, output array, and 
        //  the variable to use for for loops.
        int[] outputArray = new int[length];
        // bucketArray has 10 slots, one for each digit: 0-9.
        int[] bucketArray = new int[10];
        int i;
        // targetDigit is the current digit that is being looked at.
        int targetDigit;

        // Fill the bucketArray with 0.
        Arrays.fill(bucketArray, 0);

        for (i = 0; i < length; i++) {
            // Iterate through each element of the input array, shifting the 
            //  digit that is being analyzed by the base. Using Modulus 10, 
            //  the remainder is collected. 
            targetDigit = (array[i] / base); 
            // The position in bucketArray is then incremented.
            bucketArray[(targetDigit) % 10]++;
        }

        // Adjust the bucketArray into a cumulative count array.
        for (i = 1; i < 10; i++) {
            bucketArray[i] += bucketArray[i - 1]; 
        }

        // Create the outputArray.
        for (i = length - 1; i >= 0; i--) {
            targetDigit = (array[i] / base);
            // Place the item in the slot it belongs to.
            outputArray[bucketArray[targetDigit % 10] - 1] = array[i];
            // The position in bucketArray is decremented now that the number 
            //  has been used.
            bucketArray[targetDigit % 10]--;
        }

        // Set the input array to equal the output array.
        for (i = 0; i < length; i++) {
            array[i] = outputArray[i];
        }
    } 

    public static void radixSort(int[] array) {
        
        // Get the maximum number in the array, this will get the 
        //  max base for the radix sort algorithm.
        int maxNum = maxNum(array);

        // Iterate through each base unit determined from the maximum number.
        for (int base = 1; maxNum / base > 0; base *= 10) {
            countSort(array, base);
        }
    }

    public static void main(String[] args) {
        int myArray[] = {783, 99, 472, 182, 264, 543, 356, 295, 692, 491, 94};

        // Print out the array before sorting.
        System.out.print("Array before sorting: ");
        for (int item : myArray) {
            System.out.print(item + ", ");
        }

        radixSort(myArray);

        // Print out the array after sorting.
        System.out.print("\nArray after sorting: ");
        for (int item : myArray) {
            System.out.print(item + ", ");
        }
    }
}

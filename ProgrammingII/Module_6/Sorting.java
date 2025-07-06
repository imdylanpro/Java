// Dylan Nelson
// February 20, 2025
// Sorting.java

import java.util.Arrays;

public class Sorting {
    public static void sort(int[] myArray) {
        
        int switcherVariable = 0;
        System.out.println(Arrays.toString(myArray));

        for (int i = 0; i < (myArray.length - 1) ; i++) {
            for (int j = 0; j < (myArray.length - 1); j++) {
                if (myArray[j] > myArray[j+1]) {
                    switcherVariable = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = switcherVariable; 
                } 
            }
        }

        System.out.println(Arrays.toString(myArray));
    }

    public static void main(String[] args) {

        // Add the values to the array
        int[] myArray = {2, 25, 37, 16, 45};
        sort(myArray);
    }
}

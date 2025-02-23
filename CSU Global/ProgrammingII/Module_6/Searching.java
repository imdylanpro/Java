// Dylan Nelson
// February 20, 2025
// Searching.java

import java.util.Scanner;

public class Searching {
    public static void sort(int[] currentArray, int searchingInteger) {
        
        int indexTracker = 0;

        for (int i = 0; i < (currentArray.length - 1); i++) {
            if (currentArray[i] == searchingInteger) {
                indexTracker = i;
            }
        }

        if (indexTracker != 0) {
            System.out.println("Number found, it is at index: " + indexTracker);
        } else {
            System.out.println("Unable to find specified number.");
        }
    }

    public static void main(String[] args) {
        int[] myArray = {1, 40, 2, 42, 26, 725, 324, 235, 637, 3, 3526, 232, 6,
                         7234, 1};
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What number would you like to look for? ");
        int searchingInteger = myScanner.nextInt();
        sort(myArray, searchingInteger);
    }
}

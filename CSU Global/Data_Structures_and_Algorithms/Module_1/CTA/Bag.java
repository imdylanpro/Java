// Dylan Nelson
// March 19, 2025
// Bag.java

/* This java file will create the Abstract Data Type (ADT)
 * container bag. This version of a bag will implement the 
 * linked list structure. Providing abstraction for the user
 * so they do no need to know the underlying structure.
 * 
 * The Bag created here has the following methods: Bag, getCurrentSize,
 * isEmpty, add, remove, remove(specific entry), clear, getFrequency of,
 * contains.
 */

import java.util.LinkedList;

public class Bag<T> {
    private LinkedList<T> contents;

    // Creates an instance of the Bag as a Linked List.
    public Bag() {
        contents = new LinkedList<>();
    }

    // Method that will return an integer of the current size of the Bag.
    public int getCurrentSize() {
        return contents.size();
    }

    // Method that checks if the Bag is empty.
    public boolean isEmpty() {
        if (contents.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    // Adds an item to the Bag.
    public boolean add(T newEntry) {
        try {
            contents.add(newEntry);
            return true;
        } catch(Exception e) {
            System.out.println("Unable to add the item to the bag.");
            return false;
        }
    }

    // Removes the item at the head of the bag and will return it as well.
    public T remove() {
        return contents.remove();
    }

    public boolean remove(T anEntry) {
        try {
            // Successfully removing the specified value returns a boolean true.
            contents.remove(anEntry);
            return true;
        } catch (Exception e) {
            // If unable to remove the specified value return a boolean false.
            return false;
        }
    }

    // Method to clear all contents from the Bag. No need to return a value.
    public void clear() {
        // Clears the bag completely.
        contents.clear();
    }

    // This method will get the number of occurrances that a specific parameter
    //  appears in the Bag.
    public int getFrequencyOf(T anEntry) {
        int frequencyCounter = 0;

        // Looks at each occurance of an item in the Bag.
        for (int i = 0; i < contents.size(); i++) {
            // Determining if the value currently being analyzed in the for loop
            //  is equal to anEntry.
            if (contents.get(i) == anEntry) {
                // Increment the counter.
                frequencyCounter++;
            }
        }
        // Return the counter, showing how many times the element appeared in 
        //  the Bag.
        return frequencyCounter;
    }

    // This method will return the item that is a the index supplied.
    public T get(int anEntry) {
        return contents.get(anEntry);
    }

    // Method to determine if the Bag contains a specific entry.
    public boolean contains(T anEntry) {
        // True if it does contain, false if it does not.
        return contents.contains(anEntry);
    }

    public static void main(String[] args) {
        // Create an instance of the bag as myCoinCollection.
        Bag<Integer> myCoinCollection = new Bag<>();

        // Starting by testing the methods specifically outlined in the CTA.
        System.out.println("Here are the methods specifically called out by " + 
                            "the Critical Thinking Assignment to test: ");

        // Here we will add multiple different items to the newly created Bag.
        myCoinCollection.add(1);
        myCoinCollection.add(5);
        myCoinCollection.add(10);
        myCoinCollection.add(25);
        myCoinCollection.add(50);
        myCoinCollection.add(5);

        // Print out the contents of the Bag.
        System.out.print("Contents of the Bag: ");
        for (int i = 0; i < myCoinCollection.getCurrentSize(); i++) {
            System.out.print(myCoinCollection.get(i) + ", ");
        }
        System.out.print("\n");

        // Here we further test the functionality of the methods.

        // Testing the contains method.
        System.out.println("Checking if the Bag contains a 50: " +
                            myCoinCollection.contains(50));
        System.out.println("Checking if the Bag contains a 47: " +
                            myCoinCollection.contains(47));
        
        // Testing the "getFrequencyOf" method AKA "count" method.
        System.out.println("Amount of times 5 appears in Bag: " + 
                            myCoinCollection.getFrequencyOf(5));
        System.out.println("Amount of times 50 appears in Bag: " + 
                            myCoinCollection.getFrequencyOf(50));

        // Removing an element from the Bag.
        System.out.println("Removing an element from the Bag. Here a 50 is " + 
                            "removed. Returns a true if successful, and false " + 
                            "if not: " + myCoinCollection.remove(50));

        // Print out the contents of the Bag again.
        System.out.print("Contents of the Bag: ");
        for (int i = 0; i < myCoinCollection.getCurrentSize(); i++) {
            System.out.print(myCoinCollection.get(i) + ", ");
        }
        System.out.print("\n");

        // Testing the contains method for the removed element.
        System.out.println("Checking if the Bag contains a 50: " +
                            myCoinCollection.contains(50));

        // Testing the "getFrequencyOf" method AKA "count" method for the removed 
        //  element.
        System.out.println("Amount of times 50 appears in Bag: " + 
                            myCoinCollection.getFrequencyOf(50));

        // Testing the remaining methods that were not specifically called out in the 
        //  CTA requirements.
        System.out.println("\nNow we will test the methods that were created, but not " + 
                            "Specifically called out in the Critical Thinking Assignment: ");
        System.out.println("The size of the Bag is: " + 
                            myCoinCollection.getCurrentSize());
        // Add another 10.
        System.out.println("Adding another 10 to the Bag." ); 
        myCoinCollection.add(10);
        // Report the size again to show that it increased with the addition of the 10.
        System.out.println("The size of the Bag is: " + 
                            myCoinCollection.getCurrentSize());
        // Check if the Bag is empty.
        System.out.println("True if the Bag is empty, False if not: " + 
                            myCoinCollection.isEmpty());
        // Clear the Bag.
        System.out.println("Clearing the Bag.");
        myCoinCollection.clear();
        // Report the size of the Bag now that it is empty.
        System.out.println("The size of the Bag is: " + 
                            myCoinCollection.getCurrentSize());
        // Finally test the method isEmpty to show the Bag has been cleared.
        System.out.println("True if the Bag is empty, False if not: " + 
                            myCoinCollection.isEmpty());
    }
}

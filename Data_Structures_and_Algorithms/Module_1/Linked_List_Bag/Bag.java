// Dylan Nelson
// March 19, 2025
// Bag.java

/* This java file will create the Abstract Data Type (ADT)
 * container bag. This version of a bag will implement the 
 * linked list structure. Providing abstraction for the user
 * so they do no need to know the underlying structure.
 */

import java.util.LinkedList;

public class Bag<T> {
    private LinkedList<T> contents;

    // Creates an instance of the Bag as a Linked List.
    public Bag() {
        contents = new LinkedList<>();
    }

    // Method that will return an integet of the current size of the Bag.
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

    // Method to determine if the Bag contains a specific entry.
    public boolean contains(T anEntry) {
        // True if it does contain, false if it does not.
        return contents.contains(anEntry);
    }

    @SuppressWarnings("unchecked")
    public T[] toArray() {
        T[] bagArray = (T[]) new Object[contents.size()];
    
        for (int i = 0; i < contents.size(); i++) {
            bagArray[i] = contents.get(i);
        }
        return bagArray;
        // return contents.toArray((T[]) new Object[contents.size()]);
    }
}

    
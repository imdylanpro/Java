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
 * contains, 
 */

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Bag<T> {
    private LinkedList<T> contents;

    // Creates an instance of the Bag as a Linked List.
    public Bag() {
        contents = new LinkedList<>();
    }

    // Method that will return an integer of the current size of the Bag.
    public int size() {
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
        } catch (NoSuchElementException e) {
            // If unable to remove the specified value return a boolean false.\
            System.out.println("Unable to find that element.");
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

    // Merges two bags together into the contents Bag.
    public void merge(Bag<T> inputBag) {

        // Get the length of the input bag.
        int length = inputBag.size();

        // for each element in the inputBag add it to the original bag.
        for (int i = 0; i < length; i++) {
            contents.add(inputBag.get(i));
        }
    }

    // Creates and returns a new Bag object returning only 1 instance of each 
    //  element, essentially deleting the duplicates.
    public Bag<T> distinct() {
        
        // Create the bag that will be returned.
        Bag<T> outputBag = new Bag<>();

        // Get the length of the input Bag to iterate through all of the elements.
        int length = contents.size();
        
        for (int i = 0; i < length; i++) {

            // Specify the element that we will analyze
            T analyzedElement = contents.get(i);

            // If the output bag does not contain the analyzed element then it is added.
            if (!outputBag.contains(analyzedElement)) {
                outputBag.add(analyzedElement);
            }
        }

        return outputBag;
    }

    public static void main(String[] args) {
        // Create an instance of the bag as myCoinCollection.
        Bag<Integer> myCoinCollection = new Bag<>();

        // Starting by testing the methods specifically outlined in the CTA.
        System.out.println("Creating bag number 1: myCoinCollection.");

        // Here we will add multiple different items to the newly created Bag.
        myCoinCollection.add(5);
        myCoinCollection.add(10);
        myCoinCollection.add(50);
        myCoinCollection.add(5);

        // Print the size of myCoinCollection.
        System.out.println("The size of myCoinCollection Bag is: " + 
                            myCoinCollection.size());

        // Print out the contents of the Bag.
        System.out.print("Contents of the myCoinCollection Bag: ");
        for (int i = 0; i < myCoinCollection.size(); i++) {
            System.out.print(myCoinCollection.get(i) + ", ");
        }
        System.out.print("\n");
        
        // Create another bag and add some more coins to it.
        Bag<Integer> mySecondCoinCollection = new Bag<>();

        // Here we will add multiple different items to the newly created second Bag.
        mySecondCoinCollection.add(1);
        mySecondCoinCollection.add(1);
        mySecondCoinCollection.add(25);
        mySecondCoinCollection.add(25);
        mySecondCoinCollection.add(10);
        mySecondCoinCollection.add(50);

        // Print the size of mySecondCoinCollection.
        System.out.println("The size of mySecondCoinCollection Bag is: " + 
                            mySecondCoinCollection.size());

        // Print out the contents of the Bag.
        System.out.print("Contents of the mySecondCoinCollection Bag: ");
        for (int i = 0; i < mySecondCoinCollection.size(); i++) {
            System.out.print(mySecondCoinCollection.get(i) + ", ");
        }
        System.out.print("\n");

        System.out.println("Merging myCoinCollection and mySecondCoinCollection.");
        // Merge the two bags.
        myCoinCollection.merge(mySecondCoinCollection);

        System.out.println("myCoinCollection size: " + myCoinCollection.size());

        // Print out the contents of the fist Bag now that they were merged.
        System.out.print("Contents of the merged Bag: ");
        for (int i = 0; i < myCoinCollection.size(); i++) {
            System.out.print(myCoinCollection.get(i) + ", ");
        }
        System.out.print("\n");

        Bag<Integer> distinctBag = new Bag<>();
        distinctBag = myCoinCollection.distinct();

        // Print out the contents of the distinct Bag.
        System.out.print("Contents of the distinct Bag: ");
        for (int i = 0; i < distinctBag.size(); i++) {
            System.out.print(distinctBag.get(i) + ", ");
        }
        System.out.print("\n");
    }
}

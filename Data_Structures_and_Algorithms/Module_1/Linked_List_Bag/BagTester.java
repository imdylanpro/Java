// Dylan Nelson
// March 19, 2025
// BagTester.java

/* This java script tests the functionality of the Bag.java file.
 * It will test each method that the Bag class has to offer on a
 * Bag object.
 */

class BagTester {

    public static void main(String[] args) {

        // Create the myCoinCollection 
        Bag<Integer> myCoinCollection = new Bag<>();

        myCoinCollection.add(1);
        myCoinCollection.add(5);
        myCoinCollection.add(10);
        myCoinCollection.add(25);
        myCoinCollection.add(50);
        myCoinCollection.add(5);

        System.out.println("The size of the Bag is: " + 
                            myCoinCollection.getCurrentSize());

        System.out.println("Adding another 10 to the Bag." ); 
        myCoinCollection.add(10);

        System.out.println("The size of the Bag is: " + 
                            myCoinCollection.getCurrentSize());
    
        System.out.println("True if the Bag is empty, False if not: " + 
                            myCoinCollection.isEmpty());

        System.out.println("Removes an element from the Bag. Returns a true if successful, and false if not: " + 
                            myCoinCollection.remove(5));
        
        System.out.println("Amount of times 5 appears in Bag: " + 
                            myCoinCollection.getFrequencyOf(5));

        System.out.println("Checking if the Bag contains a 50: " +
                            myCoinCollection.contains(50));

        System.out.println("Checking if the Bag contains a 47: " +
                            myCoinCollection.contains(47));

        System.out.println("Clearing the Bag.");
        myCoinCollection.clear();

        System.out.println("The size of the Bag is: " + 
                            myCoinCollection.getCurrentSize());

        System.out.println("True if the Bag is empty, False if not: " + 
                            myCoinCollection.isEmpty());
    }
}


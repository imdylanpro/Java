// Dylan Nelson
// March 19, 2025
// Bag.java

/* This java file creates the Baga Abstract Data Type.
 * Implementing the Iterable interface. This example creates 
 * a bag collection type from scratch without using a different
 * structure type.
*/

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Bag<T> implements Iterable {
    private Node firstNode;
    private int sizeOfBag;

    private class Node {
        T item;
        Node next;
    }

    // Creates an instance of the bag that is empty.
    public Bag() {
        firstNode = null;
        sizeOfBag = 0;
    }

    // Adds an item to the bag.
    public void add(T item) {
        Node nextNode = firstNode;

        firstNode = new Node();
        firstNode.item = item;
        firstNode.next = nextNode;
        sizeOfBag += 1;
    }

    // Removes an item from the bag.
    public boolean remove(T item) {
        if (firstNode == null)
            return false;

        if (firstNode.item.equals(item)) {
            firstNode = firstNode.next;
            return true;
        }

        Node current = firstNode;
        while (current.next != null) {
            if (current.next.item.equals(item)) {

            current.next = current.next.next;

            sizeOfBag -= 1;
            return true;
        }
        current = current.next;
    }
    return false;
    }

    // Returns the size of the bag
    public int size() {
        return sizeOfBag;
    }

    @Override
    public Iterator iterator() {
        return new BagIterator();
    }

    private class BagIterator implements Iterator {
        // Start on the first node.
        private Node current = firstNode;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if (!hasNext())
                throw new NoSuchElementException();
            T item = current.item;
            current = current.next;
            return item;
        }
    }
}
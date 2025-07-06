// Dylan Nelson
// February 22, 2025
// SelectionSort.java

/* This file takes in an array of Student object type and a Comparator of Student object type and sorts them. 
 * The method will then call the compare method associated with the input comparator to sort the list of Students
 * by either the roll number or name (Dependant upon which comparator was provided to the method.)
 */

import java.util.ArrayList;
import java.util.Comparator;

public class SelectionSort {

    public ArrayList<Student> selectionSorter(ArrayList<Student> studentList, Comparator<Student> comparator) {
        
        // Here we get a variable that tracks the size of the array, this is so that we can run through the 
        //  appropriate number of iterations on the for loop.
        int length = studentList.size();

        // Here we create a nested for loop, this will allow us to edit the contents of the array for each element within.
        for (int i = 0; i < length -1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                // Calls the compare function from the comparator that was passed into the selectionSorter method.
                //  it will return an integer value that is either above or below 0, if its below zero then minIndex
                //  is updated with the new value.
                if (comparator.compare(studentList.get(j), studentList.get(minIndex)) < 0)  {
                    minIndex = j;
                }
            }

            // Here the value that is designated to be the smallest value is inserted into the 
            Student switcherVariable = studentList.get(minIndex);
            studentList.set(minIndex, studentList.get(i));
            studentList.set(i, switcherVariable);
        }
        
        // Return the list that was sorted.
        return studentList;
    }
}
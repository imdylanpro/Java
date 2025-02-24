// Dylan Nelson
// February 23, 2025
// RollNoComparator.java

/* This class will compare two Student objects attributes of rollno and return either a positive integer
 * or negative integer depending on if one is greater than the other; this is used to compare the objects.
 */

import java.util.Comparator;

public class RollNoComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        // Compares the two parameters brought in and either returns a positive or negative integer.
        return Integer.compare(student1.getRollNo(), student2.getRollNo());  
    }
}
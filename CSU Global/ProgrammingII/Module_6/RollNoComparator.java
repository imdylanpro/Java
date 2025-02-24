// Dylan Nelson
// February 23, 2025
// RollNoComparator.java

import java.util.Comparator;

public class RollNoComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        // Compares the two parameters brought in and either returns a positive or negative integer.
        return Integer.compare(student1.getRollNo(), student2.getRollNo());  
    }
}
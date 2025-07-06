// Dylan Nelson
// February 23, 2025
// NameComparator.java

<<<<<<< HEAD
=======
/* This class will compare two Student objects attributes of name and return either a positive integer
 * or negative integer depending on if one is greater than the other; this is used to compare the objects.
 */

>>>>>>> 6ea6102ee9f5293c9a371ecbc0f0ed525e305786
import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        // Compares the two parameters brought in and either returns a positive or negative integer.
        return student1.getName().compareTo(student2.getName());
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 6ea6102ee9f5293c9a371ecbc0f0ed525e305786

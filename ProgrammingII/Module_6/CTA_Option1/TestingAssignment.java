// Dylan Nelson
// February 22, 2025
// TestingAssignment.java

<<<<<<< HEAD
=======
/* This file will test the functionality of SelectionSort.java, RollNoComparator.java, NameComparator.java, and Student.Java.
 * 10 objects are created of type Student, then they are printed out in the order they were stored into the studentArray.
 * Next the array of 10 student  objects is sorted by their roll number using the RollNoComparator.java and SelectionSort.java
 * classes. 
 */

>>>>>>> 6ea6102ee9f5293c9a371ecbc0f0ed525e305786
import java.util.ArrayList;

public class TestingAssignment {
    public static void main(String[] args) {
        // Create the variables that will be used for the student objects.
        Student student1, student2, student3, student4, student5, student6, 
        student7, student8, student9, student10;
        
        // Create the array list that will house the student objects.
        ArrayList<Student> studentArray = new ArrayList<>();

        // Create variables that cane allow us to enact the methods created from the other classes.
        SelectionSort selectionShorter = new SelectionSort();
        RollNoComparator rollNoCompare = new RollNoComparator();
        NameComparator nameCompare = new NameComparator();

<<<<<<< HEAD
        // Create the students with individual attributes for rollno, name, and
        //  address.
=======
        // Create the students with individual attributes for rollno, name, and address.
>>>>>>> 6ea6102ee9f5293c9a371ecbc0f0ed525e305786
        studentArray.add(student1 = new Student(1, "Dylan", "123 Street"));
        studentArray.add(student2 = new Student(3, "Mark", "456 Lane"));
        studentArray.add(student3 = new Student(5, "James", "789 Drive"));
        studentArray.add(student4 = new Student(2, "Briana", "124 Blvd"));
        studentArray.add(student5 = new Student(6, "Lyssa", "786 Alley"));
        studentArray.add(student6 = new Student(7, "Tyson", "763 Valley"));
        studentArray.add(student7 = new Student(8, "Calvin", "866 Court"));
        studentArray.add(student8 = new Student(10, "Ian", "434 Peninsula"));
        studentArray.add(student9 = new Student(4, "Devon", "964 Archipeligo"));
        studentArray.add(student10 = new Student(9, "Emy", "523 Cape"));

        // For each element present in the studentArray print out the rollno, 
        //  name, and address.
        System.out.println("Original List");
        for (Student student: studentArray) {
            System.out.print("Name: " + student.getName());
            System.out.print(" | Roll No: " + student.getRollNo());
            System.out.println(" | Address: " + student.getAddress());
        }

        // Prints out the list sorted by roll number, passing in the studentArray and rollNoCompare.
        System.out.println("Student list sorted by roll number.");
        studentArray = selectionShorter.selectionSorter(studentArray, rollNoCompare);
        for (Student student: studentArray) {
            System.out.print("Name: " + student.getName());
            System.out.print(" | Roll No: " + student.getRollNo());
            System.out.println(" | Address: " + student.getAddress());
        }

        // Prints out the list sorted by name, passing in the studentArray and the nameCompare.
        System.out.println("Student list sorted by name.");
        ArrayList<Student> namesortedArray = selectionShorter.selectionSorter(studentArray, nameCompare);
        for (Student student: namesortedArray) {
            System.out.print("Name: " + student.getName());
            System.out.print(" | Roll No: " + student.getRollNo());
            System.out.println(" | Address: " + student.getAddress());

        }
    }
}

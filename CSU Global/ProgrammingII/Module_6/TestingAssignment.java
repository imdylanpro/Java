// Dylan Nelson
// February 22, 2025
// TestingAssignment.java

import java.util.ArrayList;

public class TestingAssignment {
    public static void main(String[] args) {
        // Create the variables that will be used for the student objects.
        Student student1, student2, student3, student4, student5, student6, 
        student7, student8, student9, student10, student11;
        
        // Create the array list that will house the student objects.
        ArrayList<Student> studentArray = new ArrayList<>();

        // Create the students with individual attributes for rollno, name, and
        //  address.
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
        studentArray.add(student11 = new Student(11, "Polo", "456 Candy Ln"));

        // For each element present in the studentArray print out the rollno, 
        //  name, and address.
        for (Student student: studentArray) {
            System.out.println("-----");
            System.out.println("Name: " + student.getName());
            System.out.println("Roll no: " + student.getRollNo());
            System.out.println("Address: " + student.getAddress());
            System.out.println("-----");
        }
    }
}

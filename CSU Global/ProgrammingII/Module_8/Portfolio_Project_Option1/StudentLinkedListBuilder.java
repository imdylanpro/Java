// Dylan Nelson
// March 05, 2025
// StudentLinkedListBuilder.java

/* This script will build a LinkedList of Student objects then return the list.  */

import java.util.LinkedList;
import java.util.Scanner;

public class StudentLinkedListBuilder {
    
    public LinkedList<Student> ListBuilder(String promptAnswer, 
    Scanner myScanner, LinkedList<Student> myStudentList) {
        
        String studentName;
        String studentAddress;
        double studentGPA;
        
        // While loop for the program. Will gather information about students.
        while (promptAnswer.equals("Y")) {
                    
            // Gather the name, address, and GPA of the student.
            System.out.print("What is the name of your student? ");
            studentName = myScanner.nextLine();
            System.out.print("What is the address of this student? ");
            studentAddress = myScanner.nextLine();
            System.out.print("What is the student's GPA? ");
            studentGPA = myScanner.nextDouble();

            // Here is where the student object is created./
            Student myStudent = new Student(studentName, studentAddress, 
            studentGPA);
            // Now the student object is added to the linked list.
            myStudentList.add(myStudent);
            // Let the user know that they just added a new student.
            System.out.print("You just added a new student. ");
            // Use the toString method that was built into the student object.
            System.out.println(myStudent.toString());
            
            // This is a Scanner next line that clears the buffer of a new line
            //  that was generated.
            myScanner.nextLine();

            // Here the conditional for the while loop is checked, allowing for
            //  additional students to be added.
            System.out.print("Would you like to enter information for " +
            "another student? (Y/N) ");
            promptAnswer = myScanner.nextLine().toUpperCase();
        }   

        return myStudentList;
    }
}

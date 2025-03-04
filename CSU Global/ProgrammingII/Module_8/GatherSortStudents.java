// Dylan Nelson
// March 04, 2025
// GatherSortStudents.java

import java.util.LinkedList;
import java.util.Scanner;

public class GatherSortStudents {
    
    public static void addtoLinkedList(Student myStudent, 
    LinkedList<Student> myStudentList) {
        myStudentList.add(myStudent);
    }

    public static void main(String[] arg) {

        Scanner myScanner = new Scanner(System.in);
        String promptAnswer;
        String studentName;
        String studentAddress;
        double studentGPA;
        LinkedList<Student> myStudentList = new LinkedList<Student>();

        System.out.print("Would you like to log your student's " +
        "information? (Y/N): ");
        promptAnswer = myScanner.nextLine().toUpperCase();

        System.out.println("You entered: " + promptAnswer);

        while (promptAnswer.equals("Y")) {
            System.out.print("What is the name of your student? ");
            studentName = myScanner.nextLine();
            System.out.print("What is the address of this student? ");
            studentAddress = myScanner.nextLine();
            System.out.print("What is the student's GPA? ");
            studentGPA = myScanner.nextDouble();

            Student myStudent = new Student(studentName, studentAddress, 
            studentGPA);
            addtoLinkedList(myStudent, myStudentList);
            System.out.print("You just added a new student. ");
            System.out.println(myStudent.toString());
            

            myScanner.nextLine();

            System.out.print("Would you like to enter information for " +
            "another student? (Y/N) ");
            promptAnswer = myScanner.nextLine().toUpperCase();
            System.out.println(promptAnswer);
        }
        
        myScanner.close();
        System.out.println("End Program.");
    } 
}

// Dylan Nelson
// March 04, 2025
// GatherSortStudents.java

import java.util.LinkedList;
import java.util.Scanner;

import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class GatherSortStudents {
    
    public static void addtoLinkedList(Student myStudent, 
    LinkedList<Student> myStudentList) {
        myStudentList.add(myStudent);
    }

    public static void printList(LinkedList<Student> myStudentList) {
        int length = myStudentList.size();

        for (int i = 0; i < length; i++) {
            System.out.print(String.format("%-15s", "Student " + 
                            (i+1) + ": "));
            System.out.print(String.format("%-20s", " | Name: " + 
                            myStudentList.get(i).getName()));
            System.out.print(String.format("%-30s", " | Address: " + 
                            myStudentList.get(i).getAddress()));
            System.out.println(String.format("%-15s"," | GPA: " + 
                            myStudentList.get(i).getGPA()));
        }
    }

    // public static void saveListToFile(LinkedList<Student> myStudentList) {
        
    //     FileOutputStream fileByteStream = new FileOutputStream("Student_Log_File.txt");
    //     PrintWriter outFS = new PrintWriter(fileByteStream);

    //     int length = myStudentList.size();

    //     for (int i = 0; i < length; i++) {
    //         outFS.print(String.format("%-15s", "Student " + 
    //                         (i+1) + ": "));
    //         outFS.print(String.format("%-20s", " | Name: " + 
    //                         myStudentList.get(i).getName()));
    //         outFS.print(String.format("%-30s", " | Address: " + 
    //                         myStudentList.get(i).getAddress()));
    //         outFS.println(String.format("%-15s"," | GPA: " + 
    //                         myStudentList.get(i).getGPA()));
    //     }

    //     fileByteStream.close();
    // }

    public static void main(String[] arg) {

        String promptAnswer;
        String studentName;
        String studentAddress;
        double studentGPA;

        Scanner myScanner = new Scanner(System.in);
        LinkedList<Student> myStudentList = new LinkedList<Student>();
        SelectionSort mySelectionSort = new SelectionSort();
        NameComparator nameComparer = new NameComparator();
        LinkedList<Student> myNameSortedStudentList = new LinkedList<Student>();

        System.out.print("Would you like to log your student's " +
        "information? (Y/N): ");
        promptAnswer = myScanner.nextLine().toUpperCase();

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
        }
        
        myScanner.close();

        System.out.println("Original list contents: ");
        printList(myStudentList);

        System.out.println("List Contents when sorted by name:");
        myNameSortedStudentList = mySelectionSort.selectionSorter(
            myStudentList, nameComparer);
        printList(myNameSortedStudentList);

        // saveListToFile(myNameSortedStudentList);

        System.out.println("End Program.");
    } 
}

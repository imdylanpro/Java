// Dylan Nelson
// March 04, 2025
// GatherSortStudents.java

/* This script is the main test class for the Portfolio Project. It will allow the
 * user to input names, addresses, and GPAs for as many Students as they like. It 
 * will then print out the list as they were input. Next it will sort the list by '
 * name and print out the list again. Additionally, it will save a version of the 
 * sorted list into a text file within the same directory as this file called: 
 * "Student_Log_File.txt".
 */

import java.util.LinkedList;
import java.util.Scanner;

public class GatherSortStudents {

    public static void main(String[] arg) {

        // Create the variables that will be used throughout the program.
        String promptAnswer;

        // Create the objects that will be used throughout the program.
        Scanner myScanner = new Scanner(System.in);
        LinkedList<Student> myStudentList = new LinkedList<Student>();
        LinkedList<Student> myNameSortedStudentList = new LinkedList<Student>();

        // These objects are instances of the other files in this project.
        SelectionSort mySelectionSort = new SelectionSort();
        NameComparator nameComparer = new NameComparator();
        ArrayHandler myArrayHandler = new ArrayHandler();
        StudentLinkedListBuilder myBuilder = new StudentLinkedListBuilder();

        // The first prompt for the user. Asking if they want to log student
        //  information.
        System.out.print("Would you like to log your student's " +
        "information? (Y/N): ");
        // This line reads the input from the user and converts it to upper 
        //  case so that both lower and upper case "y" / "Y" will work.
        promptAnswer = myScanner.nextLine().toUpperCase();

        // Assign myStudentList through utilizing the myBuilder object.
        myStudentList = myBuilder.ListBuilder(promptAnswer, myScanner, myStudentList);
        
        // Close the scanner so there is no memory leak issues.
        myScanner.close();

        // Report the contents of the original list of students before they are
        //  sorted.
        System.out.println("Original list contents: ");
        myArrayHandler.printList(myStudentList);

        // Report the contents of the list after it has been sorted.
        System.out.println("List Contents when sorted by name:");
        // Use the second linked list variable that was created above to save the
        //  sorted linked list into.
        myNameSortedStudentList = mySelectionSort.selectionSorter(
            myStudentList, nameComparer);
        myArrayHandler.printList(myNameSortedStudentList);

        // Save the file into a text document.
        myArrayHandler.saveListToFile(myNameSortedStudentList);

        // Let the user know that the program is at its end.
        System.out.println("End Program.");
    } 
}

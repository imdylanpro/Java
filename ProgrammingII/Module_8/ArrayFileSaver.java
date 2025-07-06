// Dylan Nelson
// March 04, 2025
// ArrayFileSaver.java

/* This java program will accept a linked list and filepath input. 
 * The list will then be saved to a filepath.
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

class ArrayFileSaver {

    public void saveListToFile(LinkedList<Student> myStudentList) {
        
        // Create a variable that is the length of the linked list.
        int length = myStudentList.size();

        try (FileOutputStream fileByteStream = new FileOutputStream("Student_Log_File.txt")) {
        
            PrintWriter outFS = new PrintWriter(fileByteStream);
            
            for (int i = 0; i < length; i++) {
                outFS.print(String.format("%-15s", "Student " + 
                                (i+1) + ": "));
                outFS.print(String.format("%-20s", " | Name: " + 
                                myStudentList.get(i).getName()));
                outFS.print(String.format("%-40s", " | Address: " + 
                                myStudentList.get(i).getAddress()));
                outFS.println(String.format("%-15s"," | GPA: " + 
                                myStudentList.get(i).getGPA()));
                outFS.flush();
            }
    
            fileByteStream.close();
        } catch (IOException e) {
            System.out.println("An error occurred while trying to create the file: " + e.getMessage());
        }
    }
}
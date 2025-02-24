// Dylan Nelson
// February 22, 2025
// Student.java

/* Creates a class of type Student that will allow for rollno, name, and address attributes to be created.
 * The Student class will have getter and setter methods for the attributes. This student class will be used in
 * conjunction with TestingAssignment.java, SelectionSort.java, RollNoComparator.java, and nameComparator.java.
 */

public class Student {
    private int rollNo;
    private String name;
    private String address;

    public Student(int rollNo, String name, String address) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    // Define the getter methods.
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    } 

    // Define the setter methods.
    public void setRollNo(int inputRollNo) {
        this.rollNo = inputRollNo;
    }

    public void setName(String inputName) {
        this.name = inputName;
    }

    public void setAddress(String inputAddress) {
        this.address = inputAddress;
    }
}

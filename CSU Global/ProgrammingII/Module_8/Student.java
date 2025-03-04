// Dylan Nelson
// February 27, 2025
// Student.java

/* This class file will hold the Student class. This class will have three 
 * attributes: String name, String address, and a double GPA. This class will 
 * have the standard setter, getter, and toString methods. 
 */

public class Student {

    // Create the variables for the constructor method.
    private String name;
    private String address;
    private double GPA;

    // This is the constructor method.
    public Student(String name, String address, double GPA) {
        this.name = name;
        this.address = address;
        this.GPA = GPA;
    }

    // Getter methods.
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getGPA() {
        return GPA;
    }

    // Setter methods.
    public void setName(String nametoSet) {
        this.name = nametoSet;
    }

    public void setAddress(String addresstoSet) {
        this.address = addresstoSet;
    }

    public void setGPA(double GPAtoset) {
        this.GPA = GPAtoset;
    }

    // toString method.
    public String toString() {
        return "The students name is" + name + ". Their address is " + address
        + ". And their GPA is " + GPA + ".";
    }
}

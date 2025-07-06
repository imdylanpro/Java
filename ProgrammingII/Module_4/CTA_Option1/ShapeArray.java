// Dylan Nelson
// February 09, 2025
// ShapeArray.java

/* This script is designed to make use of Shape.java, Sphere.java, Cylinder.java,
 * and Cone.java to show the use of abstract classes with concrete classes.
 */

import java.util.ArrayList;

public class ShapeArray {
    public static void main(String[] args) {

        // Create an array so the shapes can be added to it.
        ArrayList<Shape> shapeArray = new ArrayList<Shape>();

        // Here is where the shapes are created and immediately added to the array.
        Sphere sphere1 = new Sphere(1.0);
        shapeArray.add(sphere1);
        Cylinder cylinder1 = new Cylinder(2.0, 1.0);
        shapeArray.add(cylinder1);
        Cone cone1 = new Cone(3.0, 1.0);
        shapeArray.add(cone1);

        // Utilize a for loop for the contents of the array.
        for (Shape shape : shapeArray) {
            System.out.println(shape.toString()); 
        }

    }
}

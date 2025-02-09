// Dylan Nelson
// February 08, 2025
// Cylinder.java

/* This class defines the Cylinder object, which extends the Shape class.
 * The Sphere object overrides surfaceArea and volume methods from Shape. 
 * It also overrides the toString method. Cylinder has two attributes 
 * radius and height of type double. 
 */

public class Cylinder extends Shape {

    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double surfaceArea() {
        // The formula for the surface area of a cylinder is sa = 2πr(r+h)
        return (2*Math.PI*radius*(radius + height));
    }

    @Override
    public double volume() {
        // The formula for the volume of a cylinder is v = π(r^2)h
        return (Math.PI*Math.pow(radius,2)*height);
    }

    @Override
    public String toString() {
        // Print out the relevant information for the cylinder.
        return "The cylinder has a surface area of " + surfaceArea() + ". It has a volume of " + volume() + ".";
    }
}

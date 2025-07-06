// Dylan Nelson
// February 08, 2025
// Sphere.java

/* This class defines the Sphere object, which extends the Shape class.
 * The Sphere object overrides surfaceArea and volume methods from Shape. 
 * It also overrides the toString method. Sphere has one attribute
 * radius of type double. 
 */

public class Sphere extends Shape {

    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double surfaceArea() {
        // The formula for surface area of a sphere is sa = 4πr^2
        return (4*Math.PI*Math.pow(radius, 2));
    }

    @Override
    public double volume() {
        // The formula for volume of a sphere is v = (4/3)πr^3
        return ((4.0/3)*Math.PI*Math.pow(radius, 3));
    }

    @Override
    public String toString() {
        // Print out the relevant information for the sphere.
        return "The sphere has a surface area of " + surfaceArea() + ". It has a volume of " + volume() + ".";
    }
}

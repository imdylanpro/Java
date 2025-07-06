// Dylan Nelson
// February 08, 2025
// Cone.java

/* This class defines the Cone object, which extends the Shape class.
 * The Sphere object overrides surfaceArea and volume methods from Shape. 
 * It also overrides the toString method. Cone has two attributes 
 * radius and height of type double. 
 */

public class Cone extends Shape {

    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double surfaceArea() {
        // The surface area formula for a cone is sa = π(r^2)+πr√((r^2)+(h^2))
        return (Math.PI*Math.pow(radius,2)+Math.PI*radius*Math.sqrt(Math.pow(radius,2) + Math.pow(height,2)));
    }

    @Override
    public double volume() {
        // The formula for volume of a cone is v = (1/3)π(r^2)h
        return ((1.0/3)*Math.PI*Math.pow(radius,2)*height);
    }

    @Override
    public String toString() {
        // Print out the relevant information for the cone.
        return "The cone has a surface area of " + surfaceArea() + ". It has a volume of " + volume() + ".";
    }
}

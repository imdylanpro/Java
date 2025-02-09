// Dylan Nelson
// February 08, 2025
// Shape.java

/* This class will create an abstract class of Shape
* that will be used to built other shapes. The shapes 
* built will be cylinder and cone.
*/

public abstract class Shape {

    // Here the two abstract methods are defined, this causes any 
    //  subclass to require the creation of these methods. 
    protected abstract double surfaceArea();
    protected abstract double volume();
 
}

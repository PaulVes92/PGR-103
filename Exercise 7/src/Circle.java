/*
* The circle class is a child class of shape
*/

public class Circle extends Shape{

    // Private instance variable, not accessible from outside classes
    private double radius;

    // The default constructor with no argument
    // Calls the constructor from the super class for color and filled (constructor chaining)
    // It sets the radius directly to default value
    Circle(){
        super();
        radius = 1.0;
    }

    // 2nd constructor with given radius, but color and filled default
    Circle(double radius){
        super();
        // This indicates its the object radius not the methods one!
        this.radius = radius;
    }

    //3rd constructor with given radius, color and filled
    Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    // A public method for retrieving the radius
    public double getRadius(){
        return radius;
    }
    // Setter for instance variable radius
    public void setRadius(double radius){
        this.radius = radius;
    }
    // A public method for computing the area of a circle
    public double getArea(){
        return (radius*radius)*Math.PI;
    }
    // A public method for computing the perimeter of a circle
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    // Return a description of this instance in the form
    // A circle with the radius=xxx, which is the subclass of yyy
    public String toString(){
        return "A circle with radius = "+ radius + ", which is the subclass og " + super.toString();
    }


}

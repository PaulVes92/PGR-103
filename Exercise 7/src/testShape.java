public class testShape {

    // Test the shape class and its child classes

    public static void main(String[] args) {

        // Create a simple shape object for testing
        Shape s1 = new shape();
        System.out.println(s1.toString());

        // Change color and filled of the shape object
        s1.setColor("blue");
        s1.setFilled(false);

        // Test the toString method of the shape object
        System.out.println(s1.toString());
        System.out.println(); // Adding some space

        // Test the circle child class
        // Test the different constructors
        Circle c1 = new Circle(2.2);
        Circle c2 = new Circle(2.3, "yellow", true);
        Circle c3 = new Circle();

        // Print tree created circles
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());

        // Test the getArea and getPerimeter methods
        System.out.println("Area is: "+r2.getArea()+" Perimeter is: "+r2.getPerimeter());
        System.out.println(); //just adding some space


        // Test the square child class of rectangle
        // Test the three constructors
    }
}

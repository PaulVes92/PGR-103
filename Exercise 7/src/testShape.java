public class testShape {

    // Test the shape class and its child classes

    public static void main(String[] args) {

        // Create a simple shape object for testing
        Shape s1 = new Shape();
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
        System.out.println("Radius is: "+c2.getRadius()+" Area is:  "+c2.getArea()+" Perimeter is: "+c2.getPerimeter());
        System.out.println(); //just adding some space


        // Test the square child class of rectangle
        // Test the three constructors
        Rectangle r1 = new Rectangle(2.2,2.2);
        Rectangle r2 = new Rectangle(2.3,2.3,"yellow",false);
        Rectangle r3 = new Rectangle();

        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r3.toString());

        System.out.println("Area is: "+r2.getArea()+"Perimeter is: "+r2.getPerimeter());
        System.out.println();

        Square sq1 = new Square((5.0));
        Square sq2 = new Square(10.0,"yellow",false);
        Square sq3 = new Square();

        System.out.println(sq1.toString());
        System.out.println(sq2.toString());
        System.out.println(sq3.toString());

        System.out.println("Area is: "+sq2.getArea()+" Perimeter is: "+sq2.getPerimeter());;

    }
}

public class Rectangle extends Shape {

    private double width;
    private double length;

    Rectangle(){
        super();
    }

    Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return length*width;
    }

    public double getPerimeter(){
        return 2*(length*width);
    }

    public String toString(){
        return "A rectangle with width = " + width + " and length = " + length + ", which is subclass of " + super.toString();
    }
}

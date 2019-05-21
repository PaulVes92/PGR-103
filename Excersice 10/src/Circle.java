public class Circle extends Shape {
    protected double radius;

    public Circle(){
        super();
        radius = 1.0;
    }

    public Circle(double radius){
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return (radius*radius)*Math.PI;
    }

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    public String toString(){
        return "A circle with radius = "+ radius +
                ", which is the subclass of "+ super.toString();
    }
}

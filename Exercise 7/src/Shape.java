public class Shape {

    private String color;
    private boolean filled;

    Shape(){
        this.color = "red";
        this.filled = true;
    }

    Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public getColor(){
        return String;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public isFilled(){
        return boolean;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        String s;
        if(this.isFilled()==true)
            return "A shape with the color of " + color + " and filled.";
        else return "A shape with the color of " + color + " and not filled.";
    }
}

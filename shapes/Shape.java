package shapes;

// abstract base class for all shapes
public abstract class Shape {

    private String color;
    private boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // every shape must give its own area and perimeter
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        String f;
        if (filled) {
            f = "Yes";
        } else {
            f = "No";
        }
        return "Color : "+color+"\n"+"Filled: " + f;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String c) {
        this.color = c;
    }

    public void setFilled(boolean f) {
        this.filled = f;
    }
}

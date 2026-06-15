package shapes;

public class Circle extends Shape {

    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        // circumference = 2 * pi * r
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        String out = "[ Circle ]\n";
        out = out+super.toString()+"\n";
        out = out+"Radius: "+radius+"\n";
        out = out + String.format("Area         : %.2f", getArea()) + "\n";
        out = out + String.format("Circumference: %.2f", getPerimeter());
        return out;
    }

    public double getRadius() {
        return radius;
    }
}

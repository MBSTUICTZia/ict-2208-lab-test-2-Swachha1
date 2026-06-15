package shapes;

public class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        String out = "[ Rectangle ]\n";
        out = out + super.toString() + "\n";
        out = out + "Width : " + width + "\n";
        out = out + "Length: " + length + "\n";
        out = out + String.format("Area      : %.2f", getArea()) + "\n";
        out = out + String.format("Perimeter : %.2f", getPerimeter());
        return out;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
}

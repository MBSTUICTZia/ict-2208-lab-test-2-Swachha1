package shapes;

import java.util.Scanner;

public class ShapeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // read how many shapes
        int n = Integer.parseInt(sc.nextLine().trim());

        // make the array
        Shape[] shapes = new Shape[n];

        // read each shape one by one
        for (int i = 0; i < n; i++) {

            String type = sc.nextLine().trim();

            // color and filled are on the same line
            String line = sc.nextLine().trim();
            String[] parts = line.split("\\s+");
            String color = parts[0];
            boolean filled = Boolean.parseBoolean(parts[1]);

            if (type.equals("RECTANGLE")) {
                String[] dims = sc.nextLine().trim().split("\\s+");
                double w = Double.parseDouble(dims[0]);
                double l = Double.parseDouble(dims[1]);
                shapes[i] = new Rectangle(color, filled, w, l);
            }
            else if (type.equals("CIRCLE")) {
                double r = Double.parseDouble(sc.nextLine().trim());
                shapes[i] = new Circle(color, filled, r);
            }
        }

        // print all shapes
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
            System.out.println();
        }

        // downcast part
        System.out.println("--- Downcast Check ---");
        for (int i = 0; i < shapes.length; i++) {
            Shape s = shapes[i];
            if (s instanceof Rectangle) {
                Rectangle r = (Rectangle) s;
                System.out.println("Rectangle width=" + r.getWidth() + " length=" + r.getLength());
            }
            else if (s instanceof Circle) {
                Circle c = (Circle) s;
                System.out.println("Circle radius=" + c.getRadius());
            }
        }

        // Task 6:
        // If we write Shape s = new Shape("Red", true);
        // the compiler shows: error: Shape is abstract; cannot be instantiated
        // Because an abstract class cannot be created with new. Only Rectangle
        // and Circle (the child classes) can be created.

        sc.close();
    }
}

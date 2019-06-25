package sci.inheritance;

public class Circle extends Shape {
    private final double radius;
    final double pi = Math.PI;

    public Circle() {
        this(1);
        this.name="circle";

    }
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        // A = π r^2
        return pi * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        // P = 2πr
        return 2 * pi * radius;
    }

    @Override
    public String displayShape() {
        return "Circle";
    }
}
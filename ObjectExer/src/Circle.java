import java.util.Objects;

public class Circle extends GeometricObject{
    private double radius;

    public Circle() {
        super("white", 1.0);
        this.radius = 1.0;
    }

    public Circle(double radius) {
        super("white", 1.0);
        this.radius = radius;
    }

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Circle) {
            return this.radius == ((Circle) o).radius;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Circle[" + this.radius + "]";
    }
}

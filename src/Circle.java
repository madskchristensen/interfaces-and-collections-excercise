import java.math.*;

public class Circle implements GeometricShape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "\t○ " + "[R: " + radius + "]" + " = [A: " + getArea() + "]";
    }
}

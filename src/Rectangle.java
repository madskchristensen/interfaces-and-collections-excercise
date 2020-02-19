public class Rectangle implements GeometricShape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "\t▭ " + "[W: " + width + "] [H: " + height + "]" + " = [A: " + getArea() + "]";
    }
}

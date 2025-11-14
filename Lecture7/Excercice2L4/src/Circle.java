public class Circle implements TwoDimensionalShape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius*radius*Math.PI;
    }

    @Override
    public double perimetar() {
        return 2*radius*Math.PI;
    }
}

public class Cube implements ThreeDimensionalShape{
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double volume() {
        return side*side*side;
    }

    @Override
    public double area() {
        return 6*side*side;
    }
}

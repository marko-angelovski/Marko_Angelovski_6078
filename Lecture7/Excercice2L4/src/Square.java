public class Square implements TwoDimensionalShape{
    private  double side;
    @Override
    public double area() {
        return side*side;
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double perimetar() {
        return 4*side;
    }
}

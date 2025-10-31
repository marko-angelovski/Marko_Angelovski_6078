public class Cookie {
    double weight;
    String shape;


    public Cookie(double weight, String shape) {
        this.weight = weight;
        this.shape = shape;
    }
    void print(){
        System.out.println("Weight: " + weight);
        System.out.println("Shape: " + shape);
    }
}

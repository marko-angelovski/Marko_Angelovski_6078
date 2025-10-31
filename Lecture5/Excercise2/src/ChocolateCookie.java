public class  ChocolateCookie extends Cookie {
    int percentageChocolate;

    public ChocolateCookie(double weight, String shape, int percentageChocolate) {
        super(weight, shape);
        this.percentageChocolate = percentageChocolate;
    }

    @Override
    void print() {
        super.print();
        System.out.println("Percentage Chocolate: " + percentageChocolate +"% ");
    }
}

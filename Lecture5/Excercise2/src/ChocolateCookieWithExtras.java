public class ChocolateCookieWithExtras extends ChocolateCookie{
    String extras;

    public ChocolateCookieWithExtras(double weight, String shape, int percentageChocolate, String extras) {
        super(weight, shape, percentageChocolate);
        this.extras = extras;
    }

    @Override
    void print() {
        super.print();
        System.out.println("Extras: " + extras);
    }
}

public class Lion implements Animal
{

    @Override
    public void sound() {
        System.out.println("Lion makes ROAR!");
    }

    @Override
    public void move() {
        System.out.println("Lion moves slowly through savana!");

    }

    @Override
    public void sleep() {
        System.out.println("Lion Sleeps");

    }
}

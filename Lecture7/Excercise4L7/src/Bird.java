public class Bird implements Animal{

    @Override
    public void sound() {
        System.out.println("Bird Chirps!");
    }

    @Override
    public void move() {
        System.out.println("The bird flies!");

    }

    @Override
    public void sleep() {
        System.out.println("The bird sleeps in the nest!");

    }
}

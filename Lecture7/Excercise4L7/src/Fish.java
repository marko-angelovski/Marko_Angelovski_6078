public class Fish implements Animal{
    @Override
    public void sound() {
        System.out.println("Fish bubbling!");
    }

    @Override
    public void move() {
        System.out.println("Swimming through water!");

    }

    @Override
    public void sleep() {
        System.out.println("The fish sleeps!");

    }
}

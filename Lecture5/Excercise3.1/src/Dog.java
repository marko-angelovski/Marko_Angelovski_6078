public class Dog extends Animal{
    @Override
    void onomatopoeia() {
        System.out.println("Woof");
    }

    public Dog(String name) {
        super(name);
    }
}
